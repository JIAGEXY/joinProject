package com.lh.service.impl;

import com.github.pagehelper.PageHelper;
import com.lh.entity.MsOrder;
import com.lh.entity.MsOrderExample;
import com.lh.mapper.MsOrderMapper;
import com.lh.service.MsOrderService;
import com.lh.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class MsOrderServiceImpl implements MsOrderService{
    @Resource
    MsOrderMapper msOrderMapper;

    @Override
    public List<MsOrder> listOrder(int pageNum,int pageSize) {
        PageHelper.startPage(pageNum,pageSize);

        MsOrderExample ms=new MsOrderExample();

        List<MsOrder> msOrders = msOrderMapper.selectByExample(ms);

        return msOrders;
    }
    @Override
    public List<MsOrder> getOrderr(int pageNum,int pageSize){
        PageHelper.startPage(pageNum,pageSize);
        List<MsOrder> list=new ArrayList<>();
        List<MsOrder> msOrders = msOrderMapper.getOrderr();
        for (MsOrder msOrder : msOrders) {
            MsOrder order=new MsOrder();
            order.setOrderid(msOrder.getOrderid());
            order.setStartdate(msOrder.getStartdate());
            order.setOutdate(msOrder.getOutdate());
            order.setMoney(msOrder.getMoney());
            order.setDeposit(msOrder.getDeposit());
            order.setStatus(msOrder.getStatus());
            list.add(order);
        }
        return list;

    }
}
