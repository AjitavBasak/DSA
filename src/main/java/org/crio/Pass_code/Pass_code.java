package org.crio.Pass_code;

import java.util.*;
public class Pass_code{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        String B = sc.nextLine();
        System.out.println(passCode(A,B));
    }
    static String passCode(String A,String B){
        String c="";
        int min=Math.min(B.length(),A.length());
        for(int i=0;i<min;i++){
            c=c+A.charAt(i)+B.charAt(i);
        }
        c=c+A.substring(min);
        c=c+B.substring(min);
        return c;
    }
}
