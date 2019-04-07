/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: Singleton
 * Author:   YuSong
 * Date:     2018/10/13 18:49
 * Description: Ⅲ 懒汉式-线程安全
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.GitHub.CsNote.Singelton.lmp3;

/**
 * 〈一句话功能简述〉<br> 
 * 〈Ⅲ 懒汉式-线程安全〉
 *
 *  >>> 要实现懒汉式线程安全只需要对getUniqueInstance()加锁，
 *  那么在一个时间点只能有一个线程能够进入该方法，从而避免实例化多次uniqueInstance
 *
 *  >>> 但是当一个线程进入该方法之后，其它试图进入该方法的线程都必须等待，即使 uniqueInstance 已经被实例化了。
 *  这会让线程阻塞时间过长，因此该方法有性能问题，不推荐使用。
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
    private Singleton(){

    }

    /**
     * 给公共静态方法getUniqueInstance()加锁
     * @return
     */
    public static synchronized Singleton getUniqueInstance(){
        if (uniqueInstance == null){
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}