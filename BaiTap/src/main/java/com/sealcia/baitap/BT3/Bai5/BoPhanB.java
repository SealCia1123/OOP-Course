package com.sealcia.baitap.BT3.Bai5;

public class BoPhanB extends NhanVien {
  @Override
  public void hienThi() {
    super.hienThi();
    System.out.println("Bo phan: A");
  }

  @Override
  public double tinhLuong() {
    return 1.5 * NhanVien.luong * this.soNgayCong;
  }

  public BoPhanB(
      String hoTen, String CMND, String SDT, String queQuan, GioiTinh gioiTinh, int soNgayCong) {
    super(hoTen, CMND, SDT, queQuan, gioiTinh, soNgayCong);
  }
}
