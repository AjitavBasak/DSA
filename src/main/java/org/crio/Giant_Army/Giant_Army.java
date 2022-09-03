package org.crio.Giant_Army;

import java.util.*;
class Giant_Army
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int b[]=new int[q];
        for(int i=0;i<q;i++)
        {
            b[i]=sc.nextInt();
        }
        List<Integer>ans=new ArrayList<Integer>();
        ans=giantArmy( a,b,n,q);
        for(int i=0;i<ans.size();i++)
        {
            System.out.println(ans.get(i));
        }
    }
    static List<Integer> giantArmy(int a[],int b[],int n,int q){
        ArrayList<Integer> gA=new ArrayList<Integer>();
        Arrays.sort(a);
        for(int i=0;i<q;i++){
            int count=n;
            int l = 0;
            int r = n - 1;
            while (l <= r) {
                int m = l + (r - l) / 2;
                if (a[m] >= b[i]) {
                    count = m;
                    r = m - 1;
                }
                else
                    l = m + 1;
            }
            count=n-count;
            gA.add(count);
        }
        return gA;
    }
}
