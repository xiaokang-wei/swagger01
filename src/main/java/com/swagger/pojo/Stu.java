package com.swagger.pojo;

/**
 * @author wxk
 * @date 2020/12/5 20:35
 */
public class Stu {
    private  String name;
    private  Integer id;
    private  String info;

    public Stu() {
    }

    public Stu(String name, Integer id, String info) {
        this.name = name;
        this.id = id;
        this.info = info;
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

    public String toString() {
        return "Stu{name = " + name + ", id = " + id + ", info = " + info + "}";
    }
}
