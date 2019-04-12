package com.lh.service;

import com.github.pagehelper.PageInfo;
import com.lh.entity.MsRoom;
import com.lh.utils.R;

public interface MsRoomService {
    R insert(MsRoom room);

    R selectHouseCollect(PageInfo pageInfo);
}
