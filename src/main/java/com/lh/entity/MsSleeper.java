package com.lh.entity;

public class MsSleeper {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ms_sleeper.sleeperId
     *
     * @mbggenerated Thu Apr 11 10:41:04 CST 2019
     */
    private Long sleeperid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ms_sleeper.cardNo
     *
     * @mbggenerated Thu Apr 11 10:41:04 CST 2019
     */
    private String cardno;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ms_sleeper.houseStyle
     *
     * @mbggenerated Thu Apr 11 10:41:04 CST 2019
     */
    private String housestyle;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ms_sleeper.likeCity
     *
     * @mbggenerated Thu Apr 11 10:41:04 CST 2019
     */
    private String likecity;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ms_sleeper.sleeperId
     *
     * @return the value of ms_sleeper.sleeperId
     *
     * @mbggenerated Thu Apr 11 10:41:04 CST 2019
     */
    public Long getSleeperid() {
        return sleeperid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ms_sleeper.sleeperId
     *
     * @param sleeperid the value for ms_sleeper.sleeperId
     *
     * @mbggenerated Thu Apr 11 10:41:04 CST 2019
     */
    public void setSleeperid(Long sleeperid) {
        this.sleeperid = sleeperid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ms_sleeper.cardNo
     *
     * @return the value of ms_sleeper.cardNo
     *
     * @mbggenerated Thu Apr 11 10:41:04 CST 2019
     */
    public String getCardno() {
        return cardno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ms_sleeper.cardNo
     *
     * @param cardno the value for ms_sleeper.cardNo
     *
     * @mbggenerated Thu Apr 11 10:41:04 CST 2019
     */
    public void setCardno(String cardno) {
        this.cardno = cardno == null ? null : cardno.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ms_sleeper.houseStyle
     *
     * @return the value of ms_sleeper.houseStyle
     *
     * @mbggenerated Thu Apr 11 10:41:04 CST 2019
     */
    public String getHousestyle() {
        return housestyle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ms_sleeper.houseStyle
     *
     * @param housestyle the value for ms_sleeper.houseStyle
     *
     * @mbggenerated Thu Apr 11 10:41:04 CST 2019
     */
    public void setHousestyle(String housestyle) {
        this.housestyle = housestyle == null ? null : housestyle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ms_sleeper.likeCity
     *
     * @return the value of ms_sleeper.likeCity
     *
     * @mbggenerated Thu Apr 11 10:41:04 CST 2019
     */
    public String getLikecity() {
        return likecity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ms_sleeper.likeCity
     *
     * @param likecity the value for ms_sleeper.likeCity
     *
     * @mbggenerated Thu Apr 11 10:41:04 CST 2019
     */
    public void setLikecity(String likecity) {
        this.likecity = likecity == null ? null : likecity.trim();
    }
}