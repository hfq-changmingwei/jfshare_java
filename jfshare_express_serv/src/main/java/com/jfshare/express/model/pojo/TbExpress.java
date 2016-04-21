package com.jfshare.express.model.pojo;

import org.joda.time.DateTime;

public class TbExpress {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_express.id
     *
     * @mbggenerated Tue Mar 24 16:07:26 CST 2015
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_express.name
     *
     * @mbggenerated Tue Mar 24 16:07:26 CST 2015
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_express.query_url
     *
     * @mbggenerated Tue Mar 24 16:07:26 CST 2015
     */
    private String queryUrl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_express.status
     *
     * @mbggenerated Tue Mar 24 16:07:26 CST 2015
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_express.comment
     *
     * @mbggenerated Tue Mar 24 16:07:26 CST 2015
     */
    private String comment;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_express.last_update_time
     *
     * @mbggenerated Tue Mar 24 16:07:26 CST 2015
     */
    private DateTime lastUpdateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_express.last_update_user_id
     *
     * @mbggenerated Tue Mar 24 16:07:26 CST 2015
     */
    private Integer lastUpdateUserId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_express.create_time
     *
     * @mbggenerated Tue Mar 24 16:07:26 CST 2015
     */
    private DateTime createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_express.create_user_id
     *
     * @mbggenerated Tue Mar 24 16:07:26 CST 2015
     */
    private Integer createUserId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_express.kuaidi_key
     *
     * @mbggenerated Tue Mar 24 16:07:26 CST 2015
     */
    private String kuaidiKey;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_express.name_rule
     *
     * @mbggenerated Tue Mar 24 16:07:26 CST 2015
     */
    private String nameRule;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_express.express_no_rule
     *
     * @mbggenerated Tue Mar 24 16:07:26 CST 2015
     */
    private String expressNoRule;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_express.grab_state
     *
     * @mbggenerated Tue Mar 24 16:07:26 CST 2015
     */
    private Integer grabState;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_express.type_state
     *
     * @mbggenerated Tue Mar 24 16:07:26 CST 2015
     */
    private Integer typeState;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_express.dnf_tel
     *
     * @mbggenerated Tue Mar 24 16:07:26 CST 2015
     */
    private String dnfTel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_express.user_type
     *
     * @mbggenerated Tue Mar 24 16:07:26 CST 2015
     */
    private Integer userType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_express.serial_num
     *
     * @mbggenerated Tue Mar 24 16:07:26 CST 2015
     */
    private Integer serialNum;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_express.id
     *
     * @return the value of tb_express.id
     *
     * @mbggenerated Tue Mar 24 16:07:26 CST 2015
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_express.id
     *
     * @param id the value for tb_express.id
     *
     * @mbggenerated Tue Mar 24 16:07:26 CST 2015
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_express.name
     *
     * @return the value of tb_express.name
     *
     * @mbggenerated Tue Mar 24 16:07:26 CST 2015
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_express.name
     *
     * @param name the value for tb_express.name
     *
     * @mbggenerated Tue Mar 24 16:07:26 CST 2015
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_express.query_url
     *
     * @return the value of tb_express.query_url
     *
     * @mbggenerated Tue Mar 24 16:07:26 CST 2015
     */
    public String getQueryUrl() {
        return queryUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_express.query_url
     *
     * @param queryUrl the value for tb_express.query_url
     *
     * @mbggenerated Tue Mar 24 16:07:26 CST 2015
     */
    public void setQueryUrl(String queryUrl) {
        this.queryUrl = queryUrl == null ? null : queryUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_express.status
     *
     * @return the value of tb_express.status
     *
     * @mbggenerated Tue Mar 24 16:07:26 CST 2015
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_express.status
     *
     * @param status the value for tb_express.status
     *
     * @mbggenerated Tue Mar 24 16:07:26 CST 2015
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_express.comment
     *
     * @return the value of tb_express.comment
     *
     * @mbggenerated Tue Mar 24 16:07:26 CST 2015
     */
    public String getComment() {
        return comment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_express.comment
     *
     * @param comment the value for tb_express.comment
     *
     * @mbggenerated Tue Mar 24 16:07:26 CST 2015
     */
    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_express.last_update_time
     *
     * @return the value of tb_express.last_update_time
     *
     * @mbggenerated Tue Mar 24 16:07:26 CST 2015
     */
    public DateTime getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_express.last_update_time
     *
     * @param lastUpdateTime the value for tb_express.last_update_time
     *
     * @mbggenerated Tue Mar 24 16:07:26 CST 2015
     */
    public void setLastUpdateTime(DateTime lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_express.last_update_user_id
     *
     * @return the value of tb_express.last_update_user_id
     *
     * @mbggenerated Tue Mar 24 16:07:26 CST 2015
     */
    public Integer getLastUpdateUserId() {
        return lastUpdateUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_express.last_update_user_id
     *
     * @param lastUpdateUserId the value for tb_express.last_update_user_id
     *
     * @mbggenerated Tue Mar 24 16:07:26 CST 2015
     */
    public void setLastUpdateUserId(Integer lastUpdateUserId) {
        this.lastUpdateUserId = lastUpdateUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_express.create_time
     *
     * @return the value of tb_express.create_time
     *
     * @mbggenerated Tue Mar 24 16:07:26 CST 2015
     */
    public DateTime getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_express.create_time
     *
     * @param createTime the value for tb_express.create_time
     *
     * @mbggenerated Tue Mar 24 16:07:26 CST 2015
     */
    public void setCreateTime(DateTime createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_express.create_user_id
     *
     * @return the value of tb_express.create_user_id
     *
     * @mbggenerated Tue Mar 24 16:07:26 CST 2015
     */
    public Integer getCreateUserId() {
        return createUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_express.create_user_id
     *
     * @param createUserId the value for tb_express.create_user_id
     *
     * @mbggenerated Tue Mar 24 16:07:26 CST 2015
     */
    public void setCreateUserId(Integer createUserId) {
        this.createUserId = createUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_express.kuaidi_key
     *
     * @return the value of tb_express.kuaidi_key
     *
     * @mbggenerated Tue Mar 24 16:07:26 CST 2015
     */
    public String getKuaidiKey() {
        return kuaidiKey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_express.kuaidi_key
     *
     * @param kuaidiKey the value for tb_express.kuaidi_key
     *
     * @mbggenerated Tue Mar 24 16:07:26 CST 2015
     */
    public void setKuaidiKey(String kuaidiKey) {
        this.kuaidiKey = kuaidiKey == null ? null : kuaidiKey.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_express.name_rule
     *
     * @return the value of tb_express.name_rule
     *
     * @mbggenerated Tue Mar 24 16:07:26 CST 2015
     */
    public String getNameRule() {
        return nameRule;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_express.name_rule
     *
     * @param nameRule the value for tb_express.name_rule
     *
     * @mbggenerated Tue Mar 24 16:07:26 CST 2015
     */
    public void setNameRule(String nameRule) {
        this.nameRule = nameRule == null ? null : nameRule.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_express.express_no_rule
     *
     * @return the value of tb_express.express_no_rule
     *
     * @mbggenerated Tue Mar 24 16:07:26 CST 2015
     */
    public String getExpressNoRule() {
        return expressNoRule;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_express.express_no_rule
     *
     * @param expressNoRule the value for tb_express.express_no_rule
     *
     * @mbggenerated Tue Mar 24 16:07:26 CST 2015
     */
    public void setExpressNoRule(String expressNoRule) {
        this.expressNoRule = expressNoRule == null ? null : expressNoRule.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_express.grab_state
     *
     * @return the value of tb_express.grab_state
     *
     * @mbggenerated Tue Mar 24 16:07:26 CST 2015
     */
    public Integer getGrabState() {
        return grabState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_express.grab_state
     *
     * @param grabState the value for tb_express.grab_state
     *
     * @mbggenerated Tue Mar 24 16:07:26 CST 2015
     */
    public void setGrabState(Integer grabState) {
        this.grabState = grabState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_express.type_state
     *
     * @return the value of tb_express.type_state
     *
     * @mbggenerated Tue Mar 24 16:07:26 CST 2015
     */
    public Integer getTypeState() {
        return typeState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_express.type_state
     *
     * @param typeState the value for tb_express.type_state
     *
     * @mbggenerated Tue Mar 24 16:07:26 CST 2015
     */
    public void setTypeState(Integer typeState) {
        this.typeState = typeState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_express.dnf_tel
     *
     * @return the value of tb_express.dnf_tel
     *
     * @mbggenerated Tue Mar 24 16:07:26 CST 2015
     */
    public String getDnfTel() {
        return dnfTel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_express.dnf_tel
     *
     * @param dnfTel the value for tb_express.dnf_tel
     *
     * @mbggenerated Tue Mar 24 16:07:26 CST 2015
     */
    public void setDnfTel(String dnfTel) {
        this.dnfTel = dnfTel == null ? null : dnfTel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_express.user_type
     *
     * @return the value of tb_express.user_type
     *
     * @mbggenerated Tue Mar 24 16:07:26 CST 2015
     */
    public Integer getUserType() {
        return userType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_express.user_type
     *
     * @param userType the value for tb_express.user_type
     *
     * @mbggenerated Tue Mar 24 16:07:26 CST 2015
     */
    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_express.serial_num
     *
     * @return the value of tb_express.serial_num
     *
     * @mbggenerated Tue Mar 24 16:07:26 CST 2015
     */
    public Integer getSerialNum() {
        return serialNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_express.serial_num
     *
     * @param serialNum the value for tb_express.serial_num
     *
     * @mbggenerated Tue Mar 24 16:07:26 CST 2015
     */
    public void setSerialNum(Integer serialNum) {
        this.serialNum = serialNum;
    }
}