package com.lh.controller;

import com.lh.entity.MsRoom;
import com.lh.service.MsRoomService;
import com.lh.utils.R;
import com.lh.utils.UpLoad;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
public class MsRoomServlet {
    @Resource
    private MsRoomService msRoomService;

    //发布公告时 添加房源
    @RequestMapping("/ms/landlord/housing/{userId}")
    public R noticeAddHouse(@PathVariable long userId){
        return msRoomService.addHouse(userId);
    }

    //查询房东的所有房间
    @RequestMapping("/ms/room/published")
    public List<MsRoom> published(@RequestBody int pageNum, int pageSize){

        return msRoomService.findById(pageNum,pageSize);

    }

    //查询城市房屋
    @RequestMapping("/ms/room/cityAndRoom")
    public R room(@RequestBody() int pageNum, int pageSize){

        return msRoomService.room(pageNum,pageSize);

    }
}
