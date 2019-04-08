/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: Bracelets
 * Author:   YuSong
 * Date:     2018/12/6 23:02
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package nowcoder;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author Raven
 * @create 2018/12/6
 * @since 1.0.0
 */
public class Bracelets {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,m,c;
        n= sc.nextInt();
        m= sc.nextInt();
        c= sc.nextInt();

        ArrayList<HashSet<Integer>> sets = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            sets.add(new HashSet<Integer>());
            int num = sc.nextInt();
            for (int j = 0; j <num ; j++) {
                sets.get(i).add(sc.nextInt());
            }
        }
        int result = 0;
        //检查每一种颜色是否合格
        for (int i = 1; i <=c ; i++) {
            ArrayList<Integer> arr = new ArrayList<>();
            for (int j = 0; j <n ; j++) {
                if (sets.get(j).contains(i)){
                    arr.add(j);
                }
            }
            if (arr.isEmpty())
                continue;
            arr.add(arr.get(0)+n);
            for (int j = 0; j <arr.size()-1 ; j++) {
                if (arr.get(j+1)-arr.get(j)<m){
                    result++;
                    break;
                }
            }
        }
        System.out.println(result);
    }

}
