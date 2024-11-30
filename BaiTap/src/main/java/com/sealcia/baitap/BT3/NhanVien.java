package com.sealcia.baitap.BT3;

enum GioiTinh { NAM, NU }

public class NhanVien {
    public static final int luong = 100000;
    protected static int count = 1;
    protected int id = count++;
    protected String hoTen, CMND, SDT, queQuan;
    protected GioiTinh gioiTinh;
    protected int soNgayCong;

    public void hienThi() {
        System.out.println("Ho ten: " + this.hoTen);
        System.out.println("So CMND: " + this.CMND);
        System.out.println("Gioi tinh: " + this.gioiTinh);
        System.out.println("Que quan: " + this.queQuan);
        System.out.println("So dien thoai: " + this.SDT);
    }

    public double tinhLuong() {
        return NhanVien.luong * this.soNgayCong;
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
}
