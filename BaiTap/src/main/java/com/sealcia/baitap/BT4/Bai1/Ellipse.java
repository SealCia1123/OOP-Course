package com.sealcia.baitap.BT4.Bai1;

public class Ellipse extends Hinh {
  private double trucLon, trucBe;

  @Override
  public double tinhDienTich() {
    return Math.PI * this.trucLon * this.trucBe;
  }

  @Override
  public double tinhChuVi() {
    return 2 * Math.PI * this.trucBe * this.trucLon;
  }

  public Ellipse(String ten, double trucLon, double trucBe) {
    super(ten);
    this.trucLon = trucLon;
    this.trucBe = trucBe;
  }

  public double getTrucLon() {
    return trucLon;
  }

  public void setTrucLon(double trucLon) {
    this.trucLon = trucLon;
  }

  public double getTrucBe() {
    return trucBe;
  }

  public void setTrucBe(double trucBe) {
    this.trucBe = trucBe;
  }
}
