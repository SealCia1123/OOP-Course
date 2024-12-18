package com.sealcia.baitap.BT4.Bai1;

public abstract class Hinh {
  private String ten;

  @Override
  public String toString() {
    return String.format(
        "%s - Dien tich: %1.f - Chu vi: %.1f",
        this.getTen(), this.tinhDienTich(), this.tinhChuVi());
  }

  public abstract double tinhDienTich();

  public abstract double tinhChuVi();

  public Hinh(String ten) {
    this.ten = ten;
  }

  public String getTen() {
    return ten;
  }

  public void setTen(String ten) {
    this.ten = ten;
  }
}
