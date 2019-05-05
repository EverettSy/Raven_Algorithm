/**
 * Copyright (C), 2015-2019, XXXX有限公司
 * FileName: TestAtomicDemo
 * Author:   YuSong
 * Date:     2019/5/4 21:54
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.javase.juc1;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * <<JUC线程高级_原子变量与 CAS 算法>>
 * 一、i++的原子性问题：i++的操作实际上分为三个步骤"读-改-写"
 *         int i = 10;
 *         i = i++;//10
 *
 *         int temp = i;
 *         i = i+1;
 *         i =temp;
 *
 * 二、原子变量：jdk1.5后java.util.concurrent.atomic 包下提供了常用的原子变量：
 *      1.volatile 保证内存可见性
 *      2.CAS(Compare-And-Swap)算法保证数据的原子性
 *        CAS 算法是硬件对于并发操作共享数据的支持
 *        CAS 包含了三个操作：
 *        内存值 V
 *        预估值 A
 *        更新值 B
 *        当内存值 V == A时, V = B,否则,将不做任何操作
 *
 *
 * @author Raven
 * @description:
 * @date 2019/5/4 21:54
 */
public class TestAtomicDemo {

    public static void main(String[] args) {
        AtomicDemo ad = new AtomicDemo();

        for (int i = 0; i < 10; i++) {
            new Thread(ad).start();
        }

    }

}

class AtomicDemo implements Runnable {

    // private volatile int serialNumber = 0;

    private AtomicInteger serialNumber = new AtomicInteger();

    @Override
    public void run() {

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName() + ":" + getSerialNumber());
    }

    public int getSerialNumber() {
        return serialNumber.getAndIncrement();
    }
}