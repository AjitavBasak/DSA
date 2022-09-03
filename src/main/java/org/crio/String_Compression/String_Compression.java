package org.crio.String_Compression;

import java.io.*;
import java.util.*;
public class  String_Compression {
    public static String compress(String s) {
        StringBuffer sb = new StringBuffer();
        int count =1;
        char prev = s.charAt(0);
        for(int i=1;i<s.length();i++){
            char curr =s.charAt(i);
            if(prev==curr){
                count++;
            }else{
                sb.append(prev);
                sb.append(count);
                prev = curr;
                count=1;
            }
        }
        sb.append(prev);
        sb.append(count);
        if(s.length()<=sb.length()){
            return s;
        }else{
            return sb.toString();
        }
    }
    public static void  main (String args []) {
        Scanner sc =  new  Scanner (System.in);
        String s = new String();
        s = sc.next();
        int n = s.length();
        String ans = compress(s);
        System.out.print(ans);
    }
}

