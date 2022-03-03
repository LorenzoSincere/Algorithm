package com.RemoveElement;

/**
 * @author lorenzo
 * @date 2022/03/02 21:43
 **/
public class RemoveElement_twoindex {
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};

        int result = removeElement(nums, 2);
        System.out.println(result);
    }


    public static int removeElement(int[] nums, int val) {
        int size = nums.length;
        int slowIndex = 0;
        for (int fastIndex = 0; fastIndex < size; fastIndex++) {
            if (val != nums[fastIndex]) {
                nums[slowIndex++] = nums[fastIndex];
            }
        }
        return slowIndex;
    }
}
