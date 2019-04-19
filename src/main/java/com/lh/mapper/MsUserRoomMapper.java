package com.lh.mapper;

import com.lh.entity.MsUserRoom;
import com.lh.entity.MsUserRoomExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MsUserRoomMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_user_room
     *
     * @mbggenerated Fri Apr 19 08:20:12 CST 2019
     */
    int countByExample(MsUserRoomExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_user_room
     *
     * @mbggenerated Fri Apr 19 08:20:12 CST 2019
     */
    int deleteByExample(MsUserRoomExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_user_room
     *
     * @mbggenerated Fri Apr 19 08:20:12 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_user_room
     *
     * @mbggenerated Fri Apr 19 08:20:12 CST 2019
     */
    int insert(MsUserRoom record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_user_room
     *
     * @mbggenerated Fri Apr 19 08:20:12 CST 2019
     */
    int insertSelective(MsUserRoom record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_user_room
     *
     * @mbggenerated Fri Apr 19 08:20:12 CST 2019
     */
    List<MsUserRoom> selectByExample(MsUserRoomExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_user_room
     *
     * @mbggenerated Fri Apr 19 08:20:12 CST 2019
     */
    MsUserRoom selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_user_room
     *
     * @mbggenerated Fri Apr 19 08:20:12 CST 2019
     */
    int updateByExampleSelective(@Param("record") MsUserRoom record, @Param("example") MsUserRoomExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_user_room
     *
     * @mbggenerated Fri Apr 19 08:20:12 CST 2019
     */
    int updateByExample(@Param("record") MsUserRoom record, @Param("example") MsUserRoomExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_user_room
     *
     * @mbggenerated Fri Apr 19 08:20:12 CST 2019
     */
    int updateByPrimaryKeySelective(MsUserRoom record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_user_room
     *
     * @mbggenerated Fri Apr 19 08:20:12 CST 2019
     */
    int updateByPrimaryKey(MsUserRoom record);
}