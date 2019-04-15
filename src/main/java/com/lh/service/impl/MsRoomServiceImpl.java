package com.lh.service.impl;

import com.lh.entity.MsRoom;
import com.lh.entity.MsRoomExample;
import com.lh.mapper.MsRoomMapper;
import com.lh.service.MsRoomService;
import com.lh.utils.R;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
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
        int i = msRoomMapper.updateByPrimaryKey(room);
        return i>0?R.ok():R.error("修改失败");
    }

    @Override
    public R addHouse(long userId) {
        MsRoomExample example = new MsRoomExample();
        MsRoomExample.Criteria criteria = example.createCriteria();
        criteria.andUseridEqualTo(userId);
        List<MsRoom> list = msRoomMapper.selectByExample(example);
        return list!=null?R.ok().put("data",list):R.error("未发布房源");
    }
}
