package org.example.BT1;

import java.util.stream.IntStream;

public class Bai5 {

    public static int[][] initRandomArray(int row, int col) {
        int arr[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = (int) (Math.random() * 100);
            }
        }
        return arr;
    }

    public static void printArray(int[][] arr) {
        for (int[] i : arr) {
            for (int j : i) {
                System.out.printf("%d\t", i[j]);
            }
            System.out.println();
        }
    }

    public static int sumOfColumn(int[][] arr, int col) {
        col--;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][col];
        }
        return sum;
    }

    public static int sumOfRow(int[][] arr, int row) {
        row--;
        int sum = 0;
        for (int i = 0; i < arr[0].length; i++) {
            sum += arr[row][i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(IntStream.of(arr).filter(x -> x > 0).sum());
    }
}
