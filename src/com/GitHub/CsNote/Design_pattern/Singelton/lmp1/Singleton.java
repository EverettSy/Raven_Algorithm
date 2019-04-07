/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: Singleton
 * Author:   YuSong
 * Date:     2018/10/13 17:49
 * Description: 单例模式
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.GitHub.CsNote.Design_pattern.Singelton.lmp1;

/**
 * 〈单例模式〉
 * 〈Ⅰ 懒汉式-线程不安全〉
 *
 * >>> 这样实现，私有静态变量uniquelnstance被延迟实例化，这样做的好处是，
 * 如果没有永高该类，就不会实例化uniquelnstance，从而节约资源。
 *
 * >>> 在多线程环境下是不安全的，如果多个线程能够同时进入if(uniquelnstance == null),
 * 并且此时uniquelnstance为null，那么会有多个线程执行uniquelnstance = new uniquelnstance();语句
 * ，这将导致实例化多次uniquelnstance。
 * @author Raven
 * @create 2018/10/13
 * @since 1.0.0
 */
public class Singleton {

    /**
     * 私有静态变量uniqueInstance
     */
    private static Singleton uniqueInstance;

    /**
     * 私有构造方法
     */
    private Singleton() {

    }

    /**
     * 公共静态方法
     *
     * @return
     */
    public static Singleton getUniqueInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}