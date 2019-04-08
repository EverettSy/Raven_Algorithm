/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: Test1
 * Author:   YuSong
 * Date:     2018/11/13 23:01
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package jdk8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author Raven
 * @create 2018/11/13
 * @since 1.0.0
 */
public class Test1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
        System.out.println("-------------------");

        for (Integer i : list) {
            System.out.print(i);
        }
        System.out.println("-------------------");
        /**
         *
         *
         * 关于函数式接口
         * 1、如果一个接口只有一个抽象方法，那么该接口就是一个函数式接口
         * 2、如果我们在某个接口上声明了FunctionalInterface注解，那么编译器就会按照函数式接口约定以来要求该接口。
         * 3、如果某个接口只有一个抽象方法，但我们并没有给该接口声明FunctionalInterface注解,那么编译器依旧会将该接口看作是函数式接口。
         */
        list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.print(integer);
            }
        });
        System.out.println("-------------------");
    }

}
