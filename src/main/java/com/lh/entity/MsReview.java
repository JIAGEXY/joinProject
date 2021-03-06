package com.lh.entity;

import java.util.Date;

public class MsReview {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ms_review.reviewId
     *
     * @mbggenerated Fri Apr 26 10:17:57 CST 2019
     */
    private Long reviewid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ms_review.content
     *
     * @mbggenerated Fri Apr 26 10:17:57 CST 2019
     */
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ms_review.likeNum
     *
     * @mbggenerated Fri Apr 26 10:17:57 CST 2019
     */
    private Integer likenum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ms_review.unLikeNum
     *
     * @mbggenerated Fri Apr 26 10:17:57 CST 2019
     */
    private Integer unlikenum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ms_review.userId
     *
     * @mbggenerated Fri Apr 26 10:17:57 CST 2019
     */
    private Long userid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ms_review.artId
     *
     * @mbggenerated Fri Apr 26 10:17:57 CST 2019
     */
    private Long artid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ms_review.parentId
     *
     * @mbggenerated Fri Apr 26 10:17:57 CST 2019
     */
    private Long parentid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ms_review.createTime
     *
     * @mbggenerated Fri Apr 26 10:17:57 CST 2019
     */
    private Date createtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ms_review.username
     *
     * @mbggenerated Fri Apr 26 10:17:57 CST 2019
     */
    private String username;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ms_review.headPhoto
     *
     * @mbggenerated Fri Apr 26 10:17:57 CST 2019
     */
    private String headphoto;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ms_review.reviewId
     *
     * @return the value of ms_review.reviewId
     *
     * @mbggenerated Fri Apr 26 10:17:57 CST 2019
     */
    public Long getReviewid() {
        return reviewid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ms_review.reviewId
     *
     * @param reviewid the value for ms_review.reviewId
     *
     * @mbggenerated Fri Apr 26 10:17:57 CST 2019
     */
    public void setReviewid(Long reviewid) {
        this.reviewid = reviewid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ms_review.content
     *
     * @return the value of ms_review.content
     *
     * @mbggenerated Fri Apr 26 10:17:57 CST 2019
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ms_review.content
     *
     * @param content the value for ms_review.content
     *
     * @mbggenerated Fri Apr 26 10:17:57 CST 2019
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ms_review.likeNum
     *
     * @return the value of ms_review.likeNum
     *
     * @mbggenerated Fri Apr 26 10:17:57 CST 2019
     */
    public Integer getLikenum() {
        return likenum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ms_review.likeNum
     *
     * @param likenum the value for ms_review.likeNum
     *
     * @mbggenerated Fri Apr 26 10:17:57 CST 2019
     */
    public void setLikenum(Integer likenum) {
        this.likenum = likenum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ms_review.unLikeNum
     *
     * @return the value of ms_review.unLikeNum
     *
     * @mbggenerated Fri Apr 26 10:17:57 CST 2019
     */
    public Integer getUnlikenum() {
        return unlikenum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ms_review.unLikeNum
     *
     * @param unlikenum the value for ms_review.unLikeNum
     *
     * @mbggenerated Fri Apr 26 10:17:57 CST 2019
     */
    public void setUnlikenum(Integer unlikenum) {
        this.unlikenum = unlikenum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ms_review.userId
     *
     * @return the value of ms_review.userId
     *
     * @mbggenerated Fri Apr 26 10:17:57 CST 2019
     */
    public Long getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ms_review.userId
     *
     * @param userid the value for ms_review.userId
     *
     * @mbggenerated Fri Apr 26 10:17:57 CST 2019
     */
    public void setUserid(Long userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ms_review.artId
     *
     * @return the value of ms_review.artId
     *
     * @mbggenerated Fri Apr 26 10:17:57 CST 2019
     */
    public Long getArtid() {
        return artid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ms_review.artId
     *
     * @param artid the value for ms_review.artId
     *
     * @mbggenerated Fri Apr 26 10:17:57 CST 2019
     */
    public void setArtid(Long artid) {
        this.artid = artid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ms_review.parentId
     *
     * @return the value of ms_review.parentId
     *
     * @mbggenerated Fri Apr 26 10:17:57 CST 2019
     */
    public Long getParentid() {
        return parentid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ms_review.parentId
     *
     * @param parentid the value for ms_review.parentId
     *
     * @mbggenerated Fri Apr 26 10:17:57 CST 2019
     */
    public void setParentid(Long parentid) {
        this.parentid = parentid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ms_review.createTime
     *
     * @return the value of ms_review.createTime
     *
     * @mbggenerated Fri Apr 26 10:17:57 CST 2019
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ms_review.createTime
     *
     * @param createtime the value for ms_review.createTime
     *
     * @mbggenerated Fri Apr 26 10:17:57 CST 2019
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ms_review.username
     *
     * @return the value of ms_review.username
     *
     * @mbggenerated Fri Apr 26 10:17:57 CST 2019
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ms_review.username
     *
     * @param username the value for ms_review.username
     *
     * @mbggenerated Fri Apr 26 10:17:57 CST 2019
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ms_review.headPhoto
     *
     * @return the value of ms_review.headPhoto
     *
     * @mbggenerated Fri Apr 26 10:17:57 CST 2019
     */
    public String getHeadphoto() {
        return headphoto;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ms_review.headPhoto
     *
     * @param headphoto the value for ms_review.headPhoto
     *
     * @mbggenerated Fri Apr 26 10:17:57 CST 2019
     */
    public void setHeadphoto(String headphoto) {
        this.headphoto = headphoto == null ? null : headphoto.trim();
    }
}