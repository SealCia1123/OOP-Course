package com.sealcia.baitap.BT4.Bai1;

public class HinhChuNhat extends Hinh {
  private double chieuDai, chieuRong;

  public HinhChuNhat(double chieuDai, double chieuRong) {
    super("chu nhat");
    this.chieuDai = chieuDai;
    this.chieuRong = chieuRong;
  }

  @Override
  public double tinhDienTich() {
    return this.chieuDai * this.chieuRong;
  }

  @Override
  public double tinhChuVi() {
    return 2 * (this.chieuDai + this.chieuRong);
  }
}
