package org.crio.Tesla;

import java.util.*;
class Tesla{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] diffs=new int[n];
        for(int i=0;i<n;i++)
        {
            diffs[i]=sc.nextInt();
        }
        int[] ans=tesla(n,diffs);
        System.out.println(ans[0]+" "+ans[1]);
    }

    static int[] tesla(int n,int[] diffs){
        int[] res=new int[2];
        int intSpeed=1500;
        int max=1500;
        for(int i=0;i<n;i++){
            intSpeed+=diffs[i];
            if(intSpeed>max){
                max=intSpeed;
            }
        }
        res[0]=max;
        res[1]=intSpeed;
        return res;
    }
}
