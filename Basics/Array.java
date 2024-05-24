package Basics;
import java.util.*;

public class Array {
    public static void main(String[] args) {
        int[] array = new int[5];
        for(int i = 0; i < array.length; i++){
            array[i] = i + 1;
        }
        System.out.println(Arrays.toString(array));

        int[] arr = {1, 2, 3, 4, 5};
        for(int n : arr){
            System.out.println("Array: " + n);
        }
        
        // int[][] mat = new int[2][3];
        int[][] mat = {{1, 2}, {3, 4, 5}};
        for(int i = 0; i<mat.length;i++){
            for(int j = 0; j <mat[i].length;j++){
                System.out.println("2D Array: " + mat[i][j]);
            }
        }
    }
}
