package com.lh.mapper;

import com.lh.entity.MsUserHobby;
import com.lh.entity.MsUserHobbyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MsUserHobbyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_user_hobby
     *
     * @mbggenerated Fri Apr 19 08:20:12 CST 2019
     */
    int countByExample(MsUserHobbyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_user_hobby
     *
     * @mbggenerated Fri Apr 19 08:20:12 CST 2019
     */
    int deleteByExample(MsUserHobbyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_user_hobby
     *
     * @mbggenerated Fri Apr 19 08:20:12 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_user_hobby
     *
     * @mbggenerated Fri Apr 19 08:20:12 CST 2019
     */
    int insert(MsUserHobby record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_user_hobby
     *
     * @mbggenerated Fri Apr 19 08:20:12 CST 2019
     */
    int insertSelective(MsUserHobby record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_user_hobby
     *
     * @mbggenerated Fri Apr 19 08:20:12 CST 2019
     */
    List<MsUserHobby> selectByExample(MsUserHobbyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_user_hobby
     *
     * @mbggenerated Fri Apr 19 08:20:12 CST 2019
     */
    MsUserHobby selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_user_hobby
     *
     * @mbggenerated Fri Apr 19 08:20:12 CST 2019
     */
    int updateByExampleSelective(@Param("record") MsUserHobby record, @Param("example") MsUserHobbyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_user_hobby
     *
     * @mbggenerated Fri Apr 19 08:20:12 CST 2019
     */
    int updateByExample(@Param("record") MsUserHobby record, @Param("example") MsUserHobbyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_user_hobby
     *
     * @mbggenerated Fri Apr 19 08:20:12 CST 2019
     */
    int updateByPrimaryKeySelective(MsUserHobby record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_user_hobby
     *
     * @mbggenerated Fri Apr 19 08:20:12 CST 2019
     */
    int updateByPrimaryKey(MsUserHobby record);
}