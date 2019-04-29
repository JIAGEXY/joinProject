package com.lh.service;

import com.lh.entity.MsSleeper;
import com.lh.entity.MsUser;
import com.lh.utils.R;

public interface MsUserService {

    R selectLevler();

    R insertSleeper(MsSleeper msSleeper);

    R updateUser(MsUser msUser);

    R register(MsUser user);

    MsUser findByName(String username);

    R updatePassword(MsUser user);

    MsUser findByPhone(String phone);
}
