package com.lh.dto;

public class PersonalDTO {
    private Byte type; //类型 1是租客 2是房东
    private String artImg;//图片地址
    private String art;//文章内容地址
    private String title;//文章标题
    private String username;//用户名

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public String getArtImg() {
        return artImg;
    }

    public void setArtImg(String artImg) {
        this.artImg = artImg;
    }

    public String getArt() {
        return art;
    }

    public void setArt(String art) {
        this.art = art;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
