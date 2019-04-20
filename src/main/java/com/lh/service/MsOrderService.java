package com.lh.service;

import com.lh.entity.MsOrder;
import com.lh.utils.R;


import java.util.List;

public interface MsOrderService {
    List<MsOrder> listOrder(int pageNum, int pageSize);

    List<MsOrder> getOrderr(int pageNum,int pageSize);
}
