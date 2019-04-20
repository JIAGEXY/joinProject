package com.lh.service.impl;

import com.lh.entity.MsDesc;
import com.lh.entity.MsDescExample;
import com.lh.entity.MsOrder;
import com.lh.mapper.MsDescMapper;
import com.lh.service.MsDescService;
import com.lh.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class MsDescServiceImpl implements MsDescService{

    @Resource
    private MsDescMapper msDescMapper;

    @Override
    public R addDesc(MsDesc msDesc){
        int i=msDescMapper.insert(msDesc);
        if(i>0){
          return  R.ok();
        }else{
            return R.error("评论失败");
        }
    }
//    public List<MsDesc> listDesc(int pageNum, int pageSize) {
//        List<MsDesc> list=new ArrayList<>();
//        MsDescExample msDescExample=new MsDescExample();
//        MsDescExample.Criteria criteria = msDescExample.createCriteria();
//        criteria.andDescidIsNull();
//        List<MsDesc> msDescs = msDescMapper.selectByExample(msDescExample);
//        for (MsDesc msDesc : msDescs) {
//            MsDesc msDesc1=new MsDesc();
//            msDesc1.setServicedesc(msDesc.getServicedesc());
//            msDesc1.setHousedesc(msDesc.getHousedesc());
//            msDesc1.setPicture(msDesc.getPicture());
//            msDesc1.setDescription(msDesc.getDescription());
//            msDesc1.setRoomid(msDesc.getRoomid());
//            msDesc1.setUserid(msDesc.getUserid());
//            list.add(msDesc1);
//        }
//            return list;
//    }
}
