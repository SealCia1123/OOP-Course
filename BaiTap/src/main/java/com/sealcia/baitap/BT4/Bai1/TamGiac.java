package com.sealcia.baitap.BT4.Bai1;

public class TamGiac extends Hinh {
  private double a, b, c;

  @Override
  public double tinhDienTich() {
    double p = this.tinhChuVi() / 2;
    return Math.sqrt(p * (p - a) * (p - b) * (p - c));
  }

  @Override
  public double tinhChuVi() {
    return this.a + this.b + this.c;
  }

  public TamGiac(double a, double b, double c) {
    super("tam giac");
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
