package com.lh.entity;

public class MsLable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ms_lable.lableId
     *
     * @mbggenerated Fri Apr 19 21:06:35 CST 2019
     */
    private Long lableid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ms_lable.description
     *
     * @mbggenerated Fri Apr 19 21:06:35 CST 2019
     */
    private String description;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ms_lable.lableId
     *
     * @return the value of ms_lable.lableId
     *
     * @mbggenerated Fri Apr 19 21:06:35 CST 2019
     */
    public Long getLableid() {
        return lableid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ms_lable.lableId
     *
     * @param lableid the value for ms_lable.lableId
     *
     * @mbggenerated Fri Apr 19 21:06:35 CST 2019
     */
    public void setLableid(Long lableid) {
        this.lableid = lableid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ms_lable.description
     *
     * @return the value of ms_lable.description
     *
     * @mbggenerated Fri Apr 19 21:06:35 CST 2019
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ms_lable.description
     *
     * @param description the value for ms_lable.description
     *
     * @mbggenerated Fri Apr 19 21:06:35 CST 2019
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}