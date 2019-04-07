/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: Solution
 * Author:   YuSong
 * Date:     2018/10/15 20:29
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.GitHub.CsNote.Sword_Finger_Offer;

import java.util.ArrayList;
import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈数组中重复的数字〉
 * 在一个长度为 n 的数组里的所有数字都在 0 到 n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字是重复的，也不知道每个数字重复几次。请找出数组中任意一个重复的数字。
 * <p>
 * Input:
 * {2, 3, 1, 0, 2, 5}
 * <p>
 * Output:
 * 2
 *
 * @author YuSong
 * @create 2018/10/15
 * @since 1.0.0
 */
public class Solution {

    /**
     * @param nums
     * @param length
     * @param duplication
     * @return
     */
    public boolean duplicate(int[] nums, int length, int[] duplication) {
        if (nums == null || length <= 0) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            while (nums[i] != i) {
                if (nums[i] == nums[nums[i]]) {
                    duplication[0] = nums[i];
                    System.out.println(nums[i]);
                    return true;
                }
                swap(nums, i, nums[i]);
            }
        }
        return false;
    }

    private void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }


    /**
     * 第二种解法
     */
       /* boolean[] k = new boolean[length];
        for (int i = 0; i < k.length; i++) {
            if (k[nums[i]] == true) {
                duplication[0] = nums[i];
                return true;
            }
            k[nums[i]] = true;
        }
        return false;
    }*/
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 0, 2, 5, 3};
        Solution solution = new Solution();
        int[] duplication={2, 3, 1, 0, 2, 5, 3};
        boolean duplicate = solution.duplicate(nums, 7, duplication);
        System.out.println(duplicate);

        List<String> list = new ArrayList<>(2);
        list.add("guan");
        list.add("bao");
        String[] array = new String[list.size()];
        array = list.toArray(array);
        System.out.println(array);
    }
}

