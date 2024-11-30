package com.sealcia.baitap.BT3;

enum GioiTinh { NAM, NU }

public class NhanVien {
    public static final int luong = 100000;
    private static int count = 1;
    private int id = count++;
    private String hoTen, CMND, SDT;
    private GioiTinh gioiTinh;
    private int soNgayCong;

    public int tinhLuong() {
        return NhanVien.luong * this.soNgayCong;
    }

    public NhanVien(String hoTen, String CMND, String SDT, GioiTinh gioiTinh, int soNgayCong) {
        this.hoTen = hoTen;
        this.CMND = CMND;
        this.SDT = SDT;
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
}
