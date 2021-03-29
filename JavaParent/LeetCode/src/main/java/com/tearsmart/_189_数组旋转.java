package com.tearsmart;

import java.util.Arrays;

/**
 * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
 * <p>
 * 输入: [1,2,3,4,5,6,7] 和 k = 3
 * 输出: [5,6,7,1,2,3,4]
 * 解释:
 * 向右旋转 1 步: [7,1,2,3,4,5,6]
 * 向右旋转 2 步: [6,7,1,2,3,4,5]
 * 向右旋转 3 步: [5,6,7,1,2,3,4]
 *
 * @author 刘彦磊
 * @date 2021/1/8
 */
public class _189_数组旋转 {
    public static void main(String[] args) {
        // int[] nums = {-1, -100, 3, 99};
        int[] nums = {1,2};
        // rotate(nums, 5);
        rotate2(nums, 5);
        System.out.println(Arrays.toString(nums));
    }

    public static void rotate(int[] nums, int k) {
        if (nums == null) {
            return;
        }
        int length = nums.length;
        if (length == 1) {
            return;
        }
        while (k > 0) {
            int temp = nums[length - 1];
            System.arraycopy(nums, 0, nums, 1, length - 1);
            nums[0] = temp;
            k--;
        }
    }

    public static void rotate2(int[] nums, int k) {
        int n = nums.length;
        k%=n;
        if(k==0){
            return;
        }
        reverse(nums,0,n-1);
        reverse(nums,0,n-k-1);
        reverse(nums,n-k,n-1);
    }
    private static void reverse(int[] nums,int l,int r){
        while(l<r){
            int tmp = nums[l];
            nums[l] = nums[r];
            nums[r] = tmp;
            l++;
            r--;
        }
    }
}
