package com.lh.controller;

import com.github.pagehelper.PageInfo;
import com.lh.dto.Page;
import com.lh.entity.MsEvaluation;
import com.lh.entity.MsRoom;
import com.lh.service.MsEvaluationService;
import com.lh.service.MsOrderService;
import com.lh.service.MsRoomService;
import com.lh.utils.R;
import com.lh.utils.UpLoad;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Date;

@RestController
@CrossOrigin(allowCredentials="true")
public class MsRoomServlet {
    @Resource
    private MsRoomService msRoomService;

    @Resource
    private MsOrderService msOrderService;

    @Resource
    private MsEvaluationService msEvaluationService;
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
    //房东查看历史订单
    @RequestMapping("/ms/landlord/history")
    public R history(String startDate){
        SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d = null;
        try { d = date.parse(startDate); } catch (ParseException e) { e.printStackTrace(); }
        return msOrderService.findOrderByStartDate(d);
    }

    //房东评价历史订单
    @RequestMapping("/ms/landlord/evaluation")
    public R evaluation(@RequestBody MsEvaluation evaluation){ return msEvaluationService.evaluation(evaluation); }

    //发布公告时 添加房源
    @RequestMapping("/ms/landlord/housing/{userId}")
    public R noticeAddHouse(@PathVariable long userId){ return msRoomService.addHouse(userId); }

    //查询房东的所有房间
    @RequestMapping("/ms/room/published")
    public R published(@RequestBody Page page) { return msRoomService.findById(page.getPageNum(), page.getPageSize()); }

    //查询城市房屋
    @RequestMapping("/ms/room/cityAndRoom")
    public R room(@RequestBody Page page) { return msRoomService.room(page.getPageNum(), page.getPageSize()); }

    //删除房屋
    @RequestMapping("/ms/room/del/{roomId}")
    public R delRoom(@PathVariable("roomId")long roomId){ return msRoomService.delete(roomId); }

    //下架上架房屋
    @RequestMapping("/ms/room/upAndDown")
    public R upDown( MsRoom msRoom){ return msRoomService.updateRoom(msRoom); }

    //查看房屋信息
    @RequestMapping("/ms/room/houseInfo/{roomId}")
    public R houseInfo(@PathVariable long roomId){ return msRoomService.houseInfo(roomId); }

    //查看房屋列表
    @RequestMapping("/ms/room/allList")
    public R allList(PageInfo info,
                     @RequestParam(defaultValue = "null") String range,
                     @RequestParam(defaultValue = "null") String sort,
                     @RequestParam(defaultValue = "null") String order, MsRoom msRoom){ return msRoomService.allList(info.getPageNum(),info.getPageSize(),range,sort,order,msRoom); }
}
