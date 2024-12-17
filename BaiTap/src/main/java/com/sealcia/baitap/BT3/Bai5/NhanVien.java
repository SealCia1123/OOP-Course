package com.sealcia.baitap.BT3.Bai5;

enum GioiTinh {
  NAM,
  NU
}

public class NhanVien {
  public static final int LUONG = 100000;
  private static int count = 1;
  private int id = count++;
  private String hoTen, CMND, SDT, queQuan;
  private GioiTinh gioiTinh;
  private int soNgayCong;

  @Override
  public String toString() {
    return String.format(
        "Ho ten: %s - CMND: %s - Gioi tinh: %s - Que quan: %s - SDT: %s",
        this.hoTen, this.CMND, this.gioiTinh, this.queQuan, this.SDT);
  }

  public double tinhLuong() {
    return this.getSalaryRate() * NhanVien.LUONG * this.soNgayCong;
  }

  public double getSalaryRate() {
    return 1;
  }

  public NhanVien(
      String hoTen, String CMND, String SDT, String queQuan, GioiTinh gioiTinh, int soNgayCong) {
    this.hoTen = hoTen;
    this.CMND = CMND;
    this.SDT = SDT;
    this.queQuan = queQuan;
    this.gioiTinh = gioiTinh;
    this.soNgayCong = soNgayCong;
  }

  public int getSoNgayCong() {
    return soNgayCong;
  }

  public void setSoNgayCong(int soNgayCong) {
    this.soNgayCong = soNgayCong;
  }

  public int getId() {
    return id;
  }

  public String getHoTen() {
    return hoTen;
  }

  public void setHoTen(String hoTen) {
    this.hoTen = hoTen;
  }

  public String getCMND() {
    return CMND;
  }

  public void setCMND(String CMND) {
    this.CMND = CMND;
  }

  public String getSDT() {
    return SDT;
  }

  public void setSDT(String SDT) {
    this.SDT = SDT;
  }

  public GioiTinh getGioiTinh() {
    return gioiTinh;
  }

  public void setGioiTinh(GioiTinh gioiTinh) {
    this.gioiTinh = gioiTinh;
  }

  public static int getLuong() {
    return LUONG;
  }

  public static int getCount() {
    return count;
  }

  public String getQueQuan() {
    return queQuan;
  }

  public static void setCount(int count) {
    NhanVien.count = count;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setQueQuan(String queQuan) {
    this.queQuan = queQuan;
  }
}
