package com.BinarySearch;

/**
 * @author lorenzo
 * @date 2022/02/28 22:04
 **/
public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int result = search(nums, 9);
        System.out.println(result);
    }


    public static int search(int[] nums, int target) {

        if ( target < nums[0] || target > nums[nums.length - 1]) {
            return -1;
        }

        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + ((right - left) / 2);

            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] < target) {
                left = mid + 1;
            }
            if (nums[mid] > target) {
                right = mid - 1;
            }
        }
        return -1;
    }
}
