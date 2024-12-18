package com.sealcia.baitap.BT4.Bai1;

public class TamGiac extends Hinh {
  private double a, b, c;

  @Override
  public double tinhDienTich() {
    double p = this.tinhChuVi();
    return Math.sqrt(p * (p - this.a) * (p - this.b) * (p - this.c));
  }

  @Override
  public double tinhChuVi() {
    return a + b + c;
  }

  public TamGiac(String ten, double a, double b, double c) {
    super(ten);
    this.a = a;
    this.b = b;
    this.c = c;
  }

  public double getA() {
    return a;
  }

  public void setA(double a) {
    this.a = a;
  }

  public double getB() {
    return b;
  }

  public void setB(double b) {
    this.b = b;
  }

  public double getC() {
    return c;
  }

  public void setC(double c) {
    this.c = c;
  }
}
