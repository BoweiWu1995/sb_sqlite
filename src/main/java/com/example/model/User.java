package com.example.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author wuwei
 * @create 2019/11/29 16:35
 * @desc
 **/
@Entity
@Table(name="user")
public class User implements Serializable {


    @Id
    @GeneratedValue(generator="identity")
    @GenericGenerator(name="identity",strategy="identity")
    @Column(name="id")
    private Integer id;

    @Column(name="name")
    private String name ;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
