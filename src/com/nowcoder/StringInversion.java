/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: StringInversion
 * Author:   YuSong
 * Date:     2019/3/12 21:27
 * Description: 字符串反转
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.nowcoder;

/**
 * 〈一句话功能简述〉<br>
 * 〈字符串反转〉
 *
 * @author Raven
 * @create 2019/3/12
 * @since 1.0.0
 */
public class StringInversion {

    public static void main(String[] args) {
       /* Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.nextLine();
            for (int i = s.length() - 1; i >= 0; i--) {
                System.out.print(s.charAt(i));
            }
            System.out.println("\n---->Test2:");
            String nextlineStr2 = sc.nextLine();
            System.out.println("scanner.next()得到：" + nextlineStr2);
            String nextStr2 = sc.next();
            System.out.println("scanner.next()得到：" + nextStr2);*/

            int i =8;
            System.out.println(++i+1);
            System.out.println(i+++1);

        /**
         * Java复制
         * 1. 直接赋值复制 （这实际上复制的是引用，，也就是
         * 说 a1 和 a2 指向的是同一个对象。因此，当 a1 变化的时候，a2 里面的成员变量也会跟
         * 着变化。）
         * 2. 浅复制（复制引用但不复制引用的对象）
         * 3. 深复制
         */

        class Resume implements Cloneable{
            @Override
            public Object clone(){
                try {
                    return super.clone();
                } catch (CloneNotSupportedException e) {
                    e.printStackTrace();
                }
            return null;
            }
        }
    }
}
//}