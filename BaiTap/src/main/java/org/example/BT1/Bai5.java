package org.example.BT1;

import java.util.Scanner;

public class Bai5 {

    private static void initRandomArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = (int) (Math.random() * 100);
            }
        }
    }

    private static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }
    }

    private static int sumOfColumn(int[][] arr, int col) {
        col--;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][col];
        }
        return sum;
    }

    private static int sumOfRow(int[][] arr, int row) {
        row--;
        int sum = 0;
        for (int i = 0; i < arr[0].length; i++) {
            sum += arr[row][i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int row, col;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so hang: ");
        row = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap vao so cot: ");
        col = Integer.parseInt(sc.nextLine());
        int[][] arr = new int[row][col];
        initRandomArray(arr);

        printArray(arr);
        System.out.print("Nhap cot can tinh tong: ");
        int sumCol = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap hang can tinh tong: ");
        int sumRow = Integer.parseInt(sc.nextLine());
        System.out.println("Tong tren cot " + sumCol + ": " + sumOfColumn(arr, sumCol));
        System.out.println("Tong tren hang " + sumRow + ": " + sumOfRow(arr, sumRow));
    }
}
