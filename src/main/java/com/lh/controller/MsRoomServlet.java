package com.lh.controller;

import com.lh.entity.MsRoom;
import com.lh.service.MsRoomService;
import com.lh.utils.R;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;

@RestController
public class MsRoomServlet {
    @Resource
    private MsRoomService service;
    //@RequestMapping
    public R insert(MsRoom room, HttpServletRequest request, HttpServletResponse response){
        try {
            InputStream is = request.getInputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return service.insert(room);
    }
}
