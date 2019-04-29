/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: GenericTest
 * Author:   YuSong
 * Date:     2019/4/29 21:27
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.javase.lesson8;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

/**
 * <<功能简述>> 
 * @description:
 * @author Raven
 * @date 2019/4/29
 * @version
 */
public class GenericTest {

    public static final Logger LOGGER = LoggerFactory.getLogger(GenericTest.class);

    /**
     * 不使用泛型时：
     * 1. 集合中的类型并不安全。 可以向集合中放入任何引用类型的对象
     * 2. 从集合中取出的对象都是Object类型，在具体操作时可能需要进行类型的强制转换，那么
     * 在强制转换时也容易发生ClassCastException.
     *
     */

    @Test
    public void testCollectionWithGeneric(){

        Set<Person> persons = new TreeSet<Person>(new Comparator<Person>() {

            @Override
            public int compare(Person p1, Person p2) {
                return p2.getAge()-p1.getAge() ;
            }
        });
        persons.add(new Person("AA",16));
        persons.add(new Person("BB",13));
        persons.add(new Person("CC",11));
        persons.add(new Person("DD",18));

        Iterator<Person> it = persons.iterator();
        while (it.hasNext()){
            Person person = it.next();
            System.out.println(person.getAge());
        }
    }

    @Test
    public void helloGeneric(){

        //public interface List<E>
        List<Person> persons2 = new ArrayList<>();

        persons2.add(new Person("AA",12));
        persons2.add(new Person("BB",13));
        persons2.add(new Person("CC",14));
        persons2.add(new Person("DD",15));
        persons2.add(new Person("EE",16));
        persons2.add(new Student());
        //person2.add("");
        Person person2 = persons2.get(2);
        person2.setAge(22);

        System.out.println(person2);

        System.out.println();
        List persons = new ArrayList();
       
        persons.add(new Person("AA",12));
        persons.add(new Person("BB",13));
        persons.add(new Person("CC",14));
        persons.add(new Person("DD",15));
        //persons.add("ABCD");
        for (int i = 0; i <persons.size() ; i++) {
            Object obj =persons.get(i);
            Person person = (Person) obj;

            System.out.println(person.getName());
        }

    }
}