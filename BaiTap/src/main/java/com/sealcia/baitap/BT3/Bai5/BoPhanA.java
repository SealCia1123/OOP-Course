package com.sealcia.baitap.BT3.Bai5;

public class BoPhanA extends NhanVien {
  @Override
  public String toString() {
    return super.toString() + " - Bo phan: A";
  }

  @Override
  public double getSalaryRate() {
    return 1.2;
  }

  public BoPhanA(
      String hoTen, String CMND, String SDT, String queQuan, GioiTinh gioiTinh, int soNgayCong) {
    super(hoTen, CMND, SDT, queQuan, gioiTinh, soNgayCong);
  }
}
