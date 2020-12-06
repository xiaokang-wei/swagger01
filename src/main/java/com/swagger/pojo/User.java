package com.swagger.pojo;

import org.springframework.stereotype.Component;

/**
 * @author wxk
 * @date 2020/12/5 19:40
 */
@Component
public class User {
    private String name;
    private  String info;
    private Integer age;
    private Integer id;


    public User() {
    }

    public User(String name, String info, Integer age, Integer id) {
        this.name = name;
        this.info = info;
        this.age = age;
        this.id = id;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return info
     */
    public String getInfo() {
        return info;
    }

    /**
     * 设置
     * @param info
     */
    public void setInfo(String info) {
        this.info = info;
    }

    /**
     * 获取
     * @return age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * 获取
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    public String toString() {
        return "User{name = " + name + ", info = " + info + ", age = " + age + ", id = " + id + "}";
    }
}
