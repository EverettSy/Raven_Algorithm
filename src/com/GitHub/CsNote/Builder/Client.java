/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Client
 * Author:   YuSong
 * Date:     2019/4/7 23:41
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.GitHub.CsNote.Builder;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Raven
 * @create 2019/4/7
 * @since 1.0.0
 */
public class Client {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        final int count = 26;
        for (int i = 0; i <count ; i++) {
            sb.append((char) ('a' + i));
        }
        System.out.println(sb.toString());
    }
}