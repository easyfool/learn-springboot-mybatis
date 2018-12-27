package com.wangfengbabe.learn.springboot.mybatis.domain;

import java.math.BigDecimal;
import lombok.Data;

@Data
public class Account {

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.id
     *
     * @mbggenerated Wed Dec 26 13:31:18 CST 2018
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.user_id
     *
     * @mbggenerated Wed Dec 26 13:31:18 CST 2018
     */
    private Long userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.user_name
     *
     * @mbggenerated Wed Dec 26 13:31:18 CST 2018
     */
    private String userName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.balance
     *
     * @mbggenerated Wed Dec 26 13:31:18 CST 2018
     */
    private Double balance;

}