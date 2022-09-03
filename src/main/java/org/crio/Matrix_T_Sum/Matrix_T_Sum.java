package org.crio.Matrix_T_Sum;

import java.util.*;
public class Matrix_T_Sum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int matrix[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int tSum = matrixTSum(n, matrix);
        System.out.println(tSum);
    }

    static int matrixTSum(int n, int[][] matrix) {
        int x=0;
        int sum =0;
        if(n%2==0){
            x=n/2 -1;
        }
        else
            x=n/2;
        for(int i=0;i<n;i++){
            if(i==0){
                for(int i1=0;i1<n;i1++){
                    sum+=matrix[0][i1];
                }
            }
            else{
                sum+=matrix[i][x];
            }
        }
        return sum;
    }
}
