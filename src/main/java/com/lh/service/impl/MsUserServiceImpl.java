package com.lh.service.impl;

import com.lh.entity.MsSleeper;
import com.lh.entity.MsUser;
import com.lh.mapper.MsSleeperMapper;
import com.lh.mapper.MsUserMapper;
import com.lh.service.MsUserService;
import com.lh.utils.R;
import com.lh.utils.ShiroUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class MsUserServiceImpl implements MsUserService {
    @Resource
    private MsUserMapper mapper;

    @Resource
    private MsSleeperMapper msSleeperMapper;

    @Override
    public R login(int nowPage, int pageSize, String search) {
        return null;
    }

    @Override
    public R selectLevler() {
       MsUser user= (MsUser)ShiroUtils.getCurrentUser();
       Integer level = user.getLevel();
       return R.ok().put("data",level);
    }

    @Override
    public R insertSleeper(MsSleeper msSleeper) {
        int i = msSleeperMapper.insertSelective(msSleeper);
        if(i>0)
            return R.ok();
        return R.error();
    }

    @Override
    public R updateUser(MsUser msUser) {
        int i = mapper.updateByPrimaryKeySelective(msUser);
        if(i>0)
            return R.ok();
        return R.error();
    }
}
