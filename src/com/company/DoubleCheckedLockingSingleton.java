/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: DoubleCheckedLockingSingleton
 * Author:   YuSong
 * Date:     2018/4/14 12:44
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.company;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author YuSong
 * @create 2018/4/14
 * @since 1.0.0
 */
public class DoubleCheckedLockingSingleton {

    //java中使用双重锁检查锁定机制，由于Java编译器和JIL的优化原因系统无法保证我们期望的执行次序
    //在java5.0修改了内存模型，使用volatile声明的变量可以强制屏蔽编译器和JIT的优化工作
    private volatile static DoubleCheckedLockingSingleton uniqueInstance;

    private DoubleCheckedLockingSingleton(){

    }

    public static DoubleCheckedLockingSingleton getInstance() {
        DoubleCheckedLockingSingleton localRef = uniqueInstance;
        if (uniqueInstance ==null){
            synchronized (DoubleCheckedLockingSingleton.class){
                localRef = uniqueInstance;
                if (localRef ==null){
                    uniqueInstance = localRef = new DoubleCheckedLockingSingleton();
                }
            }
        }
        return localRef;
    }

}


