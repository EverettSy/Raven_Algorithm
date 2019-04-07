/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: QuickSort
 * Author:   YuSong
 * Date:     2018/11/25 12:30
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.company;

/**
 * 〈一句话功能简述〉<br>
 * 〈快速排序〉
 *
 * @author YuSong
 * @create 2018/11/25
 * @since 1.0.0
 */
public class QuickSort {

    public static void quickSort(int[] a, int l, int r) {
        if (l < r) {
            int i, j, x;

            i = l;
            j = r;
            x = a[i];
            while (i < j) {
                while (i < j && a[j] > x) {
                    j--;//从右向左找第一个大于x的数
                }
                if (i < j) {
                    a[i++] = a[j];
                }
                while (i < j && a[i] < x) {
                   i++;//从左向右找第一个大于x的数
                }
                if (i<j){
                    a[j--] = a[i];
                }
                a[i] = x;
                quickSort(a, l, i - 1);//递归调用
                quickSort(a, i + 1, r);//递归调用
            }
        }
    }

    public static void main(String[] args) {
        int i;
        int a[] = {30, 40, 60, 10, 20, 50};

        System.out.printf("before sort:");
        for (i = 0; i < a.length; i++) {
            System.out.printf("%d ", a[i]);
        }
        System.out.printf("\n");

        quickSort(a, 0, a.length - 1);

        System.out.printf("after sort:");
        for (i = 0; i < a.length; i++) {
            System.out.printf("%d ", a[i]);
        }
        System.out.printf("\n");
    }
}

