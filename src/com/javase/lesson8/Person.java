/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Person
 * Author:   YuSong
 * Date:     2019/4/29 22:02
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.javase.lesson8;

/**
 * <<功能简述>> 
 * @description:
 * @author Raven
 * @date 2019/4/29
 * @version
 */
public class Person {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}