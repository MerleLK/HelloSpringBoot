package com.hello.test.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/** 测试实体类
 * Created by merle on 17-5-27.
 */

@Entity
public class Demo {

    @Id
    @GeneratedValue
    private long id;  //PK

    @Column(nullable = false)
    public String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
