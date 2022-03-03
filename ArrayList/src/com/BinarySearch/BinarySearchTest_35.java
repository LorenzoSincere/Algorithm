package com.BinarySearch;

/**
 * @author lorenzo
 * @date 2022/02/28 22:26
 **/
public class BinarySearchTest_35 {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};

        int result = searchInsert(nums, 5);
        System.out.println(result);
    }

    public static int searchInsert(int[] nums, int target) {

        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (left + right) / 2;

            if (target == nums[mid]) {
                return mid;
            } else if (target < nums[mid]) {
                right = mid - 1;
            }else if (target > nums[mid]) {
                left = mid + 1;
            }
        }
        return left;
    }
}
