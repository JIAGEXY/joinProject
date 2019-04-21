package com.lh.service.impl;

import com.lh.entity.MsRoom;
import com.lh.mapper.MsRoomMapper;
import com.lh.service.MsRoomService;
import com.lh.utils.R;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class MsRoomServiceImpl implements MsRoomService {
    @Resource
    private MsRoomMapper mapper;

    @Override
    public R insert(MsRoom room) {
        int i = mapper.insert(room);
        return i>0?R.ok():R.error("发布失败");
    }
}
