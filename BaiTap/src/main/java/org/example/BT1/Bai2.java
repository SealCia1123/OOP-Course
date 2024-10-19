package org.example.BT1;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào n: ");
        n = sc.nextInt();
        int[] arr = new int[n + 1];
        System.out.print("Nhập vào mang: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Nhập vào x: ");
        int x = sc.nextInt();

        // [2, 3, 1] = 1x^2 + 3x^1 + 2x^0
        // [2, 5, 1, 7] = 7x^3 + 1x^2 + 5x^1 + 2x^0
        int count = n;
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result += (int) (arr[i] * Math.pow(x, n - count));
            count--;
        }
        System.out.printf("f(%d) = %d\n", x, result);
    }
}
