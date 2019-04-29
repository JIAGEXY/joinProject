package com.lh.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lh.dto.ArticleDTO;
import com.lh.entity.*;
import com.lh.mapper.MsArtLableMapper;
import com.lh.mapper.MsArticleMapper;
import com.lh.mapper.MsLableMapper;
import com.lh.service.MsCommunityService;
import com.lh.utils.R;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class MsCommunityServiceImpl implements MsCommunityService {

    @Resource
    private MsArticleMapper msArticleMapper;//发表文章表
    @Resource
    private MsArtLableMapper msArtLableMapper;//文章标签表
    @Resource
    private MsLableMapper msLableMapper;//标签表

    @Override
    public R find(int nowPage, int pageSize) {
        PageHelper.startPage(nowPage,pageSize);
        List<ArticleDTO> list = new ArrayList<>();
        MsArticleExample example1 = new MsArticleExample();
        List<MsArticle> msArticles = msArticleMapper.selectByExample(example1);
        for (MsArticle msArticle : msArticles) {
            ArticleDTO msArticleDTO = new ArticleDTO();
            //根据发表文章表Artid查询文章标签表得到标签表ArtLable
            MsArtLableExample example = new MsArtLableExample();
            MsArtLableExample.Criteria criteria = example.createCriteria();
            criteria.andArtidEqualTo(msArticle.getArtid());
            List<MsArtLable> msArtLables = msArtLableMapper.selectByExample(example);
            for (MsArtLable msArtLable : msArtLables) {
                Long id = msArtLable.getLableid();
                //根据查询文章标签表得到标签表ArtLable查询Description标签文字，描述
                MsLable msLables = msLableMapper.selectByPrimaryKey(id);
                msArticleDTO.setDescription(msLables.getDescription());//标签文字，描述
            }
            msArticleDTO.setTitle(msArticle.getTitle());//文章标题
            msArticleDTO.setContent(msArticle.getContent());//文章内容
            msArticleDTO.setArtId(msArticle.getArtid());//文章id
            msArticleDTO.setArtImg(msArticle.getArtimg());//图片地址
            list.add(msArticleDTO);
        }

        PageInfo pageInfo = new PageInfo(list);

        return list.size()>0?R.ok().put("data",pageInfo):R.error();
    }
}
