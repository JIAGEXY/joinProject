package com.lh.service.impl;

import com.lh.dto.MsArticleDto;
import com.lh.entity.*;
import com.lh.mapper.MsArtLableMapper;
import com.lh.mapper.MsArticleMapper;
import com.lh.mapper.MsUserArtMapper;
import com.lh.mapper.MsUserMapper;
import com.lh.service.MsArticleService;
import com.lh.utils.R;
import com.lh.utils.UpLoad;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service(value = "msArticleServiceImpl")
public class MsArticleServiceImpl implements MsArticleService {
    @Resource
    MsArticleMapper msArticleMapper;
    @Resource
    MsArtLableMapper msArtLableMapper;
    @Resource
    MsUserMapper msUserMapper;
    @Resource
    MsUserArtMapper msUserArtMapper;
    @Override
    public R publisharticles(Long artid,Long lableid, String title, Long userid,String imgurl,String txturl) {
        MsArticle msArticle = new MsArticle();
        UpLoad upLoad = null;
        try {
            upLoad = new UpLoad();
        }catch (Exception e){
            e.printStackTrace();
        }
        msArticle.setTitle(title);
        msArticle.setUserid(userid);
        java.util.Date  date=new java.util.Date();
        java.sql.Date  data1=new java.sql.Date(date.getTime());
        msArticle.setCreatetime(data1);
        msArticle.setArtimg(imgurl);
        msArticle.setContent(txturl);
        if(artid!=0){
            try {
                msArticle.setArtid(artid);
                String img = msArticleMapper.selectByPrimaryKey(msArticle.getArtid()).getArtimg();
                String txt = msArticleMapper.selectByPrimaryKey(msArticle.getArtid()).getContent();
                msArticleMapper.updateByPrimaryKey(msArticle);
                String filename = img.substring(img.lastIndexOf("M00"));
                String filename1 = img.substring(txt.lastIndexOf("M00"));
                upLoad.deleteFile(filename);
                upLoad.deleteFile(filename1);
            }catch (Exception e) {
                e.printStackTrace();
            }
            return R.ok();
        }else {
            int i = msArticleMapper.insert(msArticle);
            Long artid1 = new Long((long) i);
            MsArtLable msArtLable = new MsArtLable();
            msArtLable.setArtid(artid1);
            msArtLable.setLableid(lableid);
            msArtLableMapper.insert(msArtLable);
            return R.ok();
        }
    }


    @Override
    public R selectone(Long artId) {
        String art=null;
        MsArticle msArticle = new MsArticle();
        MsArticleDto msArticleDto = new MsArticleDto();
        MsArticleExample example = new MsArticleExample();
        MsArticleExample.Criteria criteria = example.createCriteria();
        criteria.andArtidEqualTo(artId);
        List<MsArticle> msArticles = msArticleMapper.selectByExample(example);
        if(msArticles==null){
            return R.error();
        }
        MsUser msUser = msUserMapper.selectByPrimaryKey(msArticles.get(0).getUserid());
        msArticleDto.setCreatetime(msArticles.get(0).getCreatetime());
        msArticleDto.setBrowse(msArticles.get(0).getBrowse());
        msArticleDto.setStatus(msArticles.get(0).getStatus());
        msArticleDto.setLikenum(msArticles.get(0).getLikenum());
        msArticleDto.setCollection(msArticles.get(0).getCollection());
        msArticleDto.setUsername(msUser.getUsername());
        msArticleDto.setTitle(msArticles.get(0).getTitle());
        String arturl = msArticles.get(0).getContent();
        String imgurl = msArticles.get(0).getArtimg();
        msArticleDto.setContent(arturl);
        msArticleDto.setArtimg(imgurl);
        msArticle.setBrowse(msArticles.get(0).getBrowse()+1);
        msArticle.setArtid(artId);
        msArticleMapper.updateByPrimaryKeySelective(msArticle);
        return R.ok().put("art",msArticleDto);
    }

    @Override
    public R thumbsup(Long artId) {
        MsArticle msArticle = new MsArticle();
        MsArticleExample example = new MsArticleExample();
        MsArticleExample.Criteria criteria = example.createCriteria();
        criteria.andArtidEqualTo(artId);
        List<MsArticle> msArticles = msArticleMapper.selectByExample(example);
        msArticle.setLikenum(msArticles.get(0).getLikenum()+1);
        msArticle.setArtid(artId);
        msArticleMapper.updateByPrimaryKeySelective(msArticle);
        return R.ok();
    }

    @Override
    public R collect(MsUserArt userArt) {
        msUserArtMapper.insert(userArt);
        return R.ok();
    }
}
