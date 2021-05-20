package com.tearsmart.sort;

import java.util.Arrays;

/**
 * 快速排序
 * @author 刘彦磊
 */
public class QuickSort{
    public static void main(String[] args) {
        // 对 arr 进行拷贝，不改变参数内容
        int[] arr = {2,3,1,9,4};
        int[] result = quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(result));

    }

    private static int[] quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int partitionIndex = partition(arr, left, right);
            quickSort(arr, left, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, right);
        }
        return arr;
    }

    private static int partition(int[] arr, int left, int right) {
        // 设定基准值（pivot）
        int index = left + 1;
        for (int i = index; i <= right; i++) {
            int a = arr[i];
            int b = arr[left];
            if (a < b) {
                swap(arr, i, index);
                index++;
            }
        }
        swap(arr, left, index - 1);
        return index - 1;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}