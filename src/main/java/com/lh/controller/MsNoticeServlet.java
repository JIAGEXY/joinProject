package com.lh.controller;

import com.lh.entity.MsNotice;
import com.lh.service.MsNoticeService;
import com.lh.utils.R;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class MsNoticeServlet {
    @Resource
    private MsNoticeService msNoticeService;
    //房东公告促销
    @RequestMapping("/ms/landlord/notice/{userId}")
    public R notice(@PathVariable long userId){
        return msNoticeService.findNoticeByUserId(userId);
    }
    //查看公告详情
    @RequestMapping("/ms/landlord/viewNotice/{noticeId}")
    public R viewNotice(@PathVariable long noticeId){
        return msNoticeService.findNoticeByNoticeId(noticeId);
    }
    //发布公告
    @RequestMapping("/ms/landlord/release")
    public R announce(@RequestBody MsNotice notice){
        return msNoticeService.insert(notice);
    }
    //删除公告
    @RequestMapping("/ms/landlord/delete/{noticeId}")
    public R delNotice(@PathVariable long noticeId){
        return msNoticeService.delete(noticeId);
    }
}
