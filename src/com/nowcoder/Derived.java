/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: Derived
 * Author:   YuSong
 * Date:     2018/9/15 13:03
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.nowcoder;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author Raven
 * @create 2018/9/15
 * @since 1.0.0
 */
/*class Base{

    public Base(String s){
        System.out.println("B");
        this.satis(s);
    }

    private void satis(String str) {
        System.out.println("v");
    }
}
public class Derived extends Base {

    public Derived(String s) {
        super(s);
        System.out.println("D");
    }*/

public class Derived {
    private static int x = 100;

    public static void main(String[] args) {
        // new Derived("C");

        int[] a = {1, 2, 2, 5, 4, 5, 3, 7};
        for (int b : a) {
            if (b == 5) {
                break;
            } else {
                System.out.println(b);
            }
        }

        long as = 0Xf000000000000000L;
        long bs = 0X7FFFFFFFFFFFFFFFL;
        System.out.println(Long.toBinaryString(as) + " 长度为： " + Long.toBinaryString(as).length());
        System.out.println(Long.toBinaryString(bs) + " 长度为： " + Long.toBinaryString(bs).length());
        System.out.println(Long.toBinaryString((long) (as - bs)) + " 长度为： " + Long.toBinaryString(as - bs).length());

        Derived hs1 = new Derived();
        hs1.x++;
        Derived hs2 = new Derived();
        hs2.x++;
        hs1=new Derived();
        hs1.x++;
        Derived.x--;
        System.out.println("x="+x);

        Integer i1 = 128;
        Integer i2 = 128;
        System.out.println((i1 == i2) + ",");

        String i3 = "100";
        String i4 = "1" + new String("00");
        System.out.println((i3 == i4) + ",");

        Integer i5 = 100;
        Integer i6 = 100;
        System.out.println((i5 == i6));

        Integer var1=new Integer(1);
        Integer var2=var1;
        doSomething(var2);
        System.out.print(var1.intValue());
        System.out.print(var1==var2);
        System.out.println();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.print("foo");
            }
        };
        try {
            Thread t =new Thread(runnable);
            t.run();
            System.out.print("bar");
            System.exit(0);
        } catch (Exception e) {

        }

        int i=0;
        Integer j = new Integer(0);
        System.out.println(i==j);
        System.out.println(j.equals(i));
    }
    public static void doSomething(Integer integer){
        integer=new Integer(2);
    }
}