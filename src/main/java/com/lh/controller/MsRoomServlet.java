package com.lh.controller;

import com.github.pagehelper.PageInfo;
import com.lh.dto.Page;
import com.lh.entity.MsEvaluation;
import com.lh.entity.MsRoom;
import com.lh.exception.RZException;
import com.lh.service.MsEvaluationService;
import com.lh.service.MsOrderService;
import com.lh.service.MsRoomService;
import com.lh.utils.ForUntil;
import com.lh.utils.R;
import com.lh.utils.ShiroUtils;
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
    //发布房屋图片
    @RequestMapping("/ms/landlord/addHouseImg")
    public R addHouseImg(MultipartFile[] img){
        try {
            StringBuilder roomImg = new StringBuilder();
            ForUntil.toFor(img, roomImg);//遍历发布图片
            MsRoom room = new MsRoom();
            room.setRoomimg(roomImg.toString());
            return msRoomService.insertImg(room);
        } catch (Exception e) {
            throw new RZException(e.getMessage());
        }
    }
    //发布房屋
    @RequestMapping("/ms/landlord/publish")
    public R houseReleased(MsRoom room){
        long roomId = (long) ShiroUtils.getAttribute("roomId");
        room.setRoomid(roomId);
        return msRoomService.update(room);
    }
    //修改房屋图片
    @RequestMapping("/ms/landlord/updHouseImg")
    public R updHouseImg(MultipartFile[] img){
        try {
            StringBuilder roomImg = new StringBuilder();
            ForUntil.toFor(img, roomImg);//遍历发布图片
            MsRoom room = new MsRoom();
            long roomId = (long) ShiroUtils.getAttribute("roomId");
            room.setRoomid(roomId);
            room.setRoomimg(roomImg.toString());
            return msRoomService.updateImg(room);
        } catch (Exception e) {
            throw new RZException(e.getMessage());
        }
    }
    //修改房屋
    @RequestMapping("/ms/landlord/houseInfo")
    public R houseUpdate(MsRoom room){ return msRoomService.update(room); }

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
    public R allList(@RequestParam(defaultValue ="1",required=false) int pageNum,
                     @RequestParam(defaultValue ="5",required=false) int pageSize,
                     @RequestParam(defaultValue ="",required=false) String range,
                     @RequestParam(defaultValue ="",required = false) String sort,
                     @RequestParam(defaultValue ="",required = false) String order, MsRoom msRoom){ return msRoomService.allList(pageNum,pageSize,range,sort,order,msRoom); }

    //精选房屋
    @RequestMapping("/ms/room/sift")
    public R selectSift(@RequestParam(defaultValue ="1")int artid,@RequestParam(defaultValue ="4")int pageSize){
        return msRoomService.selectRoomSift(artid,pageSize);
    }
}
