/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: Singleton
 * Author:   YuSong
 * Date:     2018/10/13 19:47
 * Description: Ⅳ 双重校验锁-线程安全
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.GitHub.CsNote.Singelton.lmp4;

/**
 * 〈一句话功能简述〉<br>
 * 〈Ⅳ 双重校验锁-线程安全〉
 *  >>> uniqueInstance 只需要被实例化一次，之后就可以直接使用了。加锁操作只需要对实例化那部分的代码进行，只有当 uniqueInstance 没有被实例化时，才需要进行加锁。
 *
 *  >>> 双重校验锁先判断 uniqueInstance 是否已经被实例化，如果没有被实例化，那么才对实例化语句进行加锁。
 * @author Raven
 * @create 2018/10/13
 * @since 1.0.0
 */
public class Singleton {

    private volatile static Singleton uniqueInstance;

    private Singleton() {
    }

    public static Singleton getUniqueInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}