package com.lh.controller;

import com.github.pagehelper.PageInfo;
import com.lh.service.MsRoomService;
import com.lh.service.MsUserService;
import com.lh.utils.R;
import com.lh.utils.ShiroUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class MsUserServlet {
    @Resource
    private MsUserService service;

    @Resource
    private MsRoomService msRoomService;

    @RequestMapping("/a")
    public R login(){
        return R.ok().put("data","hello world");
    }


    //房屋收藏
    @RequestMapping("/ms/user/housecollect")
    public R houseCollect( PageInfo pageInfo){
        System.out.println(pageInfo.getPageNum()+pageInfo.getPageSize());
        return  msRoomService.selectHouseCollect(pageInfo);
    }
}
