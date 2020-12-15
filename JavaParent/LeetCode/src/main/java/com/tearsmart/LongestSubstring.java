package com.tearsmart;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author 刘彦磊
 * @Date 2020/10/13
 */
public class LongestSubstring {

    public static void main(String[] args) {
        String string = "pwwkew";
        System.out.println(lengthOfLongestSubstring(string));

    }

    public static int lengthOfLongestSubstring(String s) {
        List<String> list = new ArrayList<>();
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            String s1 = String.valueOf(c);
            if (list.contains(s1)) {
                int size = list.size();
                max = Math.max(size, max);
                int index = list.indexOf(s1);
                list = list.subList(index+1, size);
            }
            list.add(s1);
        }
        return Math.max(list.size(), max);
    }
}
