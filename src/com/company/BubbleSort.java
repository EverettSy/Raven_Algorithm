/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: BubbleSort
 * Author:   YuSong
 * Date:     2018/4/23 12:01
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.company;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author syRaven
 * @create 2018/4/23
 * @since 1.0.0
 */
public class BubbleSort {

    /**
     * 冒泡排序
     *
     * @param array 目标数组
     */

    private static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            //标记
            boolean swapped = false;
            for (int j = 0; j < array.length-1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            //没有发生交互，证明排序已完成
            if (!swapped) {
                break;
            }
        }
    }

    /**
     * 选择排序
     * @param array
     */
    public static void selecSort(int[] array) {
        if (array == null || array.length == 0) {
            return;
        }
        for (int i = 0; i < array.length - 1; i++) {
            //将大年下表定为最小值下标
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            if (i!=min){
                int tmp = array[i];
                array[i] = array[min];
                array[min] = tmp;
            }
        }
    }


    public static void main(String[] args) {
        int[] p = {34,53,12,32,56,17};
        //方法第一行代码
        long startTime = System.currentTimeMillis();
        //冒泡排序
        BubbleSort.bubbleSort(p);
       // BubbleSort.selecSort(p);
       /* for (int i = 0; i < p.length; i++) {
            System.out.print(p[i] + " ");
        }*/
        for(int n : p){
            System.out.print(n+" ");
        }
        System.out.println();
        //方法最后一行代码
        long endTime = System.currentTimeMillis();
        //long类型时间差,单位毫秒
        long timeLong = endTime - startTime;
        //long类型时间差转为double类型时间差,单位毫秒
        double timeDouble = Double.parseDouble(Long.toString(timeLong));
        System.out.println("运行时间为:"+ timeDouble+"毫秒，即"+timeDouble/(double)1000+"秒");

    }
}

