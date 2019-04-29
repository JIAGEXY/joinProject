package com.lh.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lh.dto.ArticleDTO;
import com.lh.dto.PersonalDTO;
import com.lh.entity.*;
import com.lh.mapper.MsArticleMapper;
import com.lh.mapper.MsUserArtMapper;
import com.lh.mapper.MsUserMapper;
import com.lh.service.MsCenterService;
import com.lh.utils.R;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class MsCenterServiceImpl implements MsCenterService {

    @Resource
    private MsUserMapper msUserMapper;//  用户/旅客表
    @Resource
    private MsArticleMapper msArticleMapper;//  发表文章表
    @Resource
    private MsUserArtMapper msUserArtMapperr;// 收藏关系表

    @Override //个人文章
    public R findPersonal(int nowPage, int pageSize, Long userId) {
        PageHelper.startPage(nowPage,pageSize);
        List<PersonalDTO> list = new ArrayList<>();
        MsUser msUsers = msUserMapper.selectByPrimaryKey(userId);
        PersonalDTO personalDTO = new PersonalDTO();
        //根据用户表id查询发表文章表
        MsArticleExample example = new MsArticleExample();
        MsArticleExample.Criteria criteria = example.createCriteria();
        criteria.andUseridEqualTo(userId);
        List<MsArticle> msArticles = msArticleMapper.selectByExample(example);
        for (MsArticle msArticle : msArticles) {
            personalDTO.setArtImg(msArticle.getArtimg());
            personalDTO.setArt(msArticle.getContent());
            personalDTO.setTitle(msArticle.getTitle());

            personalDTO.setUsername(msUsers.getUsername());
            list.add(personalDTO);
        }
        PageInfo pageInfo = new PageInfo(list);
        return list.size()>0?R.ok().put("data",pageInfo):R.error();
    }


    @Override  //租客故事/房东故事
    public R findTenan(int nowPage, int pageSize, Byte type) {
        PageHelper.startPage(nowPage,pageSize);
        List<PersonalDTO> list = new ArrayList<>();
        MsUserExample example = new MsUserExample();
        MsUserExample.Criteria criteria = example.createCriteria();
        criteria.andTypeEqualTo(type);
        List<MsUser> msUsers = msUserMapper.selectByExample(example);
        for (MsUser msUser : msUsers) {
            PersonalDTO personalDTO = new PersonalDTO();
            //根据用户表msUser得到用户名
            personalDTO.setUsername(msUser.getUsername());
            //根据用户表id查询发表文章表
            MsArticleExample example1 = new MsArticleExample();
            MsArticleExample.Criteria criteria1 = example1.createCriteria();
            //根据用户表msUser得到用户id
            criteria1.andUseridEqualTo(msUser.getUserid());
            List<MsArticle> msArticles = msArticleMapper.selectByExample(example1);
            for (MsArticle msArticle : msArticles) {
                personalDTO.setArtImg(msArticle.getArtimg());
                personalDTO.setArt(msArticle.getContent());
                personalDTO.setTitle(msArticle.getTitle());
            }
            list.add(personalDTO);
        }
        PageInfo pageInfo = new PageInfo(list);
        return list.size()>0?R.ok().put("data",pageInfo):R.error();
    }


    @Override //收藏文章
    public R findCollection(int nowPage, int pageSize, Long userId) {
        PageHelper.startPage(nowPage,pageSize);
        List<PersonalDTO> list = new ArrayList<>();
        MsUser msUsers = msUserMapper.selectByPrimaryKey(userId);
        PersonalDTO personalDTO = new PersonalDTO();
        //使用用户id查询收藏关系表
        MsUserArtExample example = new  MsUserArtExample();
        MsUserArtExample.Criteria criteria = example.createCriteria();
        criteria.andUseridEqualTo(msUsers.getUserid());
        List<MsUserArt> msUserArt = msUserArtMapperr.selectByExample(example);
        for (MsUserArt userArt : msUserArt) {
            //根据收藏关系表发表文章表id进行查询
            MsArticle msArticles = msArticleMapper.selectByPrimaryKey(userArt.getArtid());
                personalDTO.setArtImg(msArticles.getArtimg());
                personalDTO.setArt(msArticles.getContent());
                personalDTO.setTitle(msArticles.getTitle());
            //根据发表文章表得到作者id对用户表查询
            MsUser msUsers1 = msUserMapper.selectByPrimaryKey(msArticles.getUserid());
                personalDTO.setUsername(msUsers1.getUsername());
                list.add(personalDTO);
            }
            PageInfo pageInfo = new PageInfo(list);
            return list.size()>0?R.ok().put("data",pageInfo):R.error();
    }

    //个人中心——精选文章s
    @Override
    public R findSfit() {
        List<ArticleDTO> list = new ArrayList<>();
        MsArticleExample example1 = new MsArticleExample();
        List<MsArticle> msArticles = msArticleMapper.selectByExample(example1);
        //random.nextInt(max) % (max - min + 1) + min;
        Random random = new Random();
        int size = msArticles.size();
        if (size<=4){
            for (MsArticle msArticle : msArticles) {
                ArticleDTO msArticleDTO = new ArticleDTO();
                msArticleDTO.setArtId(msArticle.getArtid());//文章id
                msArticleDTO.setTitle(msArticle.getTitle());//文章标题
                list.add(msArticleDTO);
            }
        }else{
            for (int i = random.nextInt(size-4)%(size-4+1) ; i < 4; i++) {
                ArticleDTO msArticleDTO = new ArticleDTO();
                msArticleDTO.setArtId(msArticles.get(i).getArtid());//文章id
                msArticleDTO.setTitle(msArticles.get(i).getTitle());//文章标题
                list.add(msArticleDTO);
            }
        }
        return list.size()>0?R.ok().put("data",list):R.error();
    }
}
