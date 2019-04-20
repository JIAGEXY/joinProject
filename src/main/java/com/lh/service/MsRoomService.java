package com.lh.service;

import com.lh.entity.MsRoom;
import com.lh.utils.R;

import java.util.List;

public interface MsRoomService {


    R insert(MsRoom room);
    R update(MsRoom room);
    R addHouse(long userId);

    List<MsRoom> findById(int pageNum, int pageSize);

    R room(int pageNum,int pageSize);
}
