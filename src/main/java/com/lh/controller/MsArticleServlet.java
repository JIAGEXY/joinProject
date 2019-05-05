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
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.util.Map;

@RestController
@CrossOrigin(allowCredentials="true")
public class MsArticleServlet {
    @Resource(name = "msArticleServiceImpl")
    private MsArticleService msArticleService;
    @RequestMapping("/ms/article/release")
    public R publishArticles(@RequestParam MultipartFile img, @RequestParam String content,@RequestParam String title,
                             @RequestParam Long lableid,@RequestParam Long artid
                             ){

        //图片名字
        String fileName = img.getOriginalFilename();
        //后缀
        String suffix = fileName.substring(fileName.lastIndexOf(".")+1);
        String imgurl= null;
        String txturl=null;
        try {
            UpLoad upLoad = new UpLoad();
            imgurl = upLoad.upLoadFile(img.getBytes(),suffix);
            txturl = upLoad.upLoadFile(content.getBytes(),"txt");
        }catch (Exception e){
            e.printStackTrace();
        }
        return msArticleService.publisharticles(artid,lableid, title, imgurl, txturl);
    }
    @RequestMapping("/ms/article/selectone/{artid}")
    public MsArticleDto selectone(@PathVariable long artid){ return msArticleService.selectone(artid); }
    @RequestMapping("/ms/article/thumbsup")
    public R thumbsup(@RequestBody MsArticle msArticle){
        return msArticleService.thumbsup(msArticle.getArtid());
    }
    @RequestMapping("/ms/article/collect")
    public R collect(@RequestBody MsUserArt userArt){
        return msArticleService.collect(userArt);
    }
}
