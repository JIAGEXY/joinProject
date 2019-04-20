package com.lh.controller;

import com.lh.entity.MsRoom;
import com.lh.service.MsRoomService;
import com.lh.utils.Load;
import com.lh.utils.R;
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
    //发布房屋
    @RequestMapping("/ms/landlord/publish")
    public R houseReleased(@RequestBody MsRoom room, HttpServletRequest request,
                           HttpServletResponse response,
                           @RequestParam(name = "img") MultipartFile img){
        String roomImg = Load.upLoadRoomImg(request,response,img);
        room.setRoomimg(roomImg);
        return msRoomService.insert(room);
    }
    //修改房屋
    @RequestMapping("/ms/landlord/houseInfo")
    public R houseUpdate(@RequestBody MsRoom room, HttpServletRequest request,
                              HttpServletResponse response,
                              @RequestParam(name = "img") MultipartFile img){
        String r = Load.upLoadRoomImg(request,response,img);
        room.setRoomimg(r);
        return msRoomService.update(room);
    }
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
