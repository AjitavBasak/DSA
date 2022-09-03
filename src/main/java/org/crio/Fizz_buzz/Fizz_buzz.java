package org.crio.Fizz_buzz;

import java.util.*;
class Fizz_Buzz {
    public static String [] fizzBuzz(int n)
    {
        String[] res=new String[n];
        for(int i=1;i<=n;i++){
            if(i%3==0){
                if(i%5==0){
                    res[i-1]="FizzBuzz";
                }else{
                    res[i-1]="Fizz";
                }
            }
            else if(i%5==0){
                res[i-1]="Buzz";
            }
            else{
                res[i-1]=Integer.toString(i);
            }
        }
        return res;
    }
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String [] ans=fizzBuzz(n);
        for(int i=0;i<ans.length;i++)
        {
            System.out.println(ans[i]);
        }
    }
}
