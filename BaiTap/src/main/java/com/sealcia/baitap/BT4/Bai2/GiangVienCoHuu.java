package com.sealcia.baitap.BT4.Bai2;

import java.time.LocalDate;

public class GiangVienCoHuu extends GiangVien {
  private double luongCoBan, heSo;

  @Override
  public double tinhLuong() {
    return GiangVien.LUONG * this.luongCoBan * this.heSo;
  }

  public GiangVienCoHuu(
      String hoTen,
      String hocHam,
      String hocVi,
      LocalDate ngaySinh,
      LocalDate ngayCongTac,
      double luongCoBan,
      double heSoLuong) {
    super(hoTen, hocHam, hocVi, ngaySinh, ngayCongTac);
    this.luongCoBan = luongCoBan;
    this.heSo = heSoLuong;
  }

  public double getLuongCoBan() {
    return luongCoBan;
  }

  public void setLuongCoBan(double luongCoBan) {
    this.luongCoBan = luongCoBan;
  }

  public double getHeSo() {
    return heSo;
  }

  public void setHeSo(double heSoLuong) {
    this.heSo = heSoLuong;
  }
}
