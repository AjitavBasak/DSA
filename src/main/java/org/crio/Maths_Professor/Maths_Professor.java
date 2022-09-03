package org.crio.Maths_Professor;

import java.util.*;
public class Maths_Professor{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String B=sc.nextLine();
        String a[]=new String[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextLine();
        }
        int[] res=mathProfessor(n,B,a);;
        for(int i:res)
            System.out.print(i+" ");

    }

    static int[] mathProfessor(int n,String B,String[] a){
        int [] res = new int[n];
        for(int i=0;i<n;i++){
            int count=0;
            Set<Character> s=new HashSet<Character>();
            for(int j=0;j<a[i].length();j++){
                if(s.add(a[i].charAt(j))){
                    if(B.contains(Character.toString(a[i].charAt(j)))){
                        count++;
                    }
                }
            }
            res[i]=count;
        }
        return res;
    }
}
