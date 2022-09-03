package org.crio.School_Admission;
import java.util.*;
public class School_Admission{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        System.out.println(schoolAdmission(s));
    }
    static String schoolAdmission(String s){
        String[] resA=new String[9];
        int start=0;
        for(int i=0;i<s.length();i++){
            int t=s.charAt(i);
            if(t>=49&&t<=57){
                resA[s.charAt(i)-49]=s.substring(start,i);
                start=i+1;
            }
        }
        String str="";
        for(int i=0;i<9;i++){
            if(resA[i]==null){break;}
            str=str+resA[i]+" ";
        }
        return str;
    }
}
