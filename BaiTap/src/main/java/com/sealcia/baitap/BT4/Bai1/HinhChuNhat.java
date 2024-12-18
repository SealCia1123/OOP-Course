package com.sealcia.baitap.BT4.Bai1;

public class HinhChuNhat extends Hinh {
  private double chieuDai, chieuRong;

  @Override
  public double tinhDienTich() {
    return this.chieuDai * this.chieuRong;
  }

  @Override
  public double tinhChuVi() {
    return 2 * (this.chieuDai + this.chieuRong);
  }

  public HinhChuNhat(String ten, double chieuDai, double chieuRong) {
    super(ten);
    this.chieuDai = chieuDai;
    this.chieuRong = chieuRong;
  }

  public double getChieuDai() {
    return chieuDai;
  }

  public void setChieuDai(double chieuDai) {
    this.chieuDai = chieuDai;
  }

  public double getChieuRong() {
    return chieuRong;
  }

  public void setChieuRong(double chieuRong) {
    this.chieuRong = chieuRong;
  }
}
