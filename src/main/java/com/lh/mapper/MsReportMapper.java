package com.lh.mapper;

import com.lh.entity.MsReport;
import com.lh.entity.MsReportExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MsReportMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_report
     *
     * @mbggenerated Fri Apr 19 21:06:35 CST 2019
     */
    int countByExample(MsReportExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_report
     *
     * @mbggenerated Fri Apr 19 21:06:35 CST 2019
     */
    int deleteByExample(MsReportExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_report
     *
     * @mbggenerated Fri Apr 19 21:06:35 CST 2019
     */
    int deleteByPrimaryKey(Long repordid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_report
     *
     * @mbggenerated Fri Apr 19 21:06:35 CST 2019
     */
    int insert(MsReport record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_report
     *
     * @mbggenerated Fri Apr 19 21:06:35 CST 2019
     */
    int insertSelective(MsReport record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_report
     *
     * @mbggenerated Fri Apr 19 21:06:35 CST 2019
     */
    List<MsReport> selectByExample(MsReportExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_report
     *
     * @mbggenerated Fri Apr 19 21:06:35 CST 2019
     */
    MsReport selectByPrimaryKey(Long repordid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_report
     *
     * @mbggenerated Fri Apr 19 21:06:35 CST 2019
     */
    int updateByExampleSelective(@Param("record") MsReport record, @Param("example") MsReportExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_report
     *
     * @mbggenerated Fri Apr 19 21:06:35 CST 2019
     */
    int updateByExample(@Param("record") MsReport record, @Param("example") MsReportExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_report
     *
     * @mbggenerated Fri Apr 19 21:06:35 CST 2019
     */
    int updateByPrimaryKeySelective(MsReport record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_report
     *
     * @mbggenerated Fri Apr 19 21:06:35 CST 2019
     */
    int updateByPrimaryKey(MsReport record);
}