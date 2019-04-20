package com.lh.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lh.entity.MsRoom;
import com.lh.entity.MsRoomExample;
import com.lh.entity.MsUser;
import com.lh.mapper.MsRoomMapper;
import com.lh.service.MsRoomService;
import com.lh.utils.R;
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
    private MsRoomMapper mapper;

    @Override
    public R insert(MsRoom room) {
        int i = mapper.insert(room);
        return i>0?R.ok():R.error("发布失败");
    }

    @Override
    public List<MsRoom> findById(int pageNum, int pageSize) {

        PageHelper.startPage(pageNum,pageSize);

        MsRoomExample example = new MsRoomExample();
        MsUser user = (MsUser) ShiroUtils.getCurrentUser();

        MsRoomExample.Criteria criteria = example.createCriteria();
        criteria.andUseridEqualTo(user.getUserid());

        List<MsRoom> rooms = mapper.selectByExample(example);

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
        List<MsRoom> bj = mapper.selectByExample(example);
        PageInfo<MsRoom> info = new PageInfo<>(bj);
        bj = info.getList();


        criteria.andAddressLike("上海");
        List<MsRoom> sh = mapper.selectByExample(example);
        PageInfo<MsRoom> info1 = new PageInfo<>(bj);
        sh = info.getList();


        criteria.andAddressLike("广州");
        List<MsRoom> gz = mapper.selectByExample(example);
        PageInfo<MsRoom> info2 = new PageInfo<>(bj);
        gz = info.getList();

        criteria.andAddressLike("成都");
        List<MsRoom> cd = mapper.selectByExample(example);
        PageInfo<MsRoom> info3 = new PageInfo<>(bj);
        cd = info.getList();

        Map<String,Object> map = new HashMap<>();

        map.put("bj",bj);
        map.put("sh",sh);
        map.put("gz",gz);
        map.put("cd",cd);


        return R.ok().put("data",map);
    }
}
