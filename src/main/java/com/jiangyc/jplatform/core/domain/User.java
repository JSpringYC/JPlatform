package com.jiangyc.jplatform.core.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 用户表(com_user)的实体类
 *
 * @author jiangyc
 */
@Data
@Entity
@Table(name = "com_user")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Long id;

    private String name;
}
