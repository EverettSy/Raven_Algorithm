/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: Singleton
 * Author:   YuSong
 * Date:     2018/10/13 18:34
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.GitHub.CsNote.Design_pattern.Singelton.lmp2;

/**
 * 〈单例模式〉
 * 〈Ⅱ 饿汉式-线程安全〉
 *  >>> 线程不安全问题主要是由于uniquelnstance被实例化多次，
 *  采取直接实例化uniquelnstance不会产生线程不安全问题。
 *
 * @author Raven
 * @create 2018/10/13
 * @since 1.0.0
 */
public class Singleton {

    /**
     * 直接实例化 uniqueInstance
     */
    private static Singleton uniquelnstance = new Singleton();

    /**
     * 私有构造方法
     */
    private Singleton(){

    }

    /**
     * 直接返回uniquelnstance
     * @return
     */
    public static Singleton getUniquelnstance(){
        return uniquelnstance;
    }
}