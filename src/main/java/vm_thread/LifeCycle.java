/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: LifeCycle
 * Author:   YuSong
 * Date:     2018/10/17 23:51
 * Description: 线程的生命周期
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package vm_thread;

import java.util.HashMap;
import java.util.Map;

/**
 * 〈一句话功能简述〉<br>
 * 〈线程的生命周期〉
 *
 * @author Raven
 * @create 2018/10/17
 * @since 1.0.0
 */
public class LifeCycle extends Thread {

    private  volatile boolean stop  = false;
    int a= 0;
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName()+" "+i);
            super.run();
            while (!stop){
                synchronized (""){
                    a++;
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    a--;
                    String tn=Thread.currentThread().getName();
                    System.out.println(tn+":a="+a);

                }
            }
        }
    }

    public static void main(String[] args) {
        /*LifeCycle thread = new LifeCycle();
        for (int i = 0; i <300 ; i++) {
            // 调用Thread的currentThread方法获取当前线程
            System.out.println(Thread.currentThread().getName()+" "+ i);
            if (i == 20){
                //启动线程
                thread.start();
                //判断启动后线程的isAlive()值，输出true
                System.out.println(thread.isAlive());

            }
            // 只有当线程处于新建、死亡两种状态时isAlive()方法返回false。
            // 当i > 20，则该线程肯定已经启动过了，如果thread.isAlive()为假时，
            // 那只能是死亡状态了。
            if (i>20 && !thread.isAlive()){
                // 试图再次启动该线程
                thread.start();
            }

        }*/
        StringBuffer stringBuffer = new StringBuffer("This onle").append("easy").append("Now");
        stringBuffer.insert(6,"onley");
        System.out.println(stringBuffer);

        StringBuilder stringBuilder = new StringBuilder("This is Join").delete(4,6).append("Now Myeclipeses");
        System.out.println(stringBuilder);

        Map<String,String> hashMap = new HashMap<String, String>(10);

    }
}
