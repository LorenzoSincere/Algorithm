package com.BinarySearch;

import java.util.Arrays;

/**
 * @author lorenzo
 * @date 2022/03/01 21:14
 **/
public class BinarySearchTest_34_middle {
    public static void main(String[] args) {
        int[] numsTextFir = {5, 7, 7, 8, 8, 10};
        int[] numsTextSec = {5, 7, 7, 8, 8, 10};

        int[] resultFir = searchRange(numsTextFir, 8);
        int[] resultSec = searchRange(numsTextSec, 2);
        System.out.println(Arrays.toString(resultFir));
        System.out.println(Arrays.toString(resultSec));
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] res = new int[] {-1, -1};
        res[0] = binarySearch(nums, target, true);
        res[1] = binarySearch(nums, target, false);
        return res;
    }
    public static int binarySearch(int[] nums, int target, boolean leftOrRight) {
        int res = -1;
        int left = 0, right = nums.length - 1, mid;
        while(left <= right) {
            mid = left + (right - left) / 2;
            if(target < nums[mid]) {
                right = mid - 1;
            } else if(target > nums[mid]) {
                left = mid + 1;
            } else {
                res = mid;
                if(leftOrRight){
                    right = mid - 1;}
                else{
                    left = mid + 1;}
            }
        }
        return res;
    }
}




