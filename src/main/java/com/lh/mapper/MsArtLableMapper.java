package com.lh.mapper;

import com.lh.entity.MsArtLable;
import com.lh.entity.MsArtLableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MsArtLableMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_art_lable
     *
     * @mbggenerated Thu Apr 11 17:34:39 CST 2019
     */
    int countByExample(MsArtLableExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_art_lable
     *
     * @mbggenerated Thu Apr 11 17:34:39 CST 2019
     */
    int deleteByExample(MsArtLableExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_art_lable
     *
     * @mbggenerated Thu Apr 11 17:34:39 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_art_lable
     *
     * @mbggenerated Thu Apr 11 17:34:39 CST 2019
     */
    int insert(MsArtLable record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_art_lable
     *
     * @mbggenerated Thu Apr 11 17:34:39 CST 2019
     */
    int insertSelective(MsArtLable record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_art_lable
     *
     * @mbggenerated Thu Apr 11 17:34:39 CST 2019
     */
    List<MsArtLable> selectByExample(MsArtLableExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_art_lable
     *
     * @mbggenerated Thu Apr 11 17:34:39 CST 2019
     */
    MsArtLable selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_art_lable
     *
     * @mbggenerated Thu Apr 11 17:34:39 CST 2019
     */
    int updateByExampleSelective(@Param("record") MsArtLable record, @Param("example") MsArtLableExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_art_lable
     *
     * @mbggenerated Thu Apr 11 17:34:39 CST 2019
     */
    int updateByExample(@Param("record") MsArtLable record, @Param("example") MsArtLableExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_art_lable
     *
     * @mbggenerated Thu Apr 11 17:34:39 CST 2019
     */
    int updateByPrimaryKeySelective(MsArtLable record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_art_lable
     *
     * @mbggenerated Thu Apr 11 17:34:39 CST 2019
     */
    int updateByPrimaryKey(MsArtLable record);
}