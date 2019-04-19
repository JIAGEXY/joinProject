package com.lh.mapper;

import com.lh.entity.MsUserArt;
import com.lh.entity.MsUserArtExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MsUserArtMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_user_art
     *
     * @mbggenerated Fri Apr 19 08:20:12 CST 2019
     */
    int countByExample(MsUserArtExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_user_art
     *
     * @mbggenerated Fri Apr 19 08:20:12 CST 2019
     */
    int deleteByExample(MsUserArtExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_user_art
     *
     * @mbggenerated Fri Apr 19 08:20:12 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_user_art
     *
     * @mbggenerated Fri Apr 19 08:20:12 CST 2019
     */
    int insert(MsUserArt record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_user_art
     *
     * @mbggenerated Fri Apr 19 08:20:12 CST 2019
     */
    int insertSelective(MsUserArt record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_user_art
     *
     * @mbggenerated Fri Apr 19 08:20:12 CST 2019
     */
    List<MsUserArt> selectByExample(MsUserArtExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_user_art
     *
     * @mbggenerated Fri Apr 19 08:20:12 CST 2019
     */
    MsUserArt selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_user_art
     *
     * @mbggenerated Fri Apr 19 08:20:12 CST 2019
     */
    int updateByExampleSelective(@Param("record") MsUserArt record, @Param("example") MsUserArtExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_user_art
     *
     * @mbggenerated Fri Apr 19 08:20:12 CST 2019
     */
    int updateByExample(@Param("record") MsUserArt record, @Param("example") MsUserArtExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_user_art
     *
     * @mbggenerated Fri Apr 19 08:20:12 CST 2019
     */
    int updateByPrimaryKeySelective(MsUserArt record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_user_art
     *
     * @mbggenerated Fri Apr 19 08:20:12 CST 2019
     */
    int updateByPrimaryKey(MsUserArt record);
}