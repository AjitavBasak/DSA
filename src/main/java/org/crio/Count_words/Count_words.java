package org.crio.Count_words;

import java.util.*;
public class Count_words {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String sentence=sc.nextLine();
        int n=sc.nextInt();
        String[] words=new String[n];
        sc.nextLine();
        for(int i=0;i<n;i++)
        {
            words[i]=sc.next();
        }
        System.out.println(countWords(sentence, n, words));
    }

    static int countWords(String sentence,int n,String[] words){
        int res =0;
        if(sentence.length()==0){
            return 0;
        }
        HashSet<String> se = new HashSet<String>();
        for(int i=0;i<n;i++){
            if(sentence.contains(words[i])){
                if(se.add(words[i]))
                    res++;

            }
        }
        return res;
    }
}
