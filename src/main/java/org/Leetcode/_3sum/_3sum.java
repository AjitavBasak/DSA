package org.Leetcode._3sum;

import java.util.*;

public class _3sum {

    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        if (nums == null || nums.length < 3)
            return new ArrayList<>(result);
        Arrays.sort(nums);
        for (int i = 0; i <  nums.length - 2; i++)
        {
            int left =i+1;
            int right = nums.length-1;


            while (left < right)
            {
                int sum =  nums[i] + nums[left] + nums[right];
                if (sum == 0)
                {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                }
                else if (sum < 0)
                    left++;
                else
                    right--;
            }
        }
        return new ArrayList<>(result);
    }

    public static void main(String[] args) {
        int []nums = {-1,0,1,2,-1,-4};
        System.out.println(new _3sum().threeSum(nums));
    }
}