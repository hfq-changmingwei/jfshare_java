package com.jfshare.order.model.mappers;

import com.jfshare.order.model.TbOrderInfoRecord;
import com.jfshare.order.model.TbOrderInfoRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface TbOrderInfoRecordMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_info_record
     *
     * @mbggenerated Wed Dec 16 16:44:14 CST 2015
     */
    int countByExample(TbOrderInfoRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_info_record
     *
     * @mbggenerated Wed Dec 16 16:44:14 CST 2015
     */
    int deleteByExample(TbOrderInfoRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_info_record
     *
     * @mbggenerated Wed Dec 16 16:44:14 CST 2015
     */
    @Delete({
        "delete from tb_order_info_record",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_info_record
     *
     * @mbggenerated Wed Dec 16 16:44:14 CST 2015
     */
    @Insert({
        "insert into tb_order_info_record (id, order_id, ",
        "product_id, product_name, ",
        "vice_name, product_snapshoot_id, ",
        "sku_num, sku_desc, ",
        "seller_class_num, cur_price, ",
        "org_price, images_url, ",
        "last_update_user_id, create_time, ",
        "create_user_id, type, ",
        "shelf, count, last_update_time, ",
        "subject_id, brand_id, ",
        "wi, exchange_score, ",
        "exchange_cash, exchange_rule, ",
        "third_score)",
        "values (#{id,jdbcType=INTEGER}, #{orderId,jdbcType=VARCHAR}, ",
        "#{productId,jdbcType=VARCHAR}, #{productName,jdbcType=VARCHAR}, ",
        "#{viceName,jdbcType=VARCHAR}, #{productSnapshootId,jdbcType=VARCHAR}, ",
        "#{skuNum,jdbcType=VARCHAR}, #{skuDesc,jdbcType=VARCHAR}, ",
        "#{sellerClassNum,jdbcType=VARCHAR}, #{curPrice,jdbcType=INTEGER}, ",
        "#{orgPrice,jdbcType=INTEGER}, #{imagesUrl,jdbcType=VARCHAR}, ",
        "#{lastUpdateUserId,jdbcType=INTEGER}, #{createTime,jdbcType=TIMESTAMP,typeHandler=com.jfshare.mybatis.typehandler.JodaDateTime2TimestampTypeHandler}, ",
        "#{createUserId,jdbcType=INTEGER}, #{type,jdbcType=INTEGER}, ",
        "#{shelf,jdbcType=VARCHAR}, #{count,jdbcType=INTEGER}, #{lastUpdateTime,jdbcType=TIMESTAMP,typeHandler=com.jfshare.mybatis.typehandler.JodaDateTime2TimestampTypeHandler}, ",
        "#{subjectId,jdbcType=INTEGER}, #{brandId,jdbcType=INTEGER}, ",
        "#{wi,jdbcType=VARCHAR}, #{exchangeScore,jdbcType=INTEGER}, ",
        "#{exchangeCash,jdbcType=INTEGER}, #{exchangeRule,jdbcType=VARCHAR}, ",
        "#{thirdScore,jdbcType=INTEGER})"
    })
    int insert(TbOrderInfoRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_info_record
     *
     * @mbggenerated Wed Dec 16 16:44:14 CST 2015
     */
    int insertSelective(TbOrderInfoRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_info_record
     *
     * @mbggenerated Wed Dec 16 16:44:14 CST 2015
     */
    List<TbOrderInfoRecord> selectByExample(TbOrderInfoRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_info_record
     *
     * @mbggenerated Wed Dec 16 16:44:14 CST 2015
     */
    @Select({
        "select",
        "id, order_id, product_id, product_name, vice_name, product_snapshoot_id, sku_num, ",
        "sku_desc, seller_class_num, cur_price, org_price, images_url, last_update_user_id, ",
        "create_time, create_user_id, type, shelf, count, last_update_time, subject_id, ",
        "brand_id, wi, exchange_score, exchange_cash, exchange_rule, third_score",
        "from tb_order_info_record",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    TbOrderInfoRecord selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_info_record
     *
     * @mbggenerated Wed Dec 16 16:44:14 CST 2015
     */
    int updateByExampleSelective(@Param("record") TbOrderInfoRecord record, @Param("example") TbOrderInfoRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_info_record
     *
     * @mbggenerated Wed Dec 16 16:44:14 CST 2015
     */
    int updateByExample(@Param("record") TbOrderInfoRecord record, @Param("example") TbOrderInfoRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_info_record
     *
     * @mbggenerated Wed Dec 16 16:44:14 CST 2015
     */
    int updateByPrimaryKeySelective(TbOrderInfoRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_info_record
     *
     * @mbggenerated Wed Dec 16 16:44:14 CST 2015
     */
    @Update({
        "update tb_order_info_record",
        "set order_id = #{orderId,jdbcType=VARCHAR},",
          "product_id = #{productId,jdbcType=VARCHAR},",
          "product_name = #{productName,jdbcType=VARCHAR},",
          "vice_name = #{viceName,jdbcType=VARCHAR},",
          "product_snapshoot_id = #{productSnapshootId,jdbcType=VARCHAR},",
          "sku_num = #{skuNum,jdbcType=VARCHAR},",
          "sku_desc = #{skuDesc,jdbcType=VARCHAR},",
          "seller_class_num = #{sellerClassNum,jdbcType=VARCHAR},",
          "cur_price = #{curPrice,jdbcType=INTEGER},",
          "org_price = #{orgPrice,jdbcType=INTEGER},",
          "images_url = #{imagesUrl,jdbcType=VARCHAR},",
          "last_update_user_id = #{lastUpdateUserId,jdbcType=INTEGER},",
          "create_time = #{createTime,jdbcType=TIMESTAMP,typeHandler=com.jfshare.mybatis.typehandler.JodaDateTime2TimestampTypeHandler},",
          "create_user_id = #{createUserId,jdbcType=INTEGER},",
          "type = #{type,jdbcType=INTEGER},",
          "shelf = #{shelf,jdbcType=VARCHAR},",
          "count = #{count,jdbcType=INTEGER},",
          "last_update_time = #{lastUpdateTime,jdbcType=TIMESTAMP,typeHandler=com.jfshare.mybatis.typehandler.JodaDateTime2TimestampTypeHandler},",
          "subject_id = #{subjectId,jdbcType=INTEGER},",
          "brand_id = #{brandId,jdbcType=INTEGER},",
          "wi = #{wi,jdbcType=VARCHAR},",
          "exchange_score = #{exchangeScore,jdbcType=INTEGER},",
          "exchange_cash = #{exchangeCash,jdbcType=INTEGER},",
          "exchange_rule = #{exchangeRule,jdbcType=VARCHAR},",
          "third_score = #{thirdScore,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(TbOrderInfoRecord record);
}