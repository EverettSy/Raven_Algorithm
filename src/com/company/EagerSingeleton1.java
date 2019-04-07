/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: EagerSingeleton1
 * Author:   YuSong
 * Date:     2018/3/24 22:57
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.company;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉线程安全
 *单例设计模式-饿汉模式
 * @author YuSong
 * @create 2018/3/24
 * @since 1.0.0
 */
public class EagerSingeleton1 {

    private static EagerSingeleton1 uniqueInstance = new EagerSingeleton1();

    private EagerSingeleton1(){
    }

    public static EagerSingeleton1 getiqueInstance(){
        return uniqueInstance;
    }
}

