package com.tearsmart;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 刘彦磊
 * @date 2021/1/5
 */
public class _830_较大分组的位置 {

    public static void main(String[] args) {
        System.out.println(largeGroupPositions("abbxxxxzzy"));
    }

    private static List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> result = new ArrayList<>();
        if (s == null || s.length() < 3) {
            return result;
        }
        String[] strArr = s.split("");
        Map<String, Integer> map = new HashMap<>();
        String str = null;
        int start = 0;
        for (int i = 0; i < strArr.length; i++) {
            if (null == str) {
                str = strArr[i];
                start = i;
            } else if (!str.equals(strArr[i])) {
                if (i - 1 - start >= 2) {
                    List<Integer> list = new ArrayList<>();
                    list.add(start);
                    list.add(i-1);
                    result.add(list);
                }
                    str = strArr[i];
                    start = i;
            }
            if (i == strArr.length - 1) {
                if (i - start >= 2) {
                    List<Integer> list = new ArrayList<>();
                    list.add(start);
                    list.add(i);
                    result.add(list);
                }
            }
        }
        return result;
    }
}
