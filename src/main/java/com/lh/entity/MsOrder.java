package com.lh.entity;

import java.math.BigDecimal;
import java.util.Date;

public class MsOrder {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ms_order.orderId
     *
     * @mbggenerated Fri Apr 19 22:14:25 CST 2019
     */
    private Long orderid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ms_order.startDate
     *
     * @mbggenerated Fri Apr 19 22:14:25 CST 2019
     */
    private Date startdate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ms_order.outDate
     *
     * @mbggenerated Fri Apr 19 22:14:25 CST 2019
     */
    private Date outdate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ms_order.number
     *
     * @mbggenerated Fri Apr 19 22:14:25 CST 2019
     */
    private Integer number;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ms_order.roomId
     *
     * @mbggenerated Fri Apr 19 22:14:25 CST 2019
     */
    private Long roomid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ms_order.landId
     *
     * @mbggenerated Fri Apr 19 22:14:25 CST 2019
     */
    private Long landid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ms_order.money
     *
     * @mbggenerated Fri Apr 19 22:14:25 CST 2019
     */
    private BigDecimal money;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ms_order.deposit
     *
     * @mbggenerated Fri Apr 19 22:14:25 CST 2019
     */
    private BigDecimal deposit;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ms_order.status
     *
     * @mbggenerated Fri Apr 19 22:14:25 CST 2019
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ms_order.checkPerson
     *
     * @mbggenerated Fri Apr 19 22:14:25 CST 2019
     */
    private String checkperson;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ms_order.cardNo
     *
     * @mbggenerated Fri Apr 19 22:14:25 CST 2019
     */
    private String cardno;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ms_order.phone
     *
     * @mbggenerated Fri Apr 19 22:14:25 CST 2019
     */
    private String phone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ms_order.userId
     *
     * @mbggenerated Fri Apr 19 22:14:25 CST 2019
     */
    private Long userid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ms_order.createTime
     *
     * @mbggenerated Fri Apr 19 22:14:25 CST 2019
     */
    private Date createtime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ms_order.orderId
     *
     * @return the value of ms_order.orderId
     *
     * @mbggenerated Fri Apr 19 22:14:25 CST 2019
     */
    public Long getOrderid() {
        return orderid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ms_order.orderId
     *
     * @param orderid the value for ms_order.orderId
     *
     * @mbggenerated Fri Apr 19 22:14:25 CST 2019
     */
    public void setOrderid(Long orderid) {
        this.orderid = orderid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ms_order.startDate
     *
     * @return the value of ms_order.startDate
     *
     * @mbggenerated Fri Apr 19 22:14:25 CST 2019
     */
    public Date getStartdate() {
        return startdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ms_order.startDate
     *
     * @param startdate the value for ms_order.startDate
     *
     * @mbggenerated Fri Apr 19 22:14:25 CST 2019
     */
    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ms_order.outDate
     *
     * @return the value of ms_order.outDate
     *
     * @mbggenerated Fri Apr 19 22:14:25 CST 2019
     */
    public Date getOutdate() {
        return outdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ms_order.outDate
     *
     * @param outdate the value for ms_order.outDate
     *
     * @mbggenerated Fri Apr 19 22:14:25 CST 2019
     */
    public void setOutdate(Date outdate) {
        this.outdate = outdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ms_order.number
     *
     * @return the value of ms_order.number
     *
     * @mbggenerated Fri Apr 19 22:14:25 CST 2019
     */
    public Integer getNumber() {
        return number;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ms_order.number
     *
     * @param number the value for ms_order.number
     *
     * @mbggenerated Fri Apr 19 22:14:25 CST 2019
     */
    public void setNumber(Integer number) {
        this.number = number;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ms_order.roomId
     *
     * @return the value of ms_order.roomId
     *
     * @mbggenerated Fri Apr 19 22:14:25 CST 2019
     */
    public Long getRoomid() {
        return roomid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ms_order.roomId
     *
     * @param roomid the value for ms_order.roomId
     *
     * @mbggenerated Fri Apr 19 22:14:25 CST 2019
     */
    public void setRoomid(Long roomid) {
        this.roomid = roomid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ms_order.landId
     *
     * @return the value of ms_order.landId
     *
     * @mbggenerated Fri Apr 19 22:14:25 CST 2019
     */
    public Long getLandid() {
        return landid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ms_order.landId
     *
     * @param landid the value for ms_order.landId
     *
     * @mbggenerated Fri Apr 19 22:14:25 CST 2019
     */
    public void setLandid(Long landid) {
        this.landid = landid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ms_order.money
     *
     * @return the value of ms_order.money
     *
     * @mbggenerated Fri Apr 19 22:14:25 CST 2019
     */
    public BigDecimal getMoney() {
        return money;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ms_order.money
     *
     * @param money the value for ms_order.money
     *
     * @mbggenerated Fri Apr 19 22:14:25 CST 2019
     */
    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ms_order.deposit
     *
     * @return the value of ms_order.deposit
     *
     * @mbggenerated Fri Apr 19 22:14:25 CST 2019
     */
    public BigDecimal getDeposit() {
        return deposit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ms_order.deposit
     *
     * @param deposit the value for ms_order.deposit
     *
     * @mbggenerated Fri Apr 19 22:14:25 CST 2019
     */
    public void setDeposit(BigDecimal deposit) {
        this.deposit = deposit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ms_order.status
     *
     * @return the value of ms_order.status
     *
     * @mbggenerated Fri Apr 19 22:14:25 CST 2019
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ms_order.status
     *
     * @param status the value for ms_order.status
     *
     * @mbggenerated Fri Apr 19 22:14:25 CST 2019
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ms_order.checkPerson
     *
     * @return the value of ms_order.checkPerson
     *
     * @mbggenerated Fri Apr 19 22:14:25 CST 2019
     */
    public String getCheckperson() {
        return checkperson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ms_order.checkPerson
     *
     * @param checkperson the value for ms_order.checkPerson
     *
     * @mbggenerated Fri Apr 19 22:14:25 CST 2019
     */
    public void setCheckperson(String checkperson) {
        this.checkperson = checkperson == null ? null : checkperson.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ms_order.cardNo
     *
     * @return the value of ms_order.cardNo
     *
     * @mbggenerated Fri Apr 19 22:14:25 CST 2019
     */
    public String getCardno() {
        return cardno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ms_order.cardNo
     *
     * @param cardno the value for ms_order.cardNo
     *
     * @mbggenerated Fri Apr 19 22:14:25 CST 2019
     */
    public void setCardno(String cardno) {
        this.cardno = cardno == null ? null : cardno.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ms_order.phone
     *
     * @return the value of ms_order.phone
     *
     * @mbggenerated Fri Apr 19 22:14:25 CST 2019
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ms_order.phone
     *
     * @param phone the value for ms_order.phone
     *
     * @mbggenerated Fri Apr 19 22:14:25 CST 2019
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ms_order.userId
     *
     * @return the value of ms_order.userId
     *
     * @mbggenerated Fri Apr 19 22:14:25 CST 2019
     */
    public Long getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ms_order.userId
     *
     * @param userid the value for ms_order.userId
     *
     * @mbggenerated Fri Apr 19 22:14:25 CST 2019
     */
    public void setUserid(Long userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ms_order.createTime
     *
     * @return the value of ms_order.createTime
     *
     * @mbggenerated Fri Apr 19 22:14:25 CST 2019
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ms_order.createTime
     *
     * @param createtime the value for ms_order.createTime
     *
     * @mbggenerated Fri Apr 19 22:14:25 CST 2019
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}