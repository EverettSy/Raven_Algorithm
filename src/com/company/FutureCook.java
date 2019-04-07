/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: FutureCook
 * Author:   YuSong
 * Date:     2018/4/23 0:48
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.company;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author YuSong
 * @create 2018/4/23
 * @since 1.0.0
 */
public class FutureCook {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        long startTime = System.currentTimeMillis();

        //网购厨具
        Callable<Chuju> onlineShopping = new Callable<Chuju>() {


            @Override
            public Chuju call() throws Exception {
                System.out.println("第一步：下单");
                System.out.println("第一步：等待送货");
                Thread.sleep(5000);//模拟送货时间
                System.out.println("第一步：快递送到");
                return new Chuju();
            }
        };
        FutureTask<Chuju> task = new FutureTask<Chuju>(onlineShopping);
        new Thread(task).start();
        // 第二步 去超市购买食材
        Thread.sleep(2000);//模拟买食材时间
        Shicai shicai = new Shicai();
        System.out.println("第二步：食材到位");
        if (!task.isDone()) {//联系快递员询问是否在配送
            System.out.println("第三步：厨具还没到，心情好就等着（心情不好就调用cancel方法取消订单）");

        }
        Chuju chuju = task.get();
        System.out.println("第三步：厨具到位，开始展现厨艺");
        cook(chuju, shicai);

        System.out.println("总共用时" + (System.currentTimeMillis() - startTime) + "ms");

    }

    //用厨具烹饪食材
    private static void cook(Chuju chuju, Shicai shicai) {

    }

    //食材类
    private static class Shicai {

    }

    //厨具类
    private static class Chuju {

    }
}

