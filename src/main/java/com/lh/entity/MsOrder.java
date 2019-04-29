package com.lh.entity;

import java.math.BigDecimal;
import java.util.Date;

public class MsOrder {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ms_order.orderId
     *
     * @mbggenerated Tue Apr 23 20:48:05 CST 2019
     */
    private Long orderid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ms_order.orderNumber
     *
     * @mbggenerated Tue Apr 23 20:48:05 CST 2019
     */
    private String ordernumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ms_order.result
     *
     * @mbggenerated Tue Apr 23 20:48:05 CST 2019
     */
    private String result;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ms_order.resultDate
     *
     * @mbggenerated Tue Apr 23 20:48:05 CST 2019
     */
    private Date resultdate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ms_order.tradenum
     *
     * @mbggenerated Tue Apr 23 20:48:05 CST 2019
     */
    private String tradenum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ms_order.orderinfo
     *
     * @mbggenerated Tue Apr 23 20:48:05 CST 2019
     */
    private String orderinfo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ms_order.startDate
     *
     * @mbggenerated Tue Apr 23 20:48:05 CST 2019
     */
    private Date startdate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ms_order.outDate
     *
     * @mbggenerated Tue Apr 23 20:48:05 CST 2019
     */
    private Date outdate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ms_order.number
     *
     * @mbggenerated Tue Apr 23 20:48:05 CST 2019
     */
    private Integer number;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ms_order.roomId
     *
     * @mbggenerated Tue Apr 23 20:48:05 CST 2019
     */
    private Long roomid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ms_order.landId
     *
     * @mbggenerated Tue Apr 23 20:48:05 CST 2019
     */
    private Long landid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ms_order.money
     *
     * @mbggenerated Tue Apr 23 20:48:05 CST 2019
     */
    private BigDecimal money;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ms_order.deposit
     *
     * @mbggenerated Tue Apr 23 20:48:05 CST 2019
     */
    private BigDecimal deposit;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ms_order.status
     *
     * @mbggenerated Tue Apr 23 20:48:05 CST 2019
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ms_order.checkPerson
     *
     * @mbggenerated Tue Apr 23 20:48:05 CST 2019
     */
    private String checkperson;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ms_order.cardNo
     *
     * @mbggenerated Tue Apr 23 20:48:05 CST 2019
     */
    private String cardno;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ms_order.phone
     *
     * @mbggenerated Tue Apr 23 20:48:05 CST 2019
     */
    private String phone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ms_order.userId
     *
     * @mbggenerated Tue Apr 23 20:48:05 CST 2019
     */
    private Long userid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ms_order.createTime
     *
     * @mbggenerated Tue Apr 23 20:48:05 CST 2019
     */
    private Date createtime;

    private String roomimg;
    private String roomname;

    public String getRoomname() {
        return roomname;
    }

    public void setRoomname(String roomname) {
        this.roomname = roomname;
    }

    public String getRoomimg() {
        return roomimg;
    }

    public void setRoomimg(String roomimg) {
        this.roomimg = roomimg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ms_order.orderId
     *
     * @return the value of ms_order.orderId
     *
     * @mbggenerated Tue Apr 23 20:48:05 CST 2019
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
     * @mbggenerated Tue Apr 23 20:48:05 CST 2019
     */
    public void setOrderid(Long orderid) {
        this.orderid = orderid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ms_order.orderNumber
     *
     * @return the value of ms_order.orderNumber
     *
     * @mbggenerated Tue Apr 23 20:48:05 CST 2019
     */
    public String getOrdernumber() {
        return ordernumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ms_order.orderNumber
     *
     * @param ordernumber the value for ms_order.orderNumber
     *
     * @mbggenerated Tue Apr 23 20:48:05 CST 2019
     */
    public void setOrdernumber(String ordernumber) {
        this.ordernumber = ordernumber == null ? null : ordernumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ms_order.result
     *
     * @return the value of ms_order.result
     *
     * @mbggenerated Tue Apr 23 20:48:05 CST 2019
     */
    public String getResult() {
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ms_order.result
     *
     * @param result the value for ms_order.result
     *
     * @mbggenerated Tue Apr 23 20:48:05 CST 2019
     */
    public void setResult(String result) {
        this.result = result == null ? null : result.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ms_order.resultDate
     *
     * @return the value of ms_order.resultDate
     *
     * @mbggenerated Tue Apr 23 20:48:05 CST 2019
     */
    public Date getResultdate() {
        return resultdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ms_order.resultDate
     *
     * @param resultdate the value for ms_order.resultDate
     *
     * @mbggenerated Tue Apr 23 20:48:05 CST 2019
     */
    public void setResultdate(Date resultdate) {
        this.resultdate = resultdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ms_order.tradenum
     *
     * @return the value of ms_order.tradenum
     *
     * @mbggenerated Tue Apr 23 20:48:05 CST 2019
     */
    public String getTradenum() {
        return tradenum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ms_order.tradenum
     *
     * @param tradenum the value for ms_order.tradenum
     *
     * @mbggenerated Tue Apr 23 20:48:05 CST 2019
     */
    public void setTradenum(String tradenum) {
        this.tradenum = tradenum == null ? null : tradenum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ms_order.orderinfo
     *
     * @return the value of ms_order.orderinfo
     *
     * @mbggenerated Tue Apr 23 20:48:05 CST 2019
     */
    public String getOrderinfo() {
        return orderinfo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ms_order.orderinfo
     *
     * @param orderinfo the value for ms_order.orderinfo
     *
     * @mbggenerated Tue Apr 23 20:48:05 CST 2019
     */
    public void setOrderinfo(String orderinfo) {
        this.orderinfo = orderinfo == null ? null : orderinfo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ms_order.startDate
     *
     * @return the value of ms_order.startDate
     *
     * @mbggenerated Tue Apr 23 20:48:05 CST 2019
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
     * @mbggenerated Tue Apr 23 20:48:05 CST 2019
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
     * @mbggenerated Tue Apr 23 20:48:05 CST 2019
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
     * @mbggenerated Tue Apr 23 20:48:05 CST 2019
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
     * @mbggenerated Tue Apr 23 20:48:05 CST 2019
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
     * @mbggenerated Tue Apr 23 20:48:05 CST 2019
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
     * @mbggenerated Tue Apr 23 20:48:05 CST 2019
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
     * @mbggenerated Tue Apr 23 20:48:05 CST 2019
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
     * @mbggenerated Tue Apr 23 20:48:05 CST 2019
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
     * @mbggenerated Tue Apr 23 20:48:05 CST 2019
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
     * @mbggenerated Tue Apr 23 20:48:05 CST 2019
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
     * @mbggenerated Tue Apr 23 20:48:05 CST 2019
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
     * @mbggenerated Tue Apr 23 20:48:05 CST 2019
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
     * @mbggenerated Tue Apr 23 20:48:05 CST 2019
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
     * @mbggenerated Tue Apr 23 20:48:05 CST 2019
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
     * @mbggenerated Tue Apr 23 20:48:05 CST 2019
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
     * @mbggenerated Tue Apr 23 20:48:05 CST 2019
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
     * @mbggenerated Tue Apr 23 20:48:05 CST 2019
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
     * @mbggenerated Tue Apr 23 20:48:05 CST 2019
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
     * @mbggenerated Tue Apr 23 20:48:05 CST 2019
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
     * @mbggenerated Tue Apr 23 20:48:05 CST 2019
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
     * @mbggenerated Tue Apr 23 20:48:05 CST 2019
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
     * @mbggenerated Tue Apr 23 20:48:05 CST 2019
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
     * @mbggenerated Tue Apr 23 20:48:05 CST 2019
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
     * @mbggenerated Tue Apr 23 20:48:05 CST 2019
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
     * @mbggenerated Tue Apr 23 20:48:05 CST 2019
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}