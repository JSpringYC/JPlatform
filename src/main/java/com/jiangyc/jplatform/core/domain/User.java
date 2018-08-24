package com.jiangyc.jplatform.core.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * 用户表(com_user)的实体类
 *
 * @author jiangyc
 */
@Data
@Entity
@Table(name = "com_user")
public class User implements Serializable {

    /**
     * 用户主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Long id;

    /**
     * 创建时间
     */
    @Column(name = "gmt_create")
    private Date createTime;

    /**
     * 修改时间
     */
    @Column(name = "gmt_modified")
    private Date updateTime;

    /**
     * 是否删除
     */
    @Column(name = "is_deleted")
    private boolean deleted;

    /**
     * 是否可用
     */
    @Column(name = "is_enabled")
    private boolean enabled;

    /**
     * 用户名称，不可重复
     */
    @Column(length = 50, unique = true)
    private String name;

    /**
     * 用户性别
     */
    @Column(length = 2)
    private String gender = "U";

    /**
     * 用户手机
     */
    @Column(length = 50, unique = true)
    private String mobile;

    /**
     * 用户邮箱
     */
    @Column(length = 50, unique = true)
    private String email;

    /**
     * 用户Slogan
     */
    @Column(length = 100)
    private String slogan;
}
