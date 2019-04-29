package com.lh.controller;

import com.lh.service.MsCommunityService;
import com.lh.utils.R;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@CrossOrigin(allowCredentials="true")
public class MsCommunityServler {

    @Resource
    private MsCommunityService msCommunityService;

    @RequestMapping("/ms/article/sfit")
    @ResponseBody
    public R findSfit(@RequestParam(value = "pageNum") int pageNum ,
                      @RequestParam(value = "pageSize") int pageSize){
       // pageNum 当前页	 pageSize 每页行数
        return msCommunityService.find(pageNum,pageSize);
    }
}
