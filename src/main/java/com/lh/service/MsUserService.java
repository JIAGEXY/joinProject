package com.lh.service;

import com.lh.entity.MsUser;
import com.lh.utils.R;

public interface MsUserService {

    R register(MsUser user);

    MsUser findByName(String username);

    R updatePassword(MsUser user);

    MsUser findByPhone(String phone);



}
