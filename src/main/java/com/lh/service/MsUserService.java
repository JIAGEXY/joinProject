package com.lh.service;

import com.lh.entity.MsSleeper;
import com.lh.entity.MsUser;
import com.lh.utils.R;

public interface MsUserService {
    R login(int nowPage,int pageSize,String search);

    R selectLevler();

    R insertSleeper(MsSleeper msSleeper);

    R updateUser(MsUser msUser);
}
