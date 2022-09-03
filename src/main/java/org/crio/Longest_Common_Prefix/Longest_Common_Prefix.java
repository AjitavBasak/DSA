package org.crio.Longest_Common_Prefix;

import java.io.*;
public class Longest_Common_Prefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0){
            return "";
        }
        String s=strs[0];
        int i=0;
        while(i<strs.length && !(s.isEmpty())){
            if(!(strs[i].startsWith(s))){
                while(!(s.isEmpty()) && !(strs[i].startsWith(s))){
                    s=s.substring(0,s.length()-1);
                }
            }
            i++;
        }

        return s;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = in.readLine().split(" ");
        String prefixString = new Longest_Common_Prefix().longestCommonPrefix(strings);
        System.out.print(prefixString);
    }
}
