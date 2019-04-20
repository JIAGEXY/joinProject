package com.lh.mapper;

import com.lh.entity.MsArticle;
import com.lh.entity.MsArticleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MsArticleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_article
     *
     * @mbggenerated Fri Apr 19 21:06:35 CST 2019
     */
    int countByExample(MsArticleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_article
     *
     * @mbggenerated Fri Apr 19 21:06:35 CST 2019
     */
    int deleteByExample(MsArticleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_article
     *
     * @mbggenerated Fri Apr 19 21:06:35 CST 2019
     */
    int deleteByPrimaryKey(Long artid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_article
     *
     * @mbggenerated Fri Apr 19 21:06:35 CST 2019
     */
    int insert(MsArticle record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_article
     *
     * @mbggenerated Fri Apr 19 21:06:35 CST 2019
     */
    int insertSelective(MsArticle record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_article
     *
     * @mbggenerated Fri Apr 19 21:06:35 CST 2019
     */
    List<MsArticle> selectByExample(MsArticleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_article
     *
     * @mbggenerated Fri Apr 19 21:06:35 CST 2019
     */
    MsArticle selectByPrimaryKey(Long artid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_article
     *
     * @mbggenerated Fri Apr 19 21:06:35 CST 2019
     */
    int updateByExampleSelective(@Param("record") MsArticle record, @Param("example") MsArticleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_article
     *
     * @mbggenerated Fri Apr 19 21:06:35 CST 2019
     */
    int updateByExample(@Param("record") MsArticle record, @Param("example") MsArticleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_article
     *
     * @mbggenerated Fri Apr 19 21:06:35 CST 2019
     */
    int updateByPrimaryKeySelective(MsArticle record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_article
     *
     * @mbggenerated Fri Apr 19 21:06:35 CST 2019
     */
    int updateByPrimaryKey(MsArticle record);
}