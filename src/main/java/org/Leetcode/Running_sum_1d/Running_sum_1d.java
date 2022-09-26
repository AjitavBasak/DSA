package org.Leetcode.Running_sum_1d;

public class Running_sum_1d {
    public int[] runningSum(int[] nums) {
        for(int i=1;i<nums.length;i++){
            nums[i]=nums[i-1]+nums[i];
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        Running_sum_1d running_sum_1d=new Running_sum_1d();
        running_sum_1d.runningSum(arr);
        for (int a : arr)
        System.out.println(a);
    }
}