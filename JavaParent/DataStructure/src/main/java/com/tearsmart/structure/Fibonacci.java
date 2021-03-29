package com.tearsmart.structure;

import java.util.Collections;
import java.util.LinkedList;

/**
 * 菲波那切数列
 * 0 1 1 2 3 5 8 13...
 * f(n) = f(n-1) + f(n-2)
 *
 * @author 刘彦磊
 * @date 2020/12/24
 */
public class Fibonacci {
    private static final int NUM = 2;

    public static void main(String[] args) {
        System.out.println(fibLoop(72));
        // System.out.println(fibWileLoop(72));
        System.out.println(fibMath(72));
    }

    /**
     * 递归计算
     * 时间复杂度O(n^2)
     *
     * @param n 位置
     * @return int
     */
    private static int fibRecursion(int n) {
        if (n < NUM) {
            return n;
        }
        return fibRecursion(n - 1) + fibRecursion(n - 2);
    }

    /**
     * 循环计算
     * 时间复杂度O(n)
     *
     * @param n 位置
     * @return int
     */
    private static int fibLoop(int n) {
        if (n < NUM) {
            return n;
        }
        int first = 0;
        int second = 1;
        for (int i = 0; i < n - 1; i++) {
            int temp = first + second;
            first = second;
            second = temp  % 1000000007;
        }
        return second;
    }

    /**
     * 循环计算
     * 时间复杂度O(n)
     *
     * @param n 位置
     * @return int
     */
    private static int fibWileLoop(int n) {
        if (n < NUM) {
            return n;
        }
        int first = 0;
        int second = 1;
        while (n-- > 1) {
            second += first;
            first = second - first;

        }
        return second;
    }

    /**
     * 特征方程
     * 时间复杂度O(1)
     * 自测时丢失精度
     * @param n 位置
     * @return int
     */
    private static int fibMath(int n) {
        double c = Math.sqrt(5);
        return (int) (((Math.pow((1 + c) / 2, n) - Math.pow((1 - c) / 2, n)) / c) % 1000000007);
    }
}
