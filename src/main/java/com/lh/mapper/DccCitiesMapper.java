package com.lh.mapper;

import com.lh.entity.DccCities;
import com.lh.entity.DccCitiesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DccCitiesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dcc_cities
     *
     * @mbggenerated Fri Apr 19 08:42:06 CST 2019
     */
    int countByExample(DccCitiesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dcc_cities
     *
     * @mbggenerated Fri Apr 19 08:42:06 CST 2019
     */
    int deleteByExample(DccCitiesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dcc_cities
     *
     * @mbggenerated Fri Apr 19 08:42:06 CST 2019
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dcc_cities
     *
     * @mbggenerated Fri Apr 19 08:42:06 CST 2019
     */
    int insert(DccCities record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dcc_cities
     *
     * @mbggenerated Fri Apr 19 08:42:06 CST 2019
     */
    int insertSelective(DccCities record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dcc_cities
     *
     * @mbggenerated Fri Apr 19 08:42:06 CST 2019
     */
    List<DccCities> selectByExample(DccCitiesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dcc_cities
     *
     * @mbggenerated Fri Apr 19 08:42:06 CST 2019
     */
    DccCities selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dcc_cities
     *
     * @mbggenerated Fri Apr 19 08:42:06 CST 2019
     */
    int updateByExampleSelective(@Param("record") DccCities record, @Param("example") DccCitiesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dcc_cities
     *
     * @mbggenerated Fri Apr 19 08:42:06 CST 2019
     */
    int updateByExample(@Param("record") DccCities record, @Param("example") DccCitiesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dcc_cities
     *
     * @mbggenerated Fri Apr 19 08:42:06 CST 2019
     */
    int updateByPrimaryKeySelective(DccCities record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dcc_cities
     *
     * @mbggenerated Fri Apr 19 08:42:06 CST 2019
     */
    int updateByPrimaryKey(DccCities record);
}