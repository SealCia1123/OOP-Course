package org.example.BT1;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opt = -1;
        while (opt != 0) {
            System.out.println("1. Nhap dia chi email, in ra dia chi user");
            System.out.println("2. Nhap vao chuoi va in so luong ky tu in hoa");
            System.out.println("3. ");
        }
        String userEmail = sc.nextLine();
        String userAddress = userEmail.substring(0, userEmail.indexOf("@"));
        System.out.println(userAddress);
    }
}
