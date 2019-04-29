package com.lh.dto;

import com.lh.entity.MsArticle;

public class MsArticleDto extends MsArticle {
    private String username;
    private String headphoto;

    public String getHeadphoto() {
        return headphoto;
    }

    public void setHeadphoto(String headphoto) {
        this.headphoto = headphoto;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


}
