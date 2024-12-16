package com.sealcia.baitap.BT3.Bai5;

public class BoPhanC extends NhanVien {
  @Override
  public void hienThi() {
    super.hienThi();
    System.out.println("Bo phan: A");
  }

  @Override
  public double tinhLuong() {
    return 2.5 * NhanVien.luong * this.soNgayCong;
  }

  public BoPhanC(
      String hoTen, String CMND, String SDT, String queQuan, GioiTinh gioiTinh, int soNgayCong) {
    super(hoTen, CMND, SDT, queQuan, gioiTinh, soNgayCong);
  }
}
