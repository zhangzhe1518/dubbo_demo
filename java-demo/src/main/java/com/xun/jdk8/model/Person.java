package com.xun.jdk8.model;

import java.io.Serializable;

/**
 * @author 寻。
 */
public class Person implements Serializable {

    public boolean big(int a,int b){
        if(a>b){
            return true;
        }
        return false;
    }

    private String name = "xun";

    private Integer age = 20;

    public String getName() {
        return name;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getAge() {
        return age;
    }

    public Person setAge(Integer age) {
        this.age = age;
        return this;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String sayHello(){
        return "hello";
    }


}
