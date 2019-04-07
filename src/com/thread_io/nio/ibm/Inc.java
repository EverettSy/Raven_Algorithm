/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: Inc
 * Author:   YuSong
 * Date:     2018/11/1 14:19
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.thread_io.nio.ibm;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Raven
 * @create 2018/11/1
 * @since 1.0.0
 */
public class Inc {

    public static void main(String[] args) {
        Inc inc = new Inc();
        int i =0;
        inc.fermin(i);
        i = i++;
        System.out.println(i);
    }

    private void fermin(int i) {
        i++;
    }
}