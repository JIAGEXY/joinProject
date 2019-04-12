package com.lh.mapper;

import com.lh.entity.MsDesc;
import com.lh.entity.MsDescExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MsDescMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_desc
     *
     * @mbggenerated Fri Apr 12 22:00:51 CST 2019
     */
    int countByExample(MsDescExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_desc
     *
     * @mbggenerated Fri Apr 12 22:00:51 CST 2019
     */
    int deleteByExample(MsDescExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_desc
     *
     * @mbggenerated Fri Apr 12 22:00:51 CST 2019
     */
    int deleteByPrimaryKey(Long descid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_desc
     *
     * @mbggenerated Fri Apr 12 22:00:51 CST 2019
     */
    int insert(MsDesc record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_desc
     *
     * @mbggenerated Fri Apr 12 22:00:51 CST 2019
     */
    int insertSelective(MsDesc record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_desc
     *
     * @mbggenerated Fri Apr 12 22:00:51 CST 2019
     */
    List<MsDesc> selectByExample(MsDescExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_desc
     *
     * @mbggenerated Fri Apr 12 22:00:51 CST 2019
     */
    MsDesc selectByPrimaryKey(Long descid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_desc
     *
     * @mbggenerated Fri Apr 12 22:00:51 CST 2019
     */
    int updateByExampleSelective(@Param("record") MsDesc record, @Param("example") MsDescExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_desc
     *
     * @mbggenerated Fri Apr 12 22:00:51 CST 2019
     */
    int updateByExample(@Param("record") MsDesc record, @Param("example") MsDescExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_desc
     *
     * @mbggenerated Fri Apr 12 22:00:51 CST 2019
     */
    int updateByPrimaryKeySelective(MsDesc record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_desc
     *
     * @mbggenerated Fri Apr 12 22:00:51 CST 2019
     */
    int updateByPrimaryKey(MsDesc record);
}