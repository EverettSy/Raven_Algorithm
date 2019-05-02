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

import java.util.*;

/**
 * <<泛型入门>>
 * 关于泛型:
 * 1.为什么需要泛型
 * 1.1 使用集合时可能会发生安全的问题：可以向集合中放入任何类型
 * 1.2 麻烦：从集合中获取元素,需要进行类型的强制转换
 * <p>
 * 2.使用泛型：使用泛型方法、泛型类
 * 3.定义泛型
 * 3.1：定义泛型类： 按照规则来定义
 * 3.1.1 声明类(接口)时,在类名的后面,大括号的前面利用<> 来声明泛型。
 * 在类中凡是可以使用类型的地方都可以使用类中声明的泛型.
 * public class Dao<T>
 * <p>
 * 3.2：定义泛型方法
 * 3.2.1 在类(不一定是泛型类)中使用泛型方法.
 * 3.2.2 在方法的返回值前面使用 <> 声明泛型类型，则在方法的返回值,参数,方法体中
 * 都可以使用该类型
 * <p>
 * 4.通配符
 * 4.1 如果Foo是Bar的一个子类型(子类或接口),而G是某种泛型声明.
 * 那么G<Foo>是G<Bar>的子类型并不成立:Person 是Object的子类,但List<Person>
 * 却不是List<Object>的子类！
 * <p>
 * printPersons(List<Person> persons); 该方法的参数只能是Person类型的List,而不能
 * 是Person 任何子类的List,例如Student类型的List/
 * <p>
 * <p>
 * 4.2 Collection<?>:
 * 4.2.1 它的元素类型可以匹配任何类型. ? 被称为通配符.
 * 4.2.2 将任意元素加入其中不是类型安全的,null除外！ 因为null 可以是任何类型
 * <p>
 * 4.3 Collection<? extends Person>为带上限的通配符：该类型可以指向Person类型
 * 及Person子类类型的集合。但，也不能向其中放null以外的任何元素.
 *
 * @author Raven
 * @description:
 * @date 2019/4/29
 */
public class GenericTest {

    @Test
    public void testUseGeneric() {
        Collection<Person> persons = new ArrayList<>();

        persons.add(new Person());
        persons.add(new Person());
        persons.add(new Person());
        persons.add(new Person());

        //调用collection 的toArray方法把该集合转为Person类型的数组
        Person[] personArray = persons.toArray(new Person[0]);
        System.out.println(personArray.length);

        Map<String, Person> personMap = new HashMap<>();
        personMap.put("AA1", new Person("AA", 12));
        personMap.put("BB2", new Person("BB", 13));
        personMap.put("CC3", new Person("CC", 14));
        personMap.put("DD3", new Person("DD", 15));

        for (Map.Entry<String, Person> entry : personMap.entrySet()) {
            String key = entry.getKey();
            Person val = entry.getValue();
            int hs = entry.hashCode();
            Boolean eq = entry.equals(hs);
            System.out.println(key + "————" + val + "————" + hs + "--" + eq);
        }
    }

    @Test
    public void testGenericMethod() {
        Dao<Person> dao = new Dao<>();

        Person person = dao.get(1);
        String name = person.getName();

        String name2 = dao.getProperty(1);
        Integer age = dao.getProperty(2);
        //int age = dao.get(2);

        dao.test("");
        dao.test(new Person());
    }


    /**
     * 如果Foo是Bar的一个子类型(子类或接口),而G是某种泛型声明.
     * 那么G<Foo>是G<Bar>的子类型并不成立！！！
     */
    @Test
    public void testGenericAndExtends() {
        Object[] objs = new Object[10];
        Person[] persons = new Person[10];

        //object 是Person 的父类，则Object的数组也是Person 数组的父类.
        objs = persons;

        List<Object> objectList = new ArrayList<>();
        List<Person> personList = new ArrayList<>();

        //Object 是Person的父类，但List<Object> 却不是List<Person>的父类。
        //用反证法：若可以，则意味着可以向objectList中放入任何类型的对象，而从personList
        //中获取的却是Person 类型的对象，这不可能。
        // objectList = personList;
        printPersons(personList);
        List<Student> studentList = new ArrayList<>();

        //不能传入studentList，理由同上. persons = studentList;
        // printPersons(studentList);

        printPersions2(personList);
        printPersions2(studentList);
    }


    /**
     * 1.Collection<?>(发音为："collection of unknown").
     * 就是，一个集合,它的元素类型可以匹配任何类型.显然, 它被称为通配符.
     * 2.将任意元素加入其中不是类型安全的,null除外！ 因为null 可以是任何类型
     *
     * @param coll
     */
    public void printCollection(Collection<?> coll) {
        coll.add(null);
        //coll.add("");
    }

    /**
     * 带通配符的集合的泛型声明.
     * 只要存在通配符，写入就是非法的
     * 带上限的通配符
     *
     * @param persons
     */
    public void printPersions2(List<? extends Person> persons) {

    }

    /**
     * 要求传入的参数是Person 类型的List 或Person 子类型的List
     * 即. List<Person> persons 或List<Student> students</>
     *
     * @param persons
     */
    public void printPersons(List<Person> persons) {

    }

    public void testGenericClass() {
        Dao<Person> dao = new Dao<>();

        Person p = new Person();
        dao.save(p);
    }

    /**
     * 不使用泛型时：
     * 1. 集合中的类型并不安全。 可以向集合中放入任何引用类型的对象
     * 2. 从集合中取出的对象都是Object类型，在具体操作时可能需要进行类型的强制转换，那么
     * 在强制转换时也容易发生ClassCastException.
     */

    @Test
    public void testCollectionWithGeneric() {

        Set<Person> persons = new TreeSet<Person>(new Comparator<Person>() {

            @Override
            public int compare(Person p1, Person p2) {
                return p2.getAge() - p1.getAge();
            }
        });
        persons.add(new Person("AA", 16));
        persons.add(new Person("BB", 13));
        persons.add(new Person("CC", 11));
        persons.add(new Person("DD", 18));

        Iterator<Person> it = persons.iterator();
        while (it.hasNext()) {
            Person person = it.next();
            System.out.println(person.getAge());
        }
    }

    @Test
    public void helloGeneric() {

        //public interface List<E>
        List<Person> persons2 = new ArrayList<>();

        persons2.add(new Person("AA", 12));
        persons2.add(new Person("BB", 13));
        persons2.add(new Person("CC", 14));
        persons2.add(new Person("DD", 15));
        persons2.add(new Person("EE", 16));
        persons2.add(new Student());
        //person2.add("");
        Person person2 = persons2.get(2);
        person2.setAge(22);

        System.out.println(person2);

        System.out.println();
        List persons = new ArrayList();

        persons.add(new Person("AA", 12));
        persons.add(new Person("BB", 13));
        persons.add(new Person("CC", 14));
        persons.add(new Person("DD", 15));
        //persons.add("ABCD");
        for (int i = 0; i < persons.size(); i++) {
            Object obj = persons.get(i);
            Person person = (Person) obj;

            System.out.println(person.getName());
        }

    }
}