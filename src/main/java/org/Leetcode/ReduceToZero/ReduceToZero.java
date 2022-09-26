package org.Leetcode.ReduceToZero;

public class ReduceToZero {
    public int numberOfSteps(int num) {
        int res=0;
        while(num!=0){
            if(num%2==0){
                num=num/2;
            }else{
                num-=1;
            }
            res++;

        }

        return res;

    }

    public static void main(String[] args) {
        ReduceToZero reduceToZero=new ReduceToZero();
        System.out.println(reduceToZero.numberOfSteps(299));
        System.out.println(reduceToZero.numberOfSteps(4));
    }
}