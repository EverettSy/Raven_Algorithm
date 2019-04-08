/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: Jdsubbort
 * Author:   YuSong
 * Date:     2018/9/9 21:16
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package company;

import java.util.Scanner;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author YuSong
 * @create 2018/9/9
 * @since 1.0.0
 */
public class Jdsubbort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[][] arry = new int[a][3];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < 3; j++) {
                arry[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if (arry[i][0] < arry[j][0] && arry[i][1] < arry[j][1] && arry[i][2] < arry[j][2]){
                    arry[i][0]=0;
                    arry[i][1]=0;
                    arry[i][2]=0;
                    j = a;
                }
            }
        }
        int sum = 0;
        for (int i = 0; i <a ; i++) {
            if (arry[i][0]==0){
                sum ++;
            }
            System.out.println(sum);
        }
    }
}

