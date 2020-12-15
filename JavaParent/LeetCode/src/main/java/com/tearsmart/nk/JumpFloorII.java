package com.tearsmart.nk;

/**
 * 变态跳台阶 J29
 * @author 刘彦磊
 * @date 2020/10/30
 */
public class JumpFloorII {

    public static void main(String[] args) {
        System.out.println(jumpFloor(3));
    }

    private static int jumpFloor(int target) {
        return target <= 0 ? 0 : 1 << (target - 1);
    }
}
