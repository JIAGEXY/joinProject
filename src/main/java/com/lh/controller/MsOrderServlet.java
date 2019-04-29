package com.lh.controller;

import com.lh.entity.MsOrder;
import com.lh.service.MsOrderService;
import com.lh.utils.R;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@CrossOrigin(allowCredentials="true")
public class MsOrderServlet {
    @Resource
    private MsOrderService msOrderService;

    //新增订单
    @RequestMapping("/ms/user/orderadd")
    public R insertOrder(@RequestBody MsOrder msOrder){
        return msOrderService.insertALOrder(msOrder);
    }
}
