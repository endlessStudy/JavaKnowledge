package com.tearsmart;

/**
 * @Author 刘彦磊
 * @Date 2020/10/14
 */
public class MaxArea {
    public static void main(String[] args) {
        int[] height = {1,1};
        System.out.println(maxArea(height));
    }
    private static int maxArea(int[] height) {
        int length = height.length;
        int maxArea = 0;
        for (int i = 0; i < length; i++) {
            if(i == 0){
                continue;
            }
            for (int j = 0; j < i; j++) {
                int max = Math.min(height[i], height[j]);
                maxArea = Math.max(maxArea, (i - j) * max);
            }
        }
        return maxArea;
    }
}
