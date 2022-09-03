package org.crio.Spiral_Matrix;
import java.io.*;
import java.util.*;
public class Spiral_Matrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        if(matrix.length==0){
            return res;
        }
        int top=0;
        int left=0;
        int right= matrix[0].length-1;
        int bottom=matrix.length-1;
        int i=0,j=0;
        while(top<=bottom && left<=right){
            while(i==top&&j<=right){
                res.add(matrix[i][j]);
                j++;
            }
            top++;
            i++;
            j--;
            if(top>bottom || left >right) break;
            while(i<=bottom &&j==right){
                res.add(matrix[i][j]);
                i++;
            }
            right--;
            j--;
            i--;
            if(top>bottom || left >right) break;
            while(i==bottom && j>=left){
                res.add(matrix[i][j]);
                j--;
            }
            bottom--;
            i--;
            j++;
            if(top>bottom || left >right) break;
            while(i>=top && j==left){
                res.add(matrix[i][j]);
                i--;
            }
            left++;
            j++;
            i++;
        }
        return res;
    }
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        scanner.close();
        List<Integer> result = new Spiral_Matrix().spiralOrder(matrix);
        for (int i = 0; i < result.size(); ++i) {
            System.out.printf("%d ", result.get(i));
        }
    }
}
