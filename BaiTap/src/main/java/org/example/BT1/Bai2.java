package org.example.BT1;

import java.util.Map;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap he so: ");
        int x = Integer.parseInt(sc.nextLine());
        int result = 0;
        for (int i = 0; i < n + 1; i++) {
            System.out.print("Nhap vao ");
            int a = Integer.parseInt(sc.nextLine());
            result += (int) (a * Math.pow(x, i));
        }
        System.out.println("Ket qua: " + result);
    }
}
