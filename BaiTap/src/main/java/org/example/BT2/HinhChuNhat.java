package org.example.BT2;

import java.util.Scanner;

public class HinhChuNhat {
    private Diem topLeft, bottomRight;

    public static void main(String[] args) {
        HinhChuNhat rectangle = new HinhChuNhat(Diem.createDiem(), Diem.createDiem());
        rectangle.printInfo();
    }

    public double calculateArea() {
        Diem topRight = new Diem(bottomRight.getX(), topLeft.getY());
        return topRight.calculateDistance(topLeft) * topRight.calculateDistance(bottomRight);
    }

    public double calculatePerimeter() {
        Diem topRight = new Diem(bottomRight.getX(), topLeft.getY());
        return (topRight.calculateDistance(topLeft) + topRight.calculateDistance(bottomRight)) * 2;
    }

    public void printInfo() {
        System.out.println("Diem tren trai: " + this.getTopLeft().toString());
        System.out.println("Diem duoi phai: " + this.getBottomRight().toString());
        System.out.println("Dien tich: " + this.calculateArea());
        System.out.println("Chu vi: " + this.calculatePerimeter());
    }

    public HinhChuNhat(Diem topLeft, Diem bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public Diem getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(Diem topLeft) {
        this.topLeft = topLeft;
    }

    public Diem getBottomRight() {
        return bottomRight;
    }

    public void setBottomRight(Diem bottomRight) {
        this.bottomRight = bottomRight;
    }
}
