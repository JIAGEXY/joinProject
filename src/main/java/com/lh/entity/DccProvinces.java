package com.lh.entity;

public class DccProvinces {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dcc_provinces.id
     *
     * @mbggenerated Fri Apr 19 08:42:06 CST 2019
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dcc_provinces.provinceid
     *
     * @mbggenerated Fri Apr 19 08:42:06 CST 2019
     */
    private String provinceid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dcc_provinces.province
     *
     * @mbggenerated Fri Apr 19 08:42:06 CST 2019
     */
    private String province;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dcc_provinces.id
     *
     * @return the value of dcc_provinces.id
     *
     * @mbggenerated Fri Apr 19 08:42:06 CST 2019
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dcc_provinces.id
     *
     * @param id the value for dcc_provinces.id
     *
     * @mbggenerated Fri Apr 19 08:42:06 CST 2019
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dcc_provinces.provinceid
     *
     * @return the value of dcc_provinces.provinceid
     *
     * @mbggenerated Fri Apr 19 08:42:06 CST 2019
     */
    public String getProvinceid() {
        return provinceid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dcc_provinces.provinceid
     *
     * @param provinceid the value for dcc_provinces.provinceid
     *
     * @mbggenerated Fri Apr 19 08:42:06 CST 2019
     */
    public void setProvinceid(String provinceid) {
        this.provinceid = provinceid == null ? null : provinceid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dcc_provinces.province
     *
     * @return the value of dcc_provinces.province
     *
     * @mbggenerated Fri Apr 19 08:42:06 CST 2019
     */
    public String getProvince() {
        return province;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dcc_provinces.province
     *
     * @param province the value for dcc_provinces.province
     *
     * @mbggenerated Fri Apr 19 08:42:06 CST 2019
     */
    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }
}