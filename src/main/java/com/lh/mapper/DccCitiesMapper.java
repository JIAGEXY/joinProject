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
<<<<<<< HEAD
     * @mbggenerated Fri Apr 19 22:14:25 CST 2019
=======
     * @mbggenerated Fri Apr 19 08:42:06 CST 2019
>>>>>>> 6e13e5717372feaa6e93f20c55561ca38f98c880
     */
    int countByExample(DccCitiesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dcc_cities
     *
<<<<<<< HEAD
     * @mbggenerated Fri Apr 19 22:14:25 CST 2019
=======
     * @mbggenerated Fri Apr 19 08:42:06 CST 2019
>>>>>>> 6e13e5717372feaa6e93f20c55561ca38f98c880
     */
    int deleteByExample(DccCitiesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dcc_cities
     *
<<<<<<< HEAD
     * @mbggenerated Fri Apr 19 22:14:25 CST 2019
=======
     * @mbggenerated Fri Apr 19 08:42:06 CST 2019
>>>>>>> 6e13e5717372feaa6e93f20c55561ca38f98c880
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dcc_cities
     *
<<<<<<< HEAD
     * @mbggenerated Fri Apr 19 22:14:25 CST 2019
=======
     * @mbggenerated Fri Apr 19 08:42:06 CST 2019
>>>>>>> 6e13e5717372feaa6e93f20c55561ca38f98c880
     */
    int insert(DccCities record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dcc_cities
     *
<<<<<<< HEAD
     * @mbggenerated Fri Apr 19 22:14:25 CST 2019
=======
     * @mbggenerated Fri Apr 19 08:42:06 CST 2019
>>>>>>> 6e13e5717372feaa6e93f20c55561ca38f98c880
     */
    int insertSelective(DccCities record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dcc_cities
     *
<<<<<<< HEAD
     * @mbggenerated Fri Apr 19 22:14:25 CST 2019
=======
     * @mbggenerated Fri Apr 19 08:42:06 CST 2019
>>>>>>> 6e13e5717372feaa6e93f20c55561ca38f98c880
     */
    List<DccCities> selectByExample(DccCitiesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dcc_cities
     *
<<<<<<< HEAD
     * @mbggenerated Fri Apr 19 22:14:25 CST 2019
=======
     * @mbggenerated Fri Apr 19 08:42:06 CST 2019
>>>>>>> 6e13e5717372feaa6e93f20c55561ca38f98c880
     */
    DccCities selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dcc_cities
     *
<<<<<<< HEAD
     * @mbggenerated Fri Apr 19 22:14:25 CST 2019
=======
     * @mbggenerated Fri Apr 19 08:42:06 CST 2019
>>>>>>> 6e13e5717372feaa6e93f20c55561ca38f98c880
     */
    int updateByExampleSelective(@Param("record") DccCities record, @Param("example") DccCitiesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dcc_cities
     *
<<<<<<< HEAD
     * @mbggenerated Fri Apr 19 22:14:25 CST 2019
=======
     * @mbggenerated Fri Apr 19 08:42:06 CST 2019
>>>>>>> 6e13e5717372feaa6e93f20c55561ca38f98c880
     */
    int updateByExample(@Param("record") DccCities record, @Param("example") DccCitiesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dcc_cities
     *
<<<<<<< HEAD
     * @mbggenerated Fri Apr 19 22:14:25 CST 2019
=======
     * @mbggenerated Fri Apr 19 08:42:06 CST 2019
>>>>>>> 6e13e5717372feaa6e93f20c55561ca38f98c880
     */
    int updateByPrimaryKeySelective(DccCities record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dcc_cities
     *
<<<<<<< HEAD
     * @mbggenerated Fri Apr 19 22:14:25 CST 2019
=======
     * @mbggenerated Fri Apr 19 08:42:06 CST 2019
>>>>>>> 6e13e5717372feaa6e93f20c55561ca38f98c880
     */
    int updateByPrimaryKey(DccCities record);
}