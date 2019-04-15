package com.baz.sekill.model;

import java.util.Date;

public class SkBill {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sk_bill.id
     *
     * @mbggenerated Mon Apr 15 10:02:17 CST 2019
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sk_bill.goods_id
     *
     * @mbggenerated Mon Apr 15 10:02:17 CST 2019
     */
    private Integer goods_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sk_bill.user_id
     *
     * @mbggenerated Mon Apr 15 10:02:17 CST 2019
     */
    private Integer user_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sk_bill.pay_status
     *
     * @mbggenerated Mon Apr 15 10:02:17 CST 2019
     */
    private Integer pay_status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sk_bill.creat_time
     *
     * @mbggenerated Mon Apr 15 10:02:17 CST 2019
     */
    private Date creat_time;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sk_bill.update_time
     *
     * @mbggenerated Mon Apr 15 10:02:17 CST 2019
     */
    private Date update_time;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sk_bill.id
     *
     * @return the value of sk_bill.id
     *
     * @mbggenerated Mon Apr 15 10:02:17 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sk_bill.id
     *
     * @param id the value for sk_bill.id
     *
     * @mbggenerated Mon Apr 15 10:02:17 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sk_bill.goods_id
     *
     * @return the value of sk_bill.goods_id
     *
     * @mbggenerated Mon Apr 15 10:02:17 CST 2019
     */
    public Integer getGoods_id() {
        return goods_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sk_bill.goods_id
     *
     * @param goods_id the value for sk_bill.goods_id
     *
     * @mbggenerated Mon Apr 15 10:02:17 CST 2019
     */
    public void setGoods_id(Integer goods_id) {
        this.goods_id = goods_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sk_bill.user_id
     *
     * @return the value of sk_bill.user_id
     *
     * @mbggenerated Mon Apr 15 10:02:17 CST 2019
     */
    public Integer getUser_id() {
        return user_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sk_bill.user_id
     *
     * @param user_id the value for sk_bill.user_id
     *
     * @mbggenerated Mon Apr 15 10:02:17 CST 2019
     */
    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sk_bill.pay_status
     *
     * @return the value of sk_bill.pay_status
     *
     * @mbggenerated Mon Apr 15 10:02:17 CST 2019
     */
    public Integer getPay_status() {
        return pay_status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sk_bill.pay_status
     *
     * @param pay_status the value for sk_bill.pay_status
     *
     * @mbggenerated Mon Apr 15 10:02:17 CST 2019
     */
    public void setPay_status(Integer pay_status) {
        this.pay_status = pay_status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sk_bill.creat_time
     *
     * @return the value of sk_bill.creat_time
     *
     * @mbggenerated Mon Apr 15 10:02:17 CST 2019
     */
    public Date getCreat_time() {
        return creat_time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sk_bill.creat_time
     *
     * @param creat_time the value for sk_bill.creat_time
     *
     * @mbggenerated Mon Apr 15 10:02:17 CST 2019
     */
    public void setCreat_time(Date creat_time) {
        this.creat_time = creat_time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sk_bill.update_time
     *
     * @return the value of sk_bill.update_time
     *
     * @mbggenerated Mon Apr 15 10:02:17 CST 2019
     */
    public Date getUpdate_time() {
        return update_time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sk_bill.update_time
     *
     * @param update_time the value for sk_bill.update_time
     *
     * @mbggenerated Mon Apr 15 10:02:17 CST 2019
     */
    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }
}