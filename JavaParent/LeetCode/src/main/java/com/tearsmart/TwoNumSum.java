package com.tearsmart;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author 刘彦磊
 * @Date 2020/10/13
 */
public class TwoNumSum {

    public static void main(String[] args) {
        int[] arr = {3,5,6,12};
        System.out.println(Arrays.toString(twoSum(arr, 9)));
    }
    private static int[] twoSum(int[] nums,int target){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int differ = target - nums[i];
            if (map.containsKey(nums[i])) {
                return new int[]{map.get(nums[i]),i};
            }
            map.put(differ, i);
        }
        return new int[0];
    }
}
