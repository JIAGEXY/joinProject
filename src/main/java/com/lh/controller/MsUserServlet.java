package com.lh.controller;

import com.lh.service.MsUserService;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class MsUserServlet {
    @Resource
    private MsUserService msUserService;
}
