package com.sealcia.baitap.BT4.Bai2;

import java.time.LocalDate;

public abstract class GiangVien {
  public static final double LUONG = 90000;
  private String hoTen, hocHam, hocVi;
  private LocalDate ngaySinh, ngayCongTac;

  public abstract double tinhLuong();

  public GiangVien(
      String hoTen, String hocHam, String hocVi, LocalDate ngaySinh, LocalDate ngayCongTac) {
    this.hoTen = hoTen;
    this.hocHam = hocHam;
    this.hocVi = hocVi;
    this.ngaySinh = ngaySinh;
    this.ngayCongTac = ngayCongTac;
  }

  public String getHoTen() {
    return hoTen;
  }

  public void setHoTen(String hoTen) {
    this.hoTen = hoTen;
  }

  public String getHocHam() {
    return hocHam;
  }

  public void setHocHam(String hocHam) {
    this.hocHam = hocHam;
  }

  public String getHocVi() {
    return hocVi;
  }

  public void setHocVi(String hocVi) {
    this.hocVi = hocVi;
  }

  public LocalDate getNgaySinh() {
    return ngaySinh;
  }

  public void setNgaySinh(LocalDate ngaySinh) {
    this.ngaySinh = ngaySinh;
  }

  public LocalDate getNgayCongTac() {
    return ngayCongTac;
  }

  public void setNgayCongTac(LocalDate ngayCongTac) {
    this.ngayCongTac = ngayCongTac;
  }
}
