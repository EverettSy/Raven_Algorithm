/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: EagerSingleton
 * Author:   YuSong
 * Date:     2018/3/24 20:56
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package main.company;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉线程安全
 * 单例设计模式之饿汉模式
 *单例模式：保证一个类仅有一个实例，并提供一个访问它的全局访问点
 * @author YuSong
 * @create 2018/3/24
 * @since 1.0.0
 */
public class EagerSingleton {
    //jvm保证在任何线程访问uniqueInstance静态变量之前一定先创建了此实例
    private static EagerSingleton uniqueInstance = new EagerSingleton();

    //私有的默认构造子，保证外界无法直接实例化
    private EagerSingleton() {

    }

    //提供全局访问点获取唯一的实例
    public static EagerSingleton getInstance() {
        return uniqueInstance;
    }
}

