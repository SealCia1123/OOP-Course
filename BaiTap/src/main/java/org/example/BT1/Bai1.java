package org.example.BT1;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 100) + 1;
        int userNumber;
        Scanner sc = new Scanner(System.in);
        System.out.print("Dự đoán số ngẫu nhiên (1-100): ");
        userNumber = sc.nextInt();
        System.out.println("Số ngẫu nhiên: " + randomNumber);
        while (userNumber != randomNumber) {
            if (userNumber > randomNumber) {
                System.out.println("Số bạn đã chọn: " + userNumber + "-> Số bạn đoán lớn hơn");
                System.out.print("Mời bạn đoán lại: ");
                userNumber = sc.nextInt();
            } else {
                System.out.println("Số bạn đã chọn: " + userNumber + "-> Số bạn đoán nhỏ hơn");
                System.out.print("Mời bạn đoán lại: ");
                userNumber = sc.nextInt();
            }
        }
        System.out.println("Số bạn đã chọn: " + userNumber + " -> Bạn đã đoán đúng");
    }
}
