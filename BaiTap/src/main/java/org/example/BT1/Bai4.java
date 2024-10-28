package org.example.BT1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

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

    private static int[] sortPrimeArr(int[] arr) {
        int[] newArr = Arrays.copyOf(arr, arr.length);
        int count = 0;
        for (int i : newArr) {
            if (isPrime(i))
                count++;
        }
        int[] primeArr = new int[count];
        int[] posArr = new int[count];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) {
                primeArr[index] = arr[i];
                posArr[index++] = i;
            }
        }

        for (int i = 0; i < primeArr.length - 1; i++) {
            for (int j = i + 1; j < primeArr.length; j++) {
                if (primeArr[i] > primeArr[j]) {
                    // swap(arr, i, j);
                    int temp = primeArr[i];
                    primeArr[i] = primeArr[j];
                    primeArr[j] = temp;
                }
            }
        }

        for (int i = 0; i < primeArr.length; i++) {
            newArr[posArr[i]] = primeArr[i];
        }
        return newArr;
    }

    private static void findMinNegativeNumber(int[] arr) {
        int min = 999999999;
        for (int i : arr) {
            if (i < 0 && i < min)
                min = i;
        }
        if (min == 999999999)
            System.out.println("*");
        else
            System.out.println("Min: " + min);
    }

    private static void findMaxPositiveNumber(int[] arr) {
        int max = -999999999;
        for (int i : arr) {
            if (i > 0 && i > max)
                max = i;
        }
        if (max == -999999999)
            System.out.println("*");
        else
            System.out.println("Max: " + max);
    }

    private static void findMinPrimeNumber(int[] arr) {
        int min = 99999999;
        for (int i : arr) {
            if (isPrime(i) && i < min)
                min = i;
        }
        if (min == 99999999)
            System.out.println("*");
        else
            System.out.println("Số nguyên tố nhỏ nhất: " + min);
    }

    public static void main(String[] args) {
        int[] arr = {3, 66, 99, 11, 2, 4, 7};
        // Cau a
        System.out.println("Tong cac so nguyen to: " + IntStream.of(arr).filter(x -> isPrime(x)).sum());

        // Cau b
        System.out.println("Min: " + IntStream.of(arr).filter(x -> x < 0).min().orElse(-9999999));
        System.out.println("Max: " + IntStream.of(arr).filter(x -> x > 0).max().orElse(999999));
//        findMinNegativeNumber(arr);
//        findMaxPositiveNumber(arr);

        // Cau c
        System.out.println("So nguyen to nho nhat: " + IntStream.of(arr).filter(x -> isPrime(x)).min().orElse(-9999999));
//        findMinPrimeNumber(arr);

        // Cau d
        int[] b = sortPrimeArr(arr);
        System.out.println();
        for (int i : b) {
            System.out.printf("%d ", i);
        }
        System.out.println();

        // Cau e
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so can tim: ");
        int x = Integer.parseInt(sc.nextLine());
        int result = Arrays.binarySearch(arr, x);
        System.out.println(result);
    }
}
