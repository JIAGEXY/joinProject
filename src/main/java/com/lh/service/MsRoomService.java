package com.lh.service;

import com.lh.entity.MsRoom;
import com.lh.utils.R;

public interface MsRoomService {
    R insert(MsRoom room);
    R update(MsRoom room);
    R addHouse(long userId);



    R houseInfo(long roomId);

}
