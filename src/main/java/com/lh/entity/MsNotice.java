package com.lh.entity;

import java.util.Date;

public class MsNotice {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ms_notice.noticeId
     *
     * @mbggenerated Fri Apr 19 08:20:12 CST 2019
     */
    private Long noticeid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ms_notice.title
     *
     * @mbggenerated Fri Apr 19 08:20:12 CST 2019
     */
    private String title;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ms_notice.userId
     *
     * @mbggenerated Fri Apr 19 08:20:12 CST 2019
     */
    private Long userid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ms_notice.startTime
     *
     * @mbggenerated Fri Apr 19 08:20:12 CST 2019
     */
    private Date starttime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ms_notice.endTime
     *
     * @mbggenerated Fri Apr 19 08:20:12 CST 2019
     */
    private Date endtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ms_notice.discount
     *
     * @mbggenerated Fri Apr 19 08:20:12 CST 2019
     */
    private String discount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ms_notice.description
     *
     * @mbggenerated Fri Apr 19 08:20:12 CST 2019
     */
    private String description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ms_notice.createTime
     *
     * @mbggenerated Fri Apr 19 08:20:12 CST 2019
     */
    private Date createtime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ms_notice.noticeId
     *
     * @return the value of ms_notice.noticeId
     *
     * @mbggenerated Fri Apr 19 08:20:12 CST 2019
     */
    public Long getNoticeid() {
        return noticeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ms_notice.noticeId
     *
     * @param noticeid the value for ms_notice.noticeId
     *
     * @mbggenerated Fri Apr 19 08:20:12 CST 2019
     */
    public void setNoticeid(Long noticeid) {
        this.noticeid = noticeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ms_notice.title
     *
     * @return the value of ms_notice.title
     *
     * @mbggenerated Fri Apr 19 08:20:12 CST 2019
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ms_notice.title
     *
     * @param title the value for ms_notice.title
     *
     * @mbggenerated Fri Apr 19 08:20:12 CST 2019
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ms_notice.userId
     *
     * @return the value of ms_notice.userId
     *
     * @mbggenerated Fri Apr 19 08:20:12 CST 2019
     */
    public Long getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ms_notice.userId
     *
     * @param userid the value for ms_notice.userId
     *
     * @mbggenerated Fri Apr 19 08:20:12 CST 2019
     */
    public void setUserid(Long userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ms_notice.startTime
     *
     * @return the value of ms_notice.startTime
     *
     * @mbggenerated Fri Apr 19 08:20:12 CST 2019
     */
    public Date getStarttime() {
        return starttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ms_notice.startTime
     *
     * @param starttime the value for ms_notice.startTime
     *
     * @mbggenerated Fri Apr 19 08:20:12 CST 2019
     */
    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ms_notice.endTime
     *
     * @return the value of ms_notice.endTime
     *
     * @mbggenerated Fri Apr 19 08:20:12 CST 2019
     */
    public Date getEndtime() {
        return endtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ms_notice.endTime
     *
     * @param endtime the value for ms_notice.endTime
     *
     * @mbggenerated Fri Apr 19 08:20:12 CST 2019
     */
    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ms_notice.discount
     *
     * @return the value of ms_notice.discount
     *
     * @mbggenerated Fri Apr 19 08:20:12 CST 2019
     */
    public String getDiscount() {
        return discount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ms_notice.discount
     *
     * @param discount the value for ms_notice.discount
     *
     * @mbggenerated Fri Apr 19 08:20:12 CST 2019
     */
    public void setDiscount(String discount) {
        this.discount = discount == null ? null : discount.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ms_notice.description
     *
     * @return the value of ms_notice.description
     *
     * @mbggenerated Fri Apr 19 08:20:12 CST 2019
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ms_notice.description
     *
     * @param description the value for ms_notice.description
     *
     * @mbggenerated Fri Apr 19 08:20:12 CST 2019
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ms_notice.createTime
     *
     * @return the value of ms_notice.createTime
     *
     * @mbggenerated Fri Apr 19 08:20:12 CST 2019
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ms_notice.createTime
     *
     * @param createtime the value for ms_notice.createTime
     *
     * @mbggenerated Fri Apr 19 08:20:12 CST 2019
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}