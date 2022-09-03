package org.crio.Secret_Agent;
import java.util.*;
public class secret_Agent {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        System.out.println(secretAgentII(s));
    }

    static String secretAgentII(String s){
        String[] sA=s.split(" ");
        String res="";
        for(int i=0;i<sA.length;i++){
            if(sA[i].length()%2==1){
                sA[i]=reverseString(sA[i]);
            }
            res+=" "+sA[i];
        }
        return res.trim();
    }
    static String reverseString(String str){
        char ch[]=str.toCharArray();
        String rev="";
        for(int i=ch.length-1;i>=0;i--){
            rev+=ch[i];
        }
        return rev;
    }
}
