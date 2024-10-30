package org.example.BT2;

import java.util.Scanner;

import javax.swing.text.DefaultStyledDocument.ElementSpec;

public class HinhTron {
    private Diem centerPoint;
    private double radius;
    public static final double PI = 3.1415;

    public static void main(String[] args) {
        HinhTron c = new HinhTron(new Diem(1, 2), 10);
        Diem p = new Diem(2, 3);
        System.out.println("Dien tich: " + c.calculateArea());
        System.out.println("Chu vi: " + c.calculatePerimeter());
        System.out.println("Vi tri cua diem so voi duong tron: " + c.locationPointCircle(p));
    }

    public double calculateArea() {
        return PI * this.getRadius() * this.getRadius();
    }

    /**
     * @param p: Point to check location with the Circle
     * @return 0: Point is ON the Circle, 1: Point is INSIDE the Circle, -1: Point
     * is OUTSIDE the Circle
     */
    public int locationPointCircle(Diem p) {
        double distance = this.getCenterPoint().calculateDistance(p);
        if (distance == this.getRadius()) {
            return 0;
        } else if (distance < this.getRadius()) {
            return 1;
        } else {
            return -1;
        }
    }

//    public int locationCircleCircle(HinhTron c) {
//        double distance = this.getCenterPoint().calculateDistance(c.getCenterPoint());
//        if (distance == 0) {
//            return 0;
//        }
//    }

    public double calculatePerimeter() {
        return 2 * PI * this.getRadius();
    }

    public HinhTron(Diem centerPoint, double radius) {
        this.centerPoint = centerPoint;
        this.radius = radius;
    }

    public Diem getCenterPoint() {
        return centerPoint;
    }

    public void setCenterPoint(Diem centerPoint) {
        this.centerPoint = centerPoint;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
