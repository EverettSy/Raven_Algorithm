/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: Singleton
 * Author:   YuSong
 * Date:     2018/10/13 21:41
 * Description: Ⅴ静态内部类实现
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.GitHub.CsNote.Singelton.lmp5;

/**
 * 〈一句话功能简述〉<br> 
 * 〈Ⅴ 静态内部类实现〉
 *
 *  >>> 当 Singleton 类加载时，静态内部类 SingletonHolder 没有被加载进内存。只有当调用 getUniqueInstance() 方法从而触发 SingletonHolder.INSTANCE 时 SingletonHolder 才会被加载，
 *  此时初始化 INSTANCE 实例，并且 JVM 能确保 INSTANCE 只被实例化一次。
 *
 *  这种实现的方式不仅具有延迟初始化的好处，而且有JVM提供了对线程安全的支持。
 * @author Raven
 * @create 2018/10/13
 * @since 1.0.0
 */
public class Singleton {

    private Singleton(){

    }

    private  static class SingletonHolder{
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getUniqueInstance(){
        return SingletonHolder.INSTANCE;
    }
}