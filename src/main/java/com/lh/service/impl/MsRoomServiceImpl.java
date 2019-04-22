package com.lh.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lh.entity.MsRoom;
import com.lh.entity.MsRoomExample;
import com.lh.entity.MsUser;
import com.lh.mapper.MsRoomMapper;
import com.lh.service.MsRoomService;
import com.lh.utils.R;
import com.lh.utils.UpLoad;
import com.lh.utils.ShiroUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
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
    public List<MsRoom> findById(int pageNum, int pageSize) {

        PageHelper.startPage(pageNum,pageSize);

        MsRoomExample example = new MsRoomExample();
        MsUser user = (MsUser) ShiroUtils.getCurrentUser();

        MsRoomExample.Criteria criteria = example.createCriteria();
        criteria.andUseridEqualTo(user.getUserid());

        List<MsRoom> rooms = msRoomMapper.selectByExample(example);

        PageInfo info = new PageInfo(rooms);

        List<MsRoom> list = info.getList();

        return list;
    }

    @Override
    public R room(int pageNum, int pageSize) {

        if(pageNum == 0){
            pageNum=0;
        }

        if(pageSize == 0){
            pageSize=4;
        }


        PageHelper.startPage(pageNum,pageSize);

        MsRoomExample example = new MsRoomExample();
        MsRoomExample.Criteria criteria = example.createCriteria();
        criteria.andAddressLike("北京");
        List<MsRoom> bj = msRoomMapper.selectByExample(example);
        PageInfo<MsRoom> info = new PageInfo<>(bj);
        bj = info.getList();


        criteria.andAddressLike("上海");
        List<MsRoom> sh = msRoomMapper.selectByExample(example);
        PageInfo<MsRoom> info1 = new PageInfo<>(bj);
        sh = info.getList();


        criteria.andAddressLike("广州");
        List<MsRoom> gz = msRoomMapper.selectByExample(example);
        PageInfo<MsRoom> info2 = new PageInfo<>(bj);
        gz = info.getList();

        criteria.andAddressLike("成都");
        List<MsRoom> cd = msRoomMapper.selectByExample(example);
        PageInfo<MsRoom> info3 = new PageInfo<>(bj);
        cd = info.getList();

        Map<String,Object> map = new HashMap<>();

        map.put("bj",bj);
        map.put("sh",sh);
        map.put("gz",gz);
        map.put("cd",cd);


        return R.ok().put("data",map);
    }

    @Override
    public R delete(long roomId) {


        int i = msRoomMapper.deleteByPrimaryKey(roomId);

        if(i==0){
            return R.error("删除失败");
        }

        return R.ok();
    }

    @Override
    public R updateRoom(MsRoom msRoom) {


        int i = msRoomMapper.updateByPrimaryKeySelective(msRoom);

        if(i==0){
            return R.error("修改失败");
        }

        return R.ok();
    }

    @Override
    public R houseInfo(long roomId) {
        MsRoom msRoom = msRoomMapper.selectByPrimaryKey(roomId);
        System.out.println(msRoom);
        return msRoom!=null?R.ok().put("data",msRoom):R.error("查看失败");
    }
}
