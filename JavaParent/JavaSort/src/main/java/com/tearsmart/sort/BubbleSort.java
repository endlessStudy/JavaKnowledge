package com.tearsmart.sort;

import java.util.Arrays;

/**
 * 冒泡排序
 *
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
            // 每次循环结束,得到一个最小值,需要循环length - 1次才能排序完成
            // 第一次排序完成,数组第一个位置为最小值,故第二次循环只需要循环到下标为1的位置
            // 依次类推,每次循环结束的位置为循环次数 + 1的位置,即j > i
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

    /**
     * 优化
     *
     * @param target
     */
    private static void sort2(int[] target) {
        int temp = 0;
        for (int i = 0; i < target.length - 1; i++) {
            int index = 0;
            for (int j = target.length - 1; j > i; j--) {
                if (target[j] < target[j - 1]) {
                    temp = target[j];
                    target[j] = target[j - 1];
                    target[j - 1] = temp;
                    index = j;
                }
            }
            i = index;
            System.out.println(Arrays.toString(target));
        }
        System.out.println(Arrays.toString(target));
    }
}
