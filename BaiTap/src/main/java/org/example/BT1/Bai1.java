package org.example.BT1;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 100) + 1;
        int userNumber;
        Scanner sc = new Scanner(System.in);
        System.out.print("Du doan so ngau nhien (1-100): ");
        userNumber = sc.nextInt();
        System.out.println("So ngau nhien: " + randomNumber);
        while (userNumber != randomNumber) {
            if (userNumber > randomNumber) {
                System.out.println("So ban da chon: " + userNumber + "-> So ban doan lon hon");
                System.out.print("Moi ban du doan lai: ");
                userNumber = sc.nextInt();
            } else {
                System.out.println("So ban da chon: " + userNumber + "-> So ban doan nho hon");
                System.out.print("Moi ban du doan lai: ");
                userNumber = sc.nextInt();
            }
        }
        System.out.println("So ban da chon: " + userNumber + " -> Ban da doan dung");
    }
}
