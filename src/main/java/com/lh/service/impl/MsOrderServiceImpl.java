package com.lh.service.impl;

import com.github.pagehelper.PageHelper;
import com.lh.entity.MsOrder;
import com.lh.entity.MsOrderExample;
import com.lh.entity.MsRoom;
import com.lh.entity.MsUser;
import com.lh.mapper.MsOrderMapper;
import com.lh.mapper.MsRoomMapper;
import com.lh.service.MsOrderService;
import com.lh.utils.OrderStatus;
import com.lh.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.lh.utils.ShiroUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;

@Service
public class MsOrderServiceImpl implements MsOrderService{
    @Resource
    MsOrderMapper msOrderMapper;
    @Resource
    MsRoomMapper msRoomMapper;

    @Override
    public List<MsOrder> listOrder(int pageNum,int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<MsOrder> list=new ArrayList<>();
        MsOrderExample ms=new MsOrderExample();
        List<MsOrder> msOrders = msOrderMapper.selectByExample(ms);
        for (MsOrder msOrder : msOrders) {
            MsOrder order=new MsOrder();
            MsRoom msRoom = msRoomMapper.selectByPrimaryKey(msOrder.getRoomid());
            order.setRoomimg(msRoom.getRoomimg());
            order.setRoomname(msRoom.getRoomname());
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

    @Override
    public R insertALOrder(MsOrder order) {

        order.setOrderinfo("预定房屋");
        MsUser user=(MsUser)ShiroUtils.getCurrentUser();
        order.setUserid(user.getUserid());
        order.setOrdernumber(System.currentTimeMillis()+order.getUserid().toString());
        order.setStatus(OrderStatus.UNPAID);
        order.setOrderinfo("预定房间");
        if(order.getMoney()==null){
            order.setMoney(new BigDecimal("0.00"));
        }
        System.out.println(order.getMoney());
        int i = msOrderMapper.insertALOrder(order);
        if(i>0)
            return R.ok().put("data",order);
        return R.error("添加失败");
    }

    @Override
    public int updateALOrder(MsOrder order) { return msOrderMapper.updateALOrder(order); }

    @Override
    public MsOrder selectALOrder(String ordernum) {
        return  msOrderMapper.selectALOrder(ordernum);
    }

    @Override
    public R findOrderByStartDate(Date startDate) {
        MsOrderExample example = new MsOrderExample();
        MsOrderExample.Criteria criteria = example.createCriteria();
        criteria.andStartdateEqualTo(startDate);
        List<MsOrder> orders = msOrderMapper.selectByExample(example);
        return orders!=null?R.ok().put("data",orders):R.error("今天没有订单");
    }
}
