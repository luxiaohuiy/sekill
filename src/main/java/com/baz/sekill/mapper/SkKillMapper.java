package com.baz.sekill.mapper;

import com.baz.sekill.model.SkKill;

public interface SkKillMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sk_kill
     *
     * @mbggenerated Mon Apr 15 10:02:17 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sk_kill
     *
     * @mbggenerated Mon Apr 15 10:02:17 CST 2019
     */
    int insert(SkKill record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sk_kill
     *
     * @mbggenerated Mon Apr 15 10:02:17 CST 2019
     */
    int insertSelective(SkKill record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sk_kill
     *
     * @mbggenerated Mon Apr 15 10:02:17 CST 2019
     */
    SkKill selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sk_kill
     *
     * @mbggenerated Mon Apr 15 10:02:17 CST 2019
     */
    int updateByPrimaryKeySelective(SkKill record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sk_kill
     *
     * @mbggenerated Mon Apr 15 10:02:17 CST 2019
     */
    int updateByPrimaryKey(SkKill record);
}