package com.lh.entity;

public class MsSleeper {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ms_sleeper.sleeperId
     *
     * @mbggenerated Fri Apr 19 08:42:06 CST 2019
     */
    private Long sleeperid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ms_sleeper.cardNo
     *
     * @mbggenerated Fri Apr 19 08:42:06 CST 2019
     */
    private String cardno;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ms_sleeper.type
     *
     * @mbggenerated Fri Apr 19 08:42:06 CST 2019
     */
    private String type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ms_sleeper.likeCity
     *
     * @mbggenerated Fri Apr 19 08:42:06 CST 2019
     */
    private String likecity;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ms_sleeper.sleeperId
     *
     * @return the value of ms_sleeper.sleeperId
     *
     * @mbggenerated Fri Apr 19 08:42:06 CST 2019
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
     * @mbggenerated Fri Apr 19 08:42:06 CST 2019
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
     * @mbggenerated Fri Apr 19 08:42:06 CST 2019
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
     * @mbggenerated Fri Apr 19 08:42:06 CST 2019
     */
    public void setCardno(String cardno) {
        this.cardno = cardno == null ? null : cardno.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ms_sleeper.type
     *
     * @return the value of ms_sleeper.type
     *
     * @mbggenerated Fri Apr 19 08:42:06 CST 2019
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ms_sleeper.type
     *
     * @param type the value for ms_sleeper.type
     *
     * @mbggenerated Fri Apr 19 08:42:06 CST 2019
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ms_sleeper.likeCity
     *
     * @return the value of ms_sleeper.likeCity
     *
     * @mbggenerated Fri Apr 19 08:42:06 CST 2019
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
     * @mbggenerated Fri Apr 19 08:42:06 CST 2019
     */
    public void setLikecity(String likecity) {
        this.likecity = likecity == null ? null : likecity.trim();
    }
}