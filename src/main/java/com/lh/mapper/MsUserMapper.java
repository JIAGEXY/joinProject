package com.lh.mapper;

import com.lh.entity.MsUser;
import com.lh.entity.MsUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MsUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_user
     *
     * @mbggenerated Fri Apr 19 08:20:12 CST 2019
     */
    int countByExample(MsUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_user
     *
     * @mbggenerated Fri Apr 19 08:20:12 CST 2019
     */
    int deleteByExample(MsUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_user
     *
     * @mbggenerated Fri Apr 19 08:20:12 CST 2019
     */
    int deleteByPrimaryKey(Long userid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_user
     *
     * @mbggenerated Fri Apr 19 08:20:12 CST 2019
     */
    int insert(MsUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_user
     *
     * @mbggenerated Fri Apr 19 08:20:12 CST 2019
     */
    int insertSelective(MsUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_user
     *
     * @mbggenerated Fri Apr 19 08:20:12 CST 2019
     */
    List<MsUser> selectByExample(MsUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_user
     *
     * @mbggenerated Fri Apr 19 08:20:12 CST 2019
     */
    MsUser selectByPrimaryKey(Long userid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_user
     *
     * @mbggenerated Fri Apr 19 08:20:12 CST 2019
     */
    int updateByExampleSelective(@Param("record") MsUser record, @Param("example") MsUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_user
     *
     * @mbggenerated Fri Apr 19 08:20:12 CST 2019
     */
    int updateByExample(@Param("record") MsUser record, @Param("example") MsUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_user
     *
     * @mbggenerated Fri Apr 19 08:20:12 CST 2019
     */
    int updateByPrimaryKeySelective(MsUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_user
     *
     * @mbggenerated Fri Apr 19 08:20:12 CST 2019
     */
    int updateByPrimaryKey(MsUser record);
}