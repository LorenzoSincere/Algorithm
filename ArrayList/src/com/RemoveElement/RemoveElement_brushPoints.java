package com.RemoveElement;

/**
 * @author lorenzo
 * @date 2022/03/02 21:43
 **/
public class RemoveElement_brushPoints {
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};

        int result = removeElement(nums, 2);
        System.out.println(result);
    }


    public static int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == val) {
                continue;
            } else {
                nums[count] = nums[i];
            }
            count++;
        }
        return count;
    }
}
