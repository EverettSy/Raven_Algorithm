/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: ThreeSumSlow
 * Author:   YuSong
 * Date:     2018/10/23 18:52
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.GitHub.CsNote.algorithm;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Raven
 * @create 2018/10/23
 * @since 1.0.0
 */
public class ThreeSumSlow implements  ThreeSum {

    @Override
    public int count(int[] nums) {
      int N = nums.length;
      int cnt = 0;
        for (int i = 0; i <N ; i++) {
            for (int j = 0; j <N ; j++) {
                for (int k = 0; k <N ; k++) {
                    if (nums[i] + nums[j]+nums[k] == 0){
                        cnt++;
                    }
                }
            }
        }
        return cnt;
    }
}