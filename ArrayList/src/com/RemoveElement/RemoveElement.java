package com.RemoveElement;

/**
 * @author lorenzo
 * @date 2022/03/02 21:43
 **/
public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};

        int result = removeElement(nums, 2);
        System.out.println(result);
    }


    public static int removeElement(int[] nums, int val) {
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            if (nums[i] == val) {
                for (int j = i + 1; j < size; j++) {
                    nums[j - 1] = nums[j];
                }
                i--;
                size--;
            }
        }
        return size;
    }
}
