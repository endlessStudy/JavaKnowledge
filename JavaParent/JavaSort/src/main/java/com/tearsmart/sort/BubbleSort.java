package com.tearsmart.sort;

import java.util.Arrays;

/**
 * @author 刘彦磊
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {4, 2, 1, 5, 8, 9, 10};
        sort(arr);
    }

    private static void sort(int[] target) {
        int temp = 0;
        boolean tag = false;
        for (int i = 0; i < target.length - 1; i++) {
            for (int j = target.length - 1; j > i; j--) {
                if (target[j] < target[j - 1]) {
                    temp = target[j];
                    target[j] = target[j - 1];
                    target[j - 1] = temp;
                    tag = true;
                }
            }
            if (!tag) {
                break;
            }
            tag = false;
            System.out.println(Arrays.toString(target));
        }
        System.out.println(Arrays.toString(target));
    }
}
