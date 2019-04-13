package com.lh.mapper;

import com.lh.entity.MsReview;
import com.lh.entity.MsReviewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MsReviewMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_review
     *
     * @mbggenerated Sat Apr 13 21:16:18 CST 2019
     */
    int countByExample(MsReviewExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_review
     *
     * @mbggenerated Sat Apr 13 21:16:18 CST 2019
     */
    int deleteByExample(MsReviewExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_review
     *
     * @mbggenerated Sat Apr 13 21:16:18 CST 2019
     */
    int deleteByPrimaryKey(Long reviewid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_review
     *
     * @mbggenerated Sat Apr 13 21:16:18 CST 2019
     */
    int insert(MsReview record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_review
     *
     * @mbggenerated Sat Apr 13 21:16:18 CST 2019
     */
    int insertSelective(MsReview record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_review
     *
     * @mbggenerated Sat Apr 13 21:16:18 CST 2019
     */
    List<MsReview> selectByExample(MsReviewExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_review
     *
     * @mbggenerated Sat Apr 13 21:16:18 CST 2019
     */
    MsReview selectByPrimaryKey(Long reviewid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_review
     *
     * @mbggenerated Sat Apr 13 21:16:18 CST 2019
     */
    int updateByExampleSelective(@Param("record") MsReview record, @Param("example") MsReviewExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_review
     *
     * @mbggenerated Sat Apr 13 21:16:18 CST 2019
     */
    int updateByExample(@Param("record") MsReview record, @Param("example") MsReviewExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_review
     *
     * @mbggenerated Sat Apr 13 21:16:18 CST 2019
     */
    int updateByPrimaryKeySelective(MsReview record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_review
     *
     * @mbggenerated Sat Apr 13 21:16:18 CST 2019
     */
    int updateByPrimaryKey(MsReview record);
}