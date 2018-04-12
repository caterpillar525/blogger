package com.vimin.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;

@Entity
@Table(name = "t_blog_user")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(columnDefinition = "VARCHAR(50) NOT NULL COMMENT '用户名'")
    private String userName;
    @Column(columnDefinition = "CHAR(1) COMMENT '性别'")
    private Sex sex;

    protected User() {
    }

    public User(String userName, Sex sex) {
        this.userName = userName;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "id : " + this.id + ", userName : " + this.userName + ", sex : " + this.sex.name();
    }
}
