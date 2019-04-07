/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: Solution1
 * Author:   YuSong
 * Date:     2018/10/15 21:40
 * Description: 二维数组中的查找
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.GitHub.CsNote.Solutions;

/**
 * 〈一句话功能简述〉<br> 
 * 〈二维数组中的查找〉
 *
 * @author YuSong
 * @create 2018/10/15
 * @since 1.0.0
 */
public class Solution1 {

    public boolean Find(int[][] array,int target){
        int len = array.length-1;
        int i =0;
        while ((len>=0)&&(i<array[0].length)){
            if (array[len][i]>target){
                len --;
            }else if (array[len][i]<target){
                i++;
            }else{
                return true;
            }
        }
        return false;
    }
}

