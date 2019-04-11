package com.lh.controller;

import com.lh.service.MsUserService;
import com.lh.utils.R;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class MsUserServlet {
    @Resource
    private MsUserService service;
    @RequestMapping("/a")
    public R login(){
        return R.ok().put("data","hello world");
    }
}
