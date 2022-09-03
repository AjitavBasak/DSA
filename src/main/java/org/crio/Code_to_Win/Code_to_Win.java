package org.crio.Code_to_Win;
import java.util.*;
class Code_to_Win{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        int k=sc.nextInt();
        System.out.println(codeToWin(arr,k,n,m));
    }
    static int codeToWin(int[][] arr, int k,int n,int m){
        int r = arr.length, c = arr[0].length;
        HashSet<Integer> values = new HashSet<Integer>();
        int max_sum = 0;
        for(int i=0; i<=r-k; i++) {
            for(int j=0; j<=c-k; j++) {
                int sum = 0;
                HashSet<Integer> s = new HashSet<>();
                for(int nr = i; nr<i+k; nr++) {
                    for(int nc = j; nc<j+k; nc++) {
                        sum += arr[nr][nc];
                        s.add(arr[nr][nc]);
                    }
                }
                if(sum > max_sum) {
                    max_sum  = sum;
                    values = s;
                } else if(sum == max_sum) {
                    values.addAll(s);
                }
            }
        }
        int sum = 0;
        for(int e: values) {
            sum += e;
        }
        return sum;
    }
}
