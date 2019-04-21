package com.lh.controller;

import com.lh.entity.MsRoom;
import com.lh.service.MsRoomService;
import com.lh.utils.R;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
=======
import com.lh.utils.UpLoad;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
>>>>>>> 6e13e5717372feaa6e93f20c55561ca38f98c880

@RestController
public class MsRoomServlet {
    @Resource
<<<<<<< HEAD
    private MsRoomService service;
    @RequestMapping
    public R insert(MsRoom room, HttpServletRequest request, HttpServletResponse response){
        try {
            InputStream is = request.getInputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return service.insert(room);
=======
    private MsRoomService msRoomService;
    //发布房屋
    @RequestMapping("/ms/landlord/publish")
    public R houseReleased(MsRoom room, @RequestParam(name = "img") MultipartFile img){
        try {
            //图片名字
            String fileName = img.getOriginalFilename();
            //后缀
            String suffix = fileName.substring(fileName.lastIndexOf(".")+1);
            UpLoad upLoad = new UpLoad();
            String roomImg = upLoad.upLoadFile(img.getBytes(),suffix);
            room.setRoomimg(roomImg);
            return msRoomService.insert(room);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return R.error("发布房屋失败");
    }
    //修改房屋
    @RequestMapping("/ms/landlord/houseInfo")
    public R houseUpdate(MsRoom room, @RequestParam(name = "img") MultipartFile img){
        try {
            //图片名字
            String fileName = img.getOriginalFilename();
            //后缀
            String suffix = fileName.substring(fileName.lastIndexOf(".")+1);
            UpLoad upLoad = new UpLoad();
            String roomImg = upLoad.upLoadFile(img.getBytes(),suffix);
            room.setRoomimg(roomImg);
            return msRoomService.update(room);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return R.error("修改房屋失败");
    }
    //发布公告时 添加房源
    @RequestMapping("/ms/landlord/housing/{userId}")
    public R noticeAddHouse(@PathVariable long userId){
        return msRoomService.addHouse(userId);
>>>>>>> 6e13e5717372feaa6e93f20c55561ca38f98c880
    }
}
