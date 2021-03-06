package com.lh.mapper;

import com.lh.entity.MsOrder;
import com.lh.entity.MsOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MsOrderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_order
     *
     * @mbggenerated Tue Apr 23 20:48:05 CST 2019
     */
    int countByExample(MsOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_order
     *
     * @mbggenerated Tue Apr 23 20:48:05 CST 2019
     */
    int deleteByExample(MsOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_order
     *
     * @mbggenerated Tue Apr 23 20:48:05 CST 2019
     */
    int deleteByPrimaryKey(Long orderid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_order
     *
     * @mbggenerated Tue Apr 23 20:48:05 CST 2019
     */
    int insert(MsOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_order
     *
     * @mbggenerated Tue Apr 23 20:48:05 CST 2019
     */
    int insertSelective(MsOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_order
     *
     * @mbggenerated Tue Apr 23 20:48:05 CST 2019
     */
    List<MsOrder> selectByExample(MsOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_order
     *
     * @mbggenerated Tue Apr 23 20:48:05 CST 2019
     */
    MsOrder selectByPrimaryKey(Long orderid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_order
     *
     * @mbggenerated Tue Apr 23 20:48:05 CST 2019
     */
    int updateByExampleSelective(@Param("record") MsOrder record, @Param("example") MsOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_order
     *
     * @mbggenerated Tue Apr 23 20:48:05 CST 2019
     */
    int updateByExample(@Param("record") MsOrder record, @Param("example") MsOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_order
     *
     * @mbggenerated Tue Apr 23 20:48:05 CST 2019
     */
    int updateByPrimaryKeySelective(MsOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_order
     *
     * @mbggenerated Tue Apr 23 20:48:05 CST 2019
     */
    int updateByPrimaryKey(MsOrder record);

    List<MsOrder> getOrderr();
    int insertALOrder(MsOrder order);
    int updateALOrder(MsOrder order);
    MsOrder selectALOrder(String ordernum);
}