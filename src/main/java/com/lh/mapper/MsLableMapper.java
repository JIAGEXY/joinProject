package com.lh.mapper;

import com.lh.entity.MsLable;
import com.lh.entity.MsLableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MsLableMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_lable
     *
     * @mbggenerated Thu Apr 11 19:30:00 CST 2019
     */
    int countByExample(MsLableExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_lable
     *
     * @mbggenerated Thu Apr 11 19:30:00 CST 2019
     */
    int deleteByExample(MsLableExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_lable
     *
     * @mbggenerated Thu Apr 11 19:30:00 CST 2019
     */
    int deleteByPrimaryKey(Long lableid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_lable
     *
     * @mbggenerated Thu Apr 11 19:30:00 CST 2019
     */
    int insert(MsLable record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_lable
     *
     * @mbggenerated Thu Apr 11 19:30:00 CST 2019
     */
    int insertSelective(MsLable record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_lable
     *
     * @mbggenerated Thu Apr 11 19:30:00 CST 2019
     */
    List<MsLable> selectByExample(MsLableExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_lable
     *
     * @mbggenerated Thu Apr 11 19:30:00 CST 2019
     */
    MsLable selectByPrimaryKey(Long lableid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_lable
     *
     * @mbggenerated Thu Apr 11 19:30:00 CST 2019
     */
    int updateByExampleSelective(@Param("record") MsLable record, @Param("example") MsLableExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_lable
     *
     * @mbggenerated Thu Apr 11 19:30:00 CST 2019
     */
    int updateByExample(@Param("record") MsLable record, @Param("example") MsLableExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_lable
     *
     * @mbggenerated Thu Apr 11 19:30:00 CST 2019
     */
    int updateByPrimaryKeySelective(MsLable record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_lable
     *
     * @mbggenerated Thu Apr 11 19:30:00 CST 2019
     */
    int updateByPrimaryKey(MsLable record);
}