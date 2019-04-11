package com.lh.mapper;

import com.lh.entity.MsSleeper;
import com.lh.entity.MsSleeperExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MsSleeperMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_sleeper
     *
     * @mbggenerated Thu Apr 11 19:30:00 CST 2019
     */
    int countByExample(MsSleeperExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_sleeper
     *
     * @mbggenerated Thu Apr 11 19:30:00 CST 2019
     */
    int deleteByExample(MsSleeperExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_sleeper
     *
     * @mbggenerated Thu Apr 11 19:30:00 CST 2019
     */
    int deleteByPrimaryKey(Long sleeperid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_sleeper
     *
     * @mbggenerated Thu Apr 11 19:30:00 CST 2019
     */
    int insert(MsSleeper record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_sleeper
     *
     * @mbggenerated Thu Apr 11 19:30:00 CST 2019
     */
    int insertSelective(MsSleeper record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_sleeper
     *
     * @mbggenerated Thu Apr 11 19:30:00 CST 2019
     */
    List<MsSleeper> selectByExample(MsSleeperExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_sleeper
     *
     * @mbggenerated Thu Apr 11 19:30:00 CST 2019
     */
    MsSleeper selectByPrimaryKey(Long sleeperid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_sleeper
     *
     * @mbggenerated Thu Apr 11 19:30:00 CST 2019
     */
    int updateByExampleSelective(@Param("record") MsSleeper record, @Param("example") MsSleeperExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_sleeper
     *
     * @mbggenerated Thu Apr 11 19:30:00 CST 2019
     */
    int updateByExample(@Param("record") MsSleeper record, @Param("example") MsSleeperExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_sleeper
     *
     * @mbggenerated Thu Apr 11 19:30:00 CST 2019
     */
    int updateByPrimaryKeySelective(MsSleeper record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_sleeper
     *
     * @mbggenerated Thu Apr 11 19:30:00 CST 2019
     */
    int updateByPrimaryKey(MsSleeper record);
}