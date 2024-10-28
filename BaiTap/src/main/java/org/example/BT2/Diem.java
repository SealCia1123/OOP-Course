package org.example.BT2;

import java.util.Scanner;

public class Diem {
    private double x, y;

    public static void main(String[] args) {
        Diem a = Diem.createDiem();
        Diem b = Diem.createDiem();

        System.out.println("Diem a: " + a.toString());
        System.out.println("Diem b: " + b.toString());
        System.out.printf("Khoang cach giua hai diem: %.2f\n", a.calculateDistance(b));
    }

    @Override
    public String toString() {
        return "(" + this.getX() + ", " + this.getY() + ")";
    }

    public double calculateDistance(Diem point) {
        return Math.sqrt(Math.pow(this.getX() - point.getX(), 2) + Math.pow(this.getY() - point.getY(), 2));
    }

    public static Diem createDiem() {
        Scanner sc = new Scanner(System.in);
        double x, y;
        System.out.print("Nhap hoanh do: ");
        x = Double.parseDouble(sc.nextLine());
        System.out.print("Nhap tung do: ");
        y = Double.parseDouble(sc.nextLine());
        Diem point = new Diem(x, y);
        return point;
    }

    public Diem(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
