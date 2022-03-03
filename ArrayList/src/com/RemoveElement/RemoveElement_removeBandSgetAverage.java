package com.RemoveElement;

/**
 * @author lorenzo
 * @date 2022/03/02 21:43
 **/
public class RemoveElement_removeBandSgetAverage {
    public static void main(String[] args) {
        int[] nums = {4000,3000,1000,2000};

        double result = average(nums);
        System.out.println(result);
    }


    public static double average(int[] salary) {
        //将最大的值放到salary[n-1]处，最小的值放到salary[0]处
        int size = salary.length;
        int min_Ptr = 0;
        int max_Ptr = size-1;
        double sum = 0.0;
        for(int i = 0; i <= size-1 ; ++i) {
            if(salary[i] <= salary[min_Ptr]) {
                min_Ptr = i;
            }
            if(salary[i] >= salary[max_Ptr]) {
                max_Ptr = i;
            }
            sum += salary[i];
        }
        return (sum - salary[min_Ptr] - salary[max_Ptr]) / (size-2);
    }
}
