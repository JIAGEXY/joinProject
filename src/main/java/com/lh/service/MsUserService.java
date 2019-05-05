package com.lh.service;

import com.lh.entity.MsSleeper;
import com.lh.entity.MsUser;
import com.lh.utils.R;
import org.springframework.web.multipart.MultipartFile;

public interface MsUserService {

    R selectLevler();

    R insertSleeper(MsSleeper msSleeper);

    R updateUser(MsUser msUser);

    R register(MsUser user);

    MsUser findByName(String username);

    R updatePassword(MsUser user);

    MsUser findByPhone(String phone);

    R selectUserInfo();

    R updateUserHeadPhoto(MsUser user, String oldPhoto);
}
