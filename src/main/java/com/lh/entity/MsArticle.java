package com.lh.entity;

import java.util.Date;

public class MsArticle {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ms_article.artId
     *
     * @mbggenerated Fri Apr 19 08:20:12 CST 2019
     */
    private Long artid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ms_article.title
     *
     * @mbggenerated Fri Apr 19 08:20:12 CST 2019
     */
    private String title;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ms_article.content
     *
     * @mbggenerated Fri Apr 19 08:20:12 CST 2019
     */
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ms_article.artPic
     *
     * @mbggenerated Fri Apr 19 08:20:12 CST 2019
     */
    private String artpic;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ms_article.userId
     *
     * @mbggenerated Fri Apr 19 08:20:12 CST 2019
     */
    private Long userid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ms_article.browse
     *
     * @mbggenerated Fri Apr 19 08:20:12 CST 2019
     */
    private Integer browse;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ms_article.likeNum
     *
     * @mbggenerated Fri Apr 19 08:20:12 CST 2019
     */
    private Integer likenum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ms_article.collection
     *
     * @mbggenerated Fri Apr 19 08:20:12 CST 2019
     */
    private Integer collection;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ms_article.status
     *
     * @mbggenerated Fri Apr 19 08:20:12 CST 2019
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ms_article.createTime
     *
     * @mbggenerated Fri Apr 19 08:20:12 CST 2019
     */
    private Date createtime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ms_article.artId
     *
     * @return the value of ms_article.artId
     *
     * @mbggenerated Fri Apr 19 08:20:12 CST 2019
     */
    public Long getArtid() {
        return artid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ms_article.artId
     *
     * @param artid the value for ms_article.artId
     *
     * @mbggenerated Fri Apr 19 08:20:12 CST 2019
     */
    public void setArtid(Long artid) {
        this.artid = artid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ms_article.title
     *
     * @return the value of ms_article.title
     *
     * @mbggenerated Fri Apr 19 08:20:12 CST 2019
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ms_article.title
     *
     * @param title the value for ms_article.title
     *
     * @mbggenerated Fri Apr 19 08:20:12 CST 2019
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ms_article.content
     *
     * @return the value of ms_article.content
     *
     * @mbggenerated Fri Apr 19 08:20:12 CST 2019
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ms_article.content
     *
     * @param content the value for ms_article.content
     *
     * @mbggenerated Fri Apr 19 08:20:12 CST 2019
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ms_article.artPic
     *
     * @return the value of ms_article.artPic
     *
     * @mbggenerated Fri Apr 19 08:20:12 CST 2019
     */
    public String getArtpic() {
        return artpic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ms_article.artPic
     *
     * @param artpic the value for ms_article.artPic
     *
     * @mbggenerated Fri Apr 19 08:20:12 CST 2019
     */
    public void setArtpic(String artpic) {
        this.artpic = artpic == null ? null : artpic.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ms_article.userId
     *
     * @return the value of ms_article.userId
     *
     * @mbggenerated Fri Apr 19 08:20:12 CST 2019
     */
    public Long getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ms_article.userId
     *
     * @param userid the value for ms_article.userId
     *
     * @mbggenerated Fri Apr 19 08:20:12 CST 2019
     */
    public void setUserid(Long userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ms_article.browse
     *
     * @return the value of ms_article.browse
     *
     * @mbggenerated Fri Apr 19 08:20:12 CST 2019
     */
    public Integer getBrowse() {
        return browse;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ms_article.browse
     *
     * @param browse the value for ms_article.browse
     *
     * @mbggenerated Fri Apr 19 08:20:12 CST 2019
     */
    public void setBrowse(Integer browse) {
        this.browse = browse;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ms_article.likeNum
     *
     * @return the value of ms_article.likeNum
     *
     * @mbggenerated Fri Apr 19 08:20:12 CST 2019
     */
    public Integer getLikenum() {
        return likenum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ms_article.likeNum
     *
     * @param likenum the value for ms_article.likeNum
     *
     * @mbggenerated Fri Apr 19 08:20:12 CST 2019
     */
    public void setLikenum(Integer likenum) {
        this.likenum = likenum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ms_article.collection
     *
     * @return the value of ms_article.collection
     *
     * @mbggenerated Fri Apr 19 08:20:12 CST 2019
     */
    public Integer getCollection() {
        return collection;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ms_article.collection
     *
     * @param collection the value for ms_article.collection
     *
     * @mbggenerated Fri Apr 19 08:20:12 CST 2019
     */
    public void setCollection(Integer collection) {
        this.collection = collection;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ms_article.status
     *
     * @return the value of ms_article.status
     *
     * @mbggenerated Fri Apr 19 08:20:12 CST 2019
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ms_article.status
     *
     * @param status the value for ms_article.status
     *
     * @mbggenerated Fri Apr 19 08:20:12 CST 2019
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ms_article.createTime
     *
     * @return the value of ms_article.createTime
     *
     * @mbggenerated Fri Apr 19 08:20:12 CST 2019
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ms_article.createTime
     *
     * @param createtime the value for ms_article.createTime
     *
     * @mbggenerated Fri Apr 19 08:20:12 CST 2019
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}