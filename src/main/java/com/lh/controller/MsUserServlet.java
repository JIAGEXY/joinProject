package com.lh.controller;

import com.lh.service.MsUserService;
<<<<<<< HEAD
import com.lh.utils.R;
import org.springframework.web.bind.annotation.RequestMapping;
=======
>>>>>>> 6e13e5717372feaa6e93f20c55561ca38f98c880
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class MsUserServlet {
    @Resource
<<<<<<< HEAD
    private MsUserService service;
    @RequestMapping("/a")
    public R login(){
        return R.ok().put("data","hello world");
    }
=======
    private MsUserService msUserService;
>>>>>>> 6e13e5717372feaa6e93f20c55561ca38f98c880
}
