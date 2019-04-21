package com.lh.controller;

import com.github.pagehelper.PageInfo;
import com.lh.dto.MsArticleDto;
import com.lh.entity.MsArticle;
import com.lh.entity.MsReview;
import com.lh.entity.MsUser;
import com.lh.entity.MsUserArt;
import com.lh.service.MsArticleService;
import com.lh.utils.R;
import com.lh.utils.ShiroUtils;
import com.lh.utils.UpLoad;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;

@RestController
public class MsArticleServlet {
    @Resource(name = "msArticleServiceImpl")
    private MsArticleService msArticleService;
    @RequestMapping("/ms/article/release")
    public R publishArticles(@RequestBody Long lableid,  @RequestBody String art, @RequestBody String title,
                             @RequestBody Long artid,@RequestBody MultipartFile img
                             ){
        Long userid = ((MsUser) ShiroUtils.getCurrentUser()).getUserid();
        //图片名字
        String fileName = img.getOriginalFilename();
        //后缀
        String suffix = fileName.substring(fileName.lastIndexOf(".")+1);
        String imgurl= null;
        String txturl=null;
        try {
            UpLoad upLoad = new UpLoad();
            imgurl = upLoad.upLoadFile(img.getBytes(),suffix);
            txturl = upLoad.upLoadFile(art.getBytes(),".txt");
        }catch (Exception e){
            e.printStackTrace();
        }
        return msArticleService.publisharticles(artid,lableid, title, userid, imgurl, txturl);
    }
    @RequestMapping("/ms/article/selectone")
    public R selectone(@RequestBody MsArticle msArticle){
        return msArticleService.selectone(msArticle.getArtid());
    }
    @RequestMapping("/ms/article/thumbsup")
    public R thumbsup(@RequestBody MsArticle msArticle){

        return msArticleService.thumbsup(msArticle.getArtid());
    }
    @RequestMapping("/ms/article/collect")
    public R collect(@RequestBody MsUserArt userArt){
        return msArticleService.collect(userArt);
    }
}
