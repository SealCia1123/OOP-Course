package com.sealcia.baitap.BT4.Bai1;

public abstract class Hinh {
  private String ten;

  public abstract double tinhDienTich();

  public abstract double tinhChuVi();

  @Override
  public String toString() {
    return String.format(
        "Hinh %s\nDien tich: %.1f\nChu vi: %.1f", this.ten, this.tinhDienTich(), this.tinhChuVi());
  }

  public Hinh(String name) {
    this.ten = name;
  }

  public String getTen() {
    return ten;
  }

  public void setTen(String name) {
    this.ten = name;
  }
}
