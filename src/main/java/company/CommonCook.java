/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: CommonCook
 * Author:   YuSong
 * Date:     2018/4/23 0:08
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package company;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author YuSong
 * @create 2018/4/23
 * @since 1.0.0
 */
public class CommonCook {
    public static void main(String[] args) throws InterruptedException {

        long startTime = System.currentTimeMillis();
        //网购厨具
        OnlineShopping thread = new OnlineShopping();
        thread.start();
        thread.join();//保证厨具送到
        Thread.sleep(2000);//模拟买食材时间
        Shicai shicai = new Shicai();
        System.out.println("第二步：食材到位");
        //用厨具烹饪食材
        System.out.println("第三步：开始展现厨艺");
        Cook(thread.chuju, shicai);

        System.out.println("总共用时" + (System.currentTimeMillis() - startTime) + "ms");

    }

    //网购厨具线程
    private static class OnlineShopping extends Thread {

        private Chuju chuju;

        @Override
        public void run() {
            System.out.println("第一步：下单");
            System.out.println("第一步：等待送货");
            try {
                Thread.sleep(5000);//模拟送货时间
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("第一步：快递送到");
            chuju = new Chuju();
            super.run();
        }


    }

    //用厨具烹饪食材
    private static void Cook(Chuju chuju, Shicai shicai) {

    }

    //厨具类
    private static class Chuju {

    }

    //食材类
    private static class Shicai {

    }
}

