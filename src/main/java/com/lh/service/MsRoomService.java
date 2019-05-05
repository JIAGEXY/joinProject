package com.lh.service;

import com.github.pagehelper.PageInfo;
import com.lh.entity.MsRoom;
import com.lh.utils.R;

import java.util.List;

public interface MsRoomService {
    R insertImg(MsRoom room);
    R insert(MsRoom room);
    R updateImg(MsRoom room);
    R update(MsRoom room);
    R addHouse(long userId);

    R findById(int pageNum, int pageSize);
    R room(int pageNum,int pageSize);
    R delete(long roomId);
    R updateRoom(MsRoom msRoom);
    R houseInfo(long roomId);

    R selectHouseCollect(PageInfo pageInfo);
    R allList(int pageNum,int pageSize,String range,String sort,String order,MsRoom msRoom);

    R selectRoomSift(int artid, int pageSize);
}
