package com.tearsmart.nk;

/**
 * @author 刘彦磊
 * @date 2020/10/30
 */
public class BinarySearchJ26 {

    public int minNumberInRotateArray(int[] rotateArray) {
        if (rotateArray == null) {
            return 0;
        }

        int low = 0;
        int high = rotateArray.length - 1;
        int mid = 0;

        while (low < high) {
            // 子数组是非递减的数组，10111
            if (rotateArray[low] < rotateArray[high]) {
                return rotateArray[low];
            }
            mid = low + (high - low) / 2;
            if (rotateArray[mid] > rotateArray[low]) {
                low = mid + 1;
            } else if (rotateArray[mid] < rotateArray[high]) {
                high = mid;
            } else {
                low++;
            }
        }
        return rotateArray[low];
    }
}
