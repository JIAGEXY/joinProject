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
    }
}
