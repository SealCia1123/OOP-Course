package com.sealcia.baitap.BT3.Bai5;

public class BoPhanC extends NhanVien {
  @Override
  public String toString() {
    return super.toString() + " - Bo phan: C";
  }

  @Override
  public double getSalaryRate() {
    return 2.5;
  }

  public BoPhanC(
      String hoTen, String CMND, String SDT, String queQuan, GioiTinh gioiTinh, int soNgayCong) {
    super(hoTen, CMND, SDT, queQuan, gioiTinh, soNgayCong);
  }
}
