package com.lh.mapper;

import com.lh.entity.MsRoomNotice;
import com.lh.entity.MsRoomNoticeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MsRoomNoticeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_room_notice
     *
     * @mbggenerated Fri Apr 19 08:42:06 CST 2019
     */
    int countByExample(MsRoomNoticeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_room_notice
     *
     * @mbggenerated Fri Apr 19 08:42:06 CST 2019
     */
    int deleteByExample(MsRoomNoticeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_room_notice
     *
     * @mbggenerated Fri Apr 19 08:42:06 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_room_notice
     *
     * @mbggenerated Fri Apr 19 08:42:06 CST 2019
     */
    int insert(MsRoomNotice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_room_notice
     *
     * @mbggenerated Fri Apr 19 08:42:06 CST 2019
     */
    int insertSelective(MsRoomNotice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_room_notice
     *
     * @mbggenerated Fri Apr 19 08:42:06 CST 2019
     */
    List<MsRoomNotice> selectByExample(MsRoomNoticeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_room_notice
     *
     * @mbggenerated Fri Apr 19 08:42:06 CST 2019
     */
    MsRoomNotice selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_room_notice
     *
     * @mbggenerated Fri Apr 19 08:42:06 CST 2019
     */
    int updateByExampleSelective(@Param("record") MsRoomNotice record, @Param("example") MsRoomNoticeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_room_notice
     *
     * @mbggenerated Fri Apr 19 08:42:06 CST 2019
     */
    int updateByExample(@Param("record") MsRoomNotice record, @Param("example") MsRoomNoticeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_room_notice
     *
     * @mbggenerated Fri Apr 19 08:42:06 CST 2019
     */
    int updateByPrimaryKeySelective(MsRoomNotice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_room_notice
     *
     * @mbggenerated Fri Apr 19 08:42:06 CST 2019
     */
    int updateByPrimaryKey(MsRoomNotice record);
}