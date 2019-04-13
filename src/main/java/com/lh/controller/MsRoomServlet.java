package com.lh.controller;

import com.lh.entity.MsRoom;
import com.lh.service.MsRoomService;
import com.lh.utils.Load;
import com.lh.utils.R;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;

@RestController
public class MsRoomServlet {
    @Resource
    private MsRoomService service;
    @RequestMapping("/ms/landlord/publish")
    public R houseReleased(MsRoom room, HttpServletRequest request,
                           HttpServletResponse response, MultipartFile roomimg){
        String r = Load.upLoadRoomImg(request,response,roomimg);
        room.setRoomimg(r);
        return service.insert(room);
    }
}
