package com.lh.service.impl;

import com.lh.mapper.MsUserMapper;
import com.lh.service.MsUserService;
import com.lh.utils.R;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class MsUserServiceImpl implements MsUserService {
    @Resource
    private MsUserMapper mapper;
    @Override
    public R login(int nowPage, int pageSize, String search) {
        return null;
    }
}
