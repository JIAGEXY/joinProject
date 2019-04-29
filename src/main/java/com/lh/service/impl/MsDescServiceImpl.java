package com.lh.service.impl;

import com.lh.entity.MsDesc;
import com.lh.mapper.MsDescMapper;
import com.lh.service.MsDescService;
import com.lh.utils.R;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class MsDescServiceImpl implements MsDescService{

    @Resource
    private MsDescMapper msDescMapper;

    @Override
    public R addDesc(MsDesc msDesc){
        int i=msDescMapper.insert(msDesc);
        if(i>0) return R.ok();
        else return R.error("评论失败");
    }
}
