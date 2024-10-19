package org.example.BT1;

public class Bai4 {
    private static boolean isPrime(int x) {
        if (x < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0)
                return false;
        }
        return true;
    }

    private static int sumOfPrimeNumber(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            if (isPrime(i)) {
                sum += i;
            }

        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // Cau a
        System.out.println(sumOfPrimeNumber(arr));
        // Cau b
    }
}
