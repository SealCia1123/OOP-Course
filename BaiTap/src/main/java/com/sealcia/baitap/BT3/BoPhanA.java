package com.sealcia.baitap.BT3;

public class BoPhanA extends NhanVien {
    @Override
    public void hienThi() {
        super.hienThi();
        System.out.println("Bo phan: A");
    }

    @Override
    public double tinhLuong() {
        return 1.2 * NhanVien.luong * this.soNgayCong;
    }

    public BoPhanA(
        String hoTen, String CMND, String SDT, String queQuan, GioiTinh gioiTinh, int soNgayCong) {
        super(hoTen, CMND, SDT, queQuan, gioiTinh, soNgayCong);
    }
}
