package com.lh.entity;

public class MsHobby {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ms_hobby.hobbyId
     *
     * @mbggenerated Thu Apr 11 19:30:00 CST 2019
     */
    private Long hobbyid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ms_hobby.name
     *
     * @mbggenerated Thu Apr 11 19:30:00 CST 2019
     */
    private String name;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ms_hobby.hobbyId
     *
     * @return the value of ms_hobby.hobbyId
     *
     * @mbggenerated Thu Apr 11 19:30:00 CST 2019
     */
    public Long getHobbyid() {
        return hobbyid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ms_hobby.hobbyId
     *
     * @param hobbyid the value for ms_hobby.hobbyId
     *
     * @mbggenerated Thu Apr 11 19:30:00 CST 2019
     */
    public void setHobbyid(Long hobbyid) {
        this.hobbyid = hobbyid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ms_hobby.name
     *
     * @return the value of ms_hobby.name
     *
     * @mbggenerated Thu Apr 11 19:30:00 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ms_hobby.name
     *
     * @param name the value for ms_hobby.name
     *
     * @mbggenerated Thu Apr 11 19:30:00 CST 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}