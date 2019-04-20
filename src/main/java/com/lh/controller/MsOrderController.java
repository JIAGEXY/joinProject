package com.lh.controller;

import com.github.pagehelper.PageInfo;
import com.lh.entity.MsOrder;
import com.lh.service.MsOrderService;
import com.lh.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.websocket.server.PathParam;
import java.util.List;

@Controller
public class MsOrderController {
    @Autowired
    private MsOrderService msOrderService;
    @RequestMapping("/ms/user/orderlist")
    @ResponseBody
    public R listOrder(int pageNum, int pageSize, int status){

        List<MsOrder> list=null;
        PageInfo<MsOrder> pageInfo=null;
        if(status==-1){

             list=msOrderService.listOrder(pageNum,pageSize);

            pageInfo=new PageInfo<>(list);
        }

        if(status==4){
            list = msOrderService.getOrderr(pageNum, pageSize);
            pageInfo=new PageInfo<>(list);

        }

        return R.ok().put("data",pageInfo);

    }
}
