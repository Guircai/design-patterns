package com.guircai.design.creational.prototype;

public class User {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public User() {

    }
    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User [age=" + age + ", name=" + name + "]";
    }

    /**
     * 再创建一个人，赋予我的所有属性
     * 
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        User user = new User();
        user.setName(this.name);
        user.setAge(this.age);
        return user;
    }
}
