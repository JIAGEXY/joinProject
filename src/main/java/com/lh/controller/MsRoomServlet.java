package com.lh.controller;

import com.lh.entity.MsRoom;
import com.lh.entity.MsRoomExample;
import com.lh.service.MsRoomService;
import com.lh.utils.Load;
import com.lh.utils.R;
import javafx.beans.DefaultProperty;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@RestController
public class MsRoomServlet {
    @Resource
    private MsRoomService service;
    @RequestMapping("/ms/landlord/publish")
    public R houseReleased(@RequestBody MsRoom room, HttpServletRequest request,
                           HttpServletResponse response, MultipartFile roomimg){
        String r = Load.upLoadRoomImg(request,response,roomimg);
        room.setRoomimg(r);
        return service.insert(room);
    }


    //查询房东的所有房间
    @RequestMapping("/ms/room/published")
    public List<MsRoom> published(@RequestBody int pageNum,int pageSize){

        return service.findById(pageNum,pageSize);

    }

    //查询城市房屋
    @RequestMapping("/ms/room/cityAndRoom")
    public R room(@RequestBody() int pageNum, int pageSize){

        return service.room(pageNum,pageSize);

    }



}
