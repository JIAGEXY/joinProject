package com.lh.controller;

import com.lh.entity.MsDesc;
import com.lh.service.MsDescService;
import com.lh.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
@CrossOrigin(allowCredentials="true")
public class MsDescController {
    @Autowired
    private MsDescService msDescService;

    //房屋评价
    @RequestMapping("/ms/user/orderevaluate")
    @ResponseBody
    public R addDesc(@RequestBody MsDesc msDesc){
        msDesc.setCreatetime(new Date());
         msDescService.addDesc(msDesc);
         return R.ok();
    }
}
