package org.crio.Valid_Palindrome;

import java.io.*;
public class Valid_Palindrome {
    // Implement your solution by completing the below function
    public String isPalindrome(String s) {
        s=s.toLowerCase();
        int l=0;
        int r=s.length()-1;
        while(l<r){
            if(s.charAt(l)>122||s.charAt(l)<97){
                l++;
                continue;
            }
            if(s.charAt(r)>122||s.charAt(r)<97){
                r--;
                continue;
            }
            if(s.charAt(l)!=s.charAt(r)){
                return "false";
            }
            l++;
            r--;
        }
        return "true";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line = in.readLine();

        String result = new Valid_Palindrome().isPalindrome(line);
        System.out.print(result);
    }
}
