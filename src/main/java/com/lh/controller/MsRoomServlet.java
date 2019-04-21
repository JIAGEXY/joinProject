package com.lh.controller;

import com.lh.entity.MsRoom;
import com.lh.service.MsRoomService;
import com.lh.utils.R;
import com.lh.utils.UpLoad;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;

@RestController
public class MsRoomServlet {
    @Resource
    private MsRoomService msRoomService;
    //发布房屋
    @RequestMapping("/ms/landlord/publish")
<<<<<<< HEAD
    public R houseReleased(@RequestBody MsRoom room, HttpServletRequest request, HttpServletResponse response, @RequestParam(name = "img") MultipartFile img){
        String roomImg = Load.upLoadRoomImg(request,response,img);
        room.setRoomimg(roomImg);
        return msRoomService.insert(room);
    }
    //修改房屋
    @RequestMapping("/ms/landlord/houseInfo")
    public R houseUpdate(@RequestBody MsRoom room, HttpServletRequest request, HttpServletResponse response, @RequestParam(name = "img") MultipartFile img){
        String r = Load.upLoadRoomImg(request,response,img);
        room.setRoomimg(r);
        return msRoomService.update(room);
=======
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
>>>>>>> 6e13e5717372feaa6e93f20c55561ca38f98c880
    }
    //发布公告时 添加房源
    @RequestMapping("/ms/landlord/housing/{userId}")
    public R noticeAddHouse(@PathVariable long userId){
        return msRoomService.addHouse(userId);
    }
    //查看房屋信息
    @RequestMapping("/ms/room/houseInfo/{roomId}")
    public R houseInfo(@PathVariable long roomId){
        return msRoomService.houseInfo(roomId);
    }



}
