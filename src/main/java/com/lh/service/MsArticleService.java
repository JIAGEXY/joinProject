package com.lh.service;

import com.lh.dto.MsArticleDto;
import com.lh.entity.MsUserArt;
import com.lh.utils.R;

public interface MsArticleService {
    public R publisharticles(Long artid, Long lableid, String title, String imgurl, String txturl);
    public MsArticleDto selectone(Long artid);
    public R thumbsup(Long artid);
    public R collect(MsUserArt userArt);
}
