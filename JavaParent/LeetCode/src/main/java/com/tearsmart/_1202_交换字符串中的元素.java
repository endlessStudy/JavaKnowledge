package com.tearsmart;

import com.google.common.collect.Lists;

import java.util.Arrays;
import java.util.List;

/**
 * @author 刘彦磊
 * @date 2021/1/11
 */
public class _1202_交换字符串中的元素 {
    public static void main(String[] args) {
        System.out.println(smallestStringWithSwaps("dcab", Lists.newArrayList(
                Lists.newArrayList(0, 3), Lists.newArrayList(1, 2),
                Lists.newArrayList(0, 2)
        )));
    }

    private static String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {
        if (pairs == null || pairs.size() == 0) {
            return s;
        }
        String[] strArr = s.split("");
        for (List<Integer> pair : pairs) {
            if (pair.size() != 2) {
                return s;
            }
            Integer i1 = pair.get(0);
            Integer i2 = pair.get(1);
            if (!i1.equals(i2)) {
                String temp = strArr[i1];
                strArr[i1] = strArr[i2];
                strArr[i2] = temp;
            }
        }
        StringBuilder stringBuffer = new StringBuilder();
        Arrays.stream(strArr).forEach(stringBuffer::append);
        return stringBuffer.toString();
    }
}
