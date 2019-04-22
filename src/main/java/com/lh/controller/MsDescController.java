package com.lh.controller;

import com.lh.entity.MsDesc;
import com.lh.service.MsDescService;
import com.lh.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
public class MsDescController {
    @Autowired
    private MsDescService msDescService;

    @RequestMapping("/ms/user/orderevaluate")
    public R addDesc(MsDesc msDesc){

        msDesc.setCreatetime(new Date());

        return msDescService.addDesc(msDesc);
    }
}
