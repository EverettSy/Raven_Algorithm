/**
 * Copyright (C), 2015-2019, XXXX有限公司
 * FileName: TestCompareAndSwap
 * Author:   YuSong
 * Date:     2019/5/5 23:08
 * Description: JUC线程高级_模拟 CAS 算法
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.javase.juc1;

/**
 * <<JUC线程高级_模拟 CAS 算法>>
 *
 * @author Raven
 * @description:
 * @date 2019/5/5 23:08
 */
public class TestCompareAndSwap {

    public static void main(String[] args) {

        final CompareSwap cas = new CompareSwap();

        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {

                @Override
                public void run() {
                    int expecteValue = cas.get();
                    boolean b = cas.compareAndSet(expecteValue, (int) (Math.random() * 101));
                    System.out.println(b);
                }
            }).start();
        }
    }
}

class CompareSwap {
    private int value;

    //获取内存值
    public synchronized int get() {
        return value;
    }

    //比较
    public synchronized int compareAndSwap(int expecteValue, int newValue) {
        int oldValue = value;

        if (oldValue == expecteValue) {
            this.value = newValue;
        }

        return oldValue;
    }

    //设置
    public synchronized boolean compareAndSet(int expecteValue, int newValue) {
        return expecteValue == compareAndSwap(expecteValue, newValue);
    }
}