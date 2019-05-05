/**
 * Copyright (C), 2015-2019, XXXX有限公司
 * FileName: TestVolatile
 * Author:   YuSong
 * Date:     2019/5/4 19:48
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.javase.juc1;

/**
 * <<Volatile关键字>>
 * 一、Volatile关键字
 * @description:当多个线程操作共享数据时，可以保证内存中的数据可见。
 *    相较于synchronized 是一种较为轻量级的同步策略
 *
 * 注意：
 * 1.volatile 不具备"互斥性"
 * 2.volatile 不能保证变量的"原子性"
 * @author Raven
 * @date 2019/5/4 19:48
 */
public class TestVolatile {

    public static void main(String[] args) {
        ThreadDemo td = new ThreadDemo();
        new Thread(td).start();

        while (true) {
            if (td.isFlag()) {
                System.out.println("----------------------");
                break;
            }
        }
    }
}

class ThreadDemo implements Runnable {

    private volatile boolean flag = false;

    @Override
    public void run() {

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        flag = true;

        System.out.println("flag=" + isFlag());
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}