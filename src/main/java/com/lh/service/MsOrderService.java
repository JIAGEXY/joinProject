package com.lh.service;

import com.lh.entity.MsOrder;
import com.lh.utils.R;


import java.util.List;

public interface MsOrderService {
    List<MsOrder> listOrder(int pageNum, int pageSize);

    List<MsOrder> getOrderr(int pageNum,int pageSize);

    //新增订单（包含阿里支付数据）
    R insertALOrder(MsOrder order);
    //更新订单
    int updateALOrder(MsOrder order);
    //查询订单
    MsOrder selectALOrder(String ordernum);
}
