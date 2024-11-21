package com.sealcia.baitap.BT3;

public class HinhChuNhat {
    private double chieuDai, chieuRong;

    @Override
    public String toString() {
        return String.format("Hinh chu nhat\n- Chu vi: %.1f\n- Dien tich: %.1f",
                this.tinhChuVi(), this.tinhDienTich());
    }

    public double tinhDienTich() {
        return this.chieuDai * this.chieuRong;
    }

    public double tinhChuVi() {
        return 2 * (this.chieuDai * this.chieuRong);
    }

    public HinhChuNhat(double chieuDai, double chieuRong) {
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
