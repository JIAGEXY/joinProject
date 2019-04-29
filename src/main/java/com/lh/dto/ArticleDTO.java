package com.lh.dto;

public class ArticleDTO {
    private String title;//文章标题
    private String content;//文章内容
    private Long artId;//文章id
    private String description;//标签文字，描述
    private String artImg;//图片地址

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getArtId() {
        return artId;
    }

    public void setArtId(Long artId) {
        this.artId = artId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getArtImg() {
        return artImg;
    }

    public void setArtImg(String artImg) {
        this.artImg = artImg;
    }
}
