package com.lh.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lh.entity.MsRoom;
import com.lh.entity.MsRoomExample;
import com.lh.entity.MsUser;
import com.lh.mapper.MsRoomMapper;
import com.lh.service.MsRoomService;
import com.lh.utils.R;
import com.lh.utils.StringUtil;
import com.lh.utils.UpLoad;
import com.lh.utils.ShiroUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class MsRoomServiceImpl implements MsRoomService {
    @Resource
    private MsRoomMapper msRoomMapper;

    @Override
    public R insert(MsRoom room) {
        int i = msRoomMapper.insert(room);
        return i>0?R.ok():R.error("发布失败");
    }

    @Override
    public R update(MsRoom room) {
        try {
            String img = msRoomMapper.selectByPrimaryKey(room.getRoomid()).getRoomimg();
            int i = msRoomMapper.updateByPrimaryKey(room);
            UpLoad upLoad = new UpLoad();
            String filename = img.substring(img.lastIndexOf("M00"));
            if (i>0) {
                if (upLoad.deleteFile(filename)==0)return R.ok();
                else throw new Exception("修改失败");
            } else R.error("修改失败");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return R.error("修改失败");
    }

    @Override
    public R addHouse(long userId) {
        MsRoomExample example = new MsRoomExample();
        MsRoomExample.Criteria criteria = example.createCriteria();
        criteria.andUseridEqualTo(userId);
        List<MsRoom> list = msRoomMapper.selectByExample(example);
        return list!=null?R.ok().put("data",list):R.error("未发布房源");
    }

    @Override
    public R findById(int pageNum, int pageSize) {

        PageHelper.startPage(pageNum,pageSize);
        MsRoomExample example = new MsRoomExample();
        MsUser user = (MsUser) ShiroUtils.getCurrentUser();
        MsRoomExample.Criteria criteria = example.createCriteria();
        criteria.andUseridEqualTo(user.getUserid());
        List<MsRoom> rooms = msRoomMapper.selectByExample(example);
        PageInfo info = new PageInfo(rooms);

        return R.ok().put("data",info);
    }

    @Override
    public R room(int pageNum, int pageSize) {

        if(pageNum == 0){ pageNum=0; }
        if(pageSize == 0){ pageSize=4; }
        PageHelper.startPage(pageNum,pageSize);
        MsRoomExample example = new MsRoomExample();
        MsRoomExample.Criteria criteria = example.createCriteria();

        criteria.andAddressLike("北京");
        List<MsRoom> bj = msRoomMapper.selectByExample(example);
        PageInfo<MsRoom> info = new PageInfo<>(bj);


        criteria.andAddressLike("上海");
        List<MsRoom> sh = msRoomMapper.selectByExample(example);
        PageInfo<MsRoom> info1 = new PageInfo<>(bj);



        criteria.andAddressLike("广州");
        List<MsRoom> gz = msRoomMapper.selectByExample(example);
        PageInfo<MsRoom> info2 = new PageInfo<>(bj);


        criteria.andAddressLike("成都");
        List<MsRoom> cd = msRoomMapper.selectByExample(example);
        PageInfo<MsRoom> info3 = new PageInfo<>(bj);


        Map<String,Object> map = new HashMap<>();

        map.put("bj",info);
        map.put("sh",info1);
        map.put("gz",info2);
        map.put("cd",info3);

        return R.ok().put("data",map);
    }

    @Override
    public R delete(long roomId) {
        int i = msRoomMapper.deleteByPrimaryKey(roomId);
        if(i==0){ return R.error("删除失败"); }
        return R.ok();
    }

    @Override
    public R updateRoom(MsRoom msRoom) {
        int i = msRoomMapper.updateByPrimaryKeySelective(msRoom);
        if(i==0){ return R.error("修改失败"); }
        return R.ok();
    }

    @Override
    public R houseInfo(long roomId) {
        MsRoom msRoom = msRoomMapper.selectByPrimaryKey(roomId);
        System.out.println(msRoom);
        return msRoom!=null?R.ok().put("data",msRoom):R.error("查看失败");
    }

    @Override
    public R selectHouseCollect(PageInfo pageInfo) {
        PageHelper.startPage(pageInfo.getPageNum(),pageInfo.getPageSize());
        MsUser user=(MsUser) ShiroUtils.getCurrentUser();
        List<MsRoom> rooms = msRoomMapper.selectHouseCollect(user.getUserid());
        PageInfo info=new PageInfo(rooms);
        return R.ok().put("data",info);
    }

    @Override
    public R allList(int pageNum,int pageSize,String range,String sort,String order,MsRoom msRoom) {

        PageHelper.startPage(pageNum,pageSize);
        MsRoomExample example=new MsRoomExample();
        MsRoomExample.Criteria criteria = example.createCriteria();

        //地址
        if(StringUtil.isNotEmpty(msRoom.getAddress())){ criteria.andAddressLike(msRoom.getAddress()); }

        //价格
        if(StringUtil.isNotEmpty(range)){
            String[] ss = range.split("-");
            criteria.andPriceBetween(new BigDecimal(ss[0]),new BigDecimal(ss[1]) );
        }
        //户型
        if(StringUtil.isNotEmpty(msRoom.getDoormodel())){ criteria.andDoormodelEqualTo(msRoom.getDoormodel()); }

        //房型
        if(StringUtil.isNotEmpty(msRoom.getType())){ criteria.andTypeEqualTo(msRoom.getType()); }

        //位置
        if(StringUtil.isNotEmpty(msRoom.getAreasnear())){ criteria.andAreasnearEqualTo(msRoom.getAreasnear()); }

        //条件查询
        // 降序、升序排列
        if(sort!=null&&sort.equals(1)){
            sort = "1";
            example.setOrderByClause(sort+" "+order);
        }
        List<MsRoom> list1 = msRoomMapper.selectByExample(example);
        PageInfo pageInfo=new PageInfo(list1);
        return R.ok().put("data",pageInfo);

    }
}
