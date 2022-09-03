package org.crio.Class_Representative;
import java.util.*;

public class Class_Representative {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] num=new int[n];
        for(int i=0;i<n;i++)
        {
            num[i]=sc.nextInt();
        }
        System.out.println(classRepresentative(num,n));
    }

    static String classRepresentative(int[] num,int n){
        int flag =0;
        for(int i=2;i<n;i+=2){
            if(!(num[i]>num[i-2])){
                if(flag==1){
                    flag=0;
                    break;
                }
                flag=2;
            }
            else if(!(num[i]<num[i-2])){
                if(flag==2){
                    flag=0;
                    break;
                }
                flag=1;
            }
        }
        if(flag==1){
            return "increasing";
        }
        else if(flag==2){
            return "decreasing" ;
        }
        return "none";
    }
}


