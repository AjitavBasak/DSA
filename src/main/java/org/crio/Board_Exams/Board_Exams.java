package org.crio.Board_Exams;
import java.util.*;
 class Board_Exams {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String[] arr=new String[n];
        sc.nextLine();
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.next();
        }
        System.out.println(boardExams(n,arr));
    }
    static int boardExams(int n,String[] arr){
        int res=0;
        char a1= arr[0].charAt(0);
        char b1=arr[0].charAt(arr[0].length()-1);
        String s1=""+a1+b1;
        for(int i=1;i<n;i++){
            char a2= arr[i].charAt(0);
            char b2=arr[i].charAt(arr[i].length()-1);
            String s2=""+a2+b2;
            if(s1.equals(s2)){
                res++;
            }
            s1=s2;
        }
        return res;
    }
}
