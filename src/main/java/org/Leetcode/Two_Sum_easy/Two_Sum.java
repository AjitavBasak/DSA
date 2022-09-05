package org.Leetcode.Two_Sum_easy;
import java.util.HashMap;
import java.util.Scanner;

public class Two_Sum {
        public int[] twoSum(int[] nums, int target) {
            int [] res = new int[2];
            HashMap<Integer,Integer> numMap=new HashMap<>();
            for(int i=0;i<nums.length;i++){
                if(numMap.containsKey(target - nums[i])){
                    res[0]=numMap.get(target - nums[i]);
                    res[1]=i;
                    break;
                }else{
                    numMap.put(nums[i],i);
                }
            }
            return res;
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int [] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        System.out.println(new Two_Sum().twoSum(nums,target));
    }
}
