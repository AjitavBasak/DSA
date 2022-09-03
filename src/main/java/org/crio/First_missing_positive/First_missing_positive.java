package org.crio.First_missing_positive;
import java.util.*;
public class First_missing_positive {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int max =1;
        if(nums.length==0 ||nums[nums.length-1]<=1){
            return 1;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]<max){
                continue;
            }
            if(nums[i]!=max){
                return max;
            }else{
                max++;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for(int i = 0 ; i < n ; ++i) {
            nums[i] = in.nextInt();
        }
        int result = new First_missing_positive().firstMissingPositive(nums);
        System.out.println(result);
    }
}
