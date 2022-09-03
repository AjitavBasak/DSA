package org.crio.Find_the_duplicate_number;
import java.io.*;
import java.util.*;
public class Find_the_duplicate_number {
    public int findTheDuplicateNumber(int[] nums) {
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            if(!hs.add(nums[i])){
                return nums[i];
            }
        }
        return -1;
    }
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int nums[] = new int[n + 1];
        for(int i = 0 ; i < nums.length ;i++) {
            nums[i] = scanner.nextInt();
        }
        scanner.close();
        int result = new Find_the_duplicate_number().findTheDuplicateNumber(nums);
        System.out.println(result);
    }
}
