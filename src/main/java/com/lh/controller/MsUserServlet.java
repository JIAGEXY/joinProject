package com.lh.controller;

import com.github.pagehelper.PageInfo;
import com.lh.entity.MsSleeper;
import com.lh.entity.MsUser;
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


    //查询旅客等级
    @RequestMapping("/ms/user/sleepscore")
    public R selectLerver(){
        return service.selectLevler();
    }

    //试睡员申请提交
    @RequestMapping("/ms/user/cansleep")
    public R insertSleeper(@RequestBody MsSleeper msSleeper){
        return service.insertSleeper(msSleeper);
    }

    //修改当前用户个人资料
    @RequestMapping("/ms/user/mydata")
    public R updateUser(@RequestBody MsUser msUser){
        return service.updateUser(msUser);
    }

}
