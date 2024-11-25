package com.sealcia.baitap.BT3;

import java.time.LocalDate;

enum KyHan {
    MOT_TUAN, MOT_THANG, MOT_NAM
}


public class TaiKhoan {
    private static int id = 1;
    private String soDT, soTaiKhoan, tenTaiKhoan, email;
    private double soTien;
    private LocalDate ngayTao;

    public void add(double soTien) {
        this.soTien += soTien;
    }

    public void print() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return String.format(
                "So tai khoan: %s\nTen tai khoan: %s\nEmail: %s\nSo dien thoai: %s\nSo tien: %.2f\nNgay tao: %s\n",
                this.soTaiKhoan, this.tenTaiKhoan, this.email, this.soDT, this.soTien,
                this.ngayTao.format(Config.FORMATTER));
    }

    public TaiKhoan() {}

    public TaiKhoan(String soDT, String tenTaiKhoan, String email, double soTien,
            LocalDate ngayTao) {
        this.soTaiKhoan = String.format("%05d", TaiKhoan.id++);
        this.soDT = soDT;
        this.tenTaiKhoan = tenTaiKhoan;
        this.email = email;
        this.soTien = soTien;
        this.ngayTao = ngayTao;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        TaiKhoan.id = id;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    public String getSoTaiKhoan() {
        return soTaiKhoan;
    }

    public void setSoTaiKhoan(String soTaiKhoan) {
        this.soTaiKhoan = soTaiKhoan;
    }

    public String getTenTaiKhoan() {
        return tenTaiKhoan;
    }

    public void setTenTaiKhoan(String tenTaiKhoan) {
        this.tenTaiKhoan = tenTaiKhoan;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSoTien() {
        return soTien;
    }

    public void setSoTien(double soTien) {
        this.soTien = soTien;
    }

    public LocalDate getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(LocalDate ngayTao) {
        this.ngayTao = ngayTao;
    }

}
