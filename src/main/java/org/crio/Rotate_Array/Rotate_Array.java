package org.crio.Rotate_Array;

import java.util.*;
public class Rotate_Array {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        for(int i=0;i<n;i++){
            numbers.add(sc.nextInt());
        }
        ArrayList<Integer> ans = rotateArray(numbers,k);
        for(Integer x:ans){
            System.out.print(x+" ");
        }
    }
    static void reverse(ArrayList<Integer> numbers, int start , int end){
        while(start<end){
            int temp = numbers.get(start);
            numbers.add(start, numbers.get(end));
            numbers.remove(start+1);
            numbers.add(end,temp);
            numbers.remove(end+1);
            start++;
            end--;
        }
    }
    static ArrayList<Integer> rotateArray(ArrayList<Integer> numbers,int k){
        //Collections.rotate(numbers,k);
        k = k % numbers.size();
        for(int i=0;i<k;i++){
            numbers.add(0,numbers.get(numbers.size()-1));
            numbers.remove(numbers.size());
        }
        //reverse(numbers , 0 , numbers.size()-1);
        //reverse(numbers , 0 , k-1);
        //reverse(numbers , k , numbers.size() -1);
        return numbers;
    }
}
