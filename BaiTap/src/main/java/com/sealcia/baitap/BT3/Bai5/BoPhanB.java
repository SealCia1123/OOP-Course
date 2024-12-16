package com.sealcia.baitap.BT3.Bai5;

public class BoPhanB extends NhanVien {
  @Override
  public String toString() {
    return super.toString() + "Bo phan: B\n";
  }

  @Override
  public double getSalaryRate() {
    return 1.5;
  }

  public BoPhanB(
      String hoTen, String CMND, String SDT, String queQuan, GioiTinh gioiTinh, int soNgayCong) {
    super(hoTen, CMND, SDT, queQuan, gioiTinh, soNgayCong);
  }
}
