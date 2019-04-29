package com.lh.controller;

import com.github.pagehelper.PageInfo;
import com.lh.entity.MsReview;
import com.lh.entity.MsUser;
import com.lh.service.MsReviewService;
import com.lh.utils.R;
import com.lh.utils.ShiroUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Map;

@RestController
@CrossOrigin(allowCredentials="true")
public class MsReviewServlet {
    @Resource(name = "msReviewServiceImpl")
    MsReviewService msReviewService;
    @RequestMapping("/ms/article/comments")
    public R Comment(@RequestBody MsReview msReview){
        Long userId = ((MsUser) ShiroUtils.getCurrentUser()).getUserid();
        msReview.setUserid(userId);
        java.util.Date  date=new java.util.Date();
        java.sql.Date  data1=new java.sql.Date(date.getTime());
        msReview.setCreatetime(data1);
        if(msReview.getReviewid()!=null){
            msReview.setParentid(msReview.getReviewid());
            msReview.setReviewid(null);
        }
        return msReviewService.Comment(msReview);
    }
    //只能有一个@RequestBody
    @RequestMapping("/ms/articele/viewcomments")
    public PageInfo viewComments( Long artid,int pageNum,int pageSize){
        MsReview msReview = new MsReview();
        msReview.setArtid(artid);
        return msReviewService.ViewComments(msReview,pageNum,pageSize);
    }
/*    @RequestMapping("/ms/articele/reply")
    public R Reply(@RequestBody MsReview msReview){

    }*/
    @RequestMapping("/ms/articele/viewreply")
    public PageInfo viewreply( Long reviewid,int pageNum,int pageSize){
        MsReview msReview = new MsReview();
        msReview.setReviewid(reviewid);
        return msReviewService.viewreply(msReview,pageNum,pageSize);
    }
}
