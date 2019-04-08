/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: TicketDemo
 * Author:   YuSong
 * Date:     2019/3/6 23:08
 * Description: 一、什么情况下会产生线程安全问题？ 同时满足以下两个条件时：  1，多个线程在操作共享的数据。 2，操作共享数据的线程代码有多条。  当一个线程在执行操作共享数据的多条代码过程中，其他线程参与了运算，就会导致线程安全问题的产生。
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package thread_io.thread;

/**
 * 〈一句话功能简述〉<br>
 * 〈一、什么情况下会产生线程安全问题？ 同时满足以下两个条件时：
 *  1，多个线程在操作共享的数据。
 *  2，操作共享数据的线程代码有多条。
 *  当一个线程在执行操作共享数据的多条代码过程中，其他线程参与了运算，就会导致线程安全问题的产生。〉
 *
 * @author Raven
 * @create 2019/3/6
 * @since 1.0.0
 */
public class TicketDemo implements Runnable {
    private int tickets = 100;
    Object object = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized (object) {
                if (tickets > 0) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "...sale:...." + tickets--);
                }
            }
        }
    }
    public static void main(String[] args) {
        TicketDemo ticketDemo = new TicketDemo();
        Thread t1 = new Thread(ticketDemo);
        Thread t2 = new Thread(ticketDemo);
        Thread t3 = new Thread(ticketDemo);
        Thread t4 = new Thread(ticketDemo);
        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}
