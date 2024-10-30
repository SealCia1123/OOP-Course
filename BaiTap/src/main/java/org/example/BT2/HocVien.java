package org.example.BT2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class HocVien {
    private static int count = 1;
    private int maHocVien;
    private String hoTen, queQuan;
    private Date ngaySinh;
    private double[] diem = new double[3];

    public void print() {
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Ten: " + this.getHoTen());
        System.out.println("Que quan: " + this.getQueQuan());
        System.out.println("Ngay sinh: " + f.format(this.getNgaySinh()));
        System.out.println("===========================================");
    }

    public void nhapDiem() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap diem 3 mon: ");
        for (double i : this.diem) {
            i = sc.nextDouble();
        }
    }

    public HocVien(String hoTen, String queQuan, Date ngaySinh) {
        this.maHocVien = count++;
        this.hoTen = hoTen;
        this.queQuan = queQuan;
        this.ngaySinh = ngaySinh;
    }

    public int getMaHocVien() {
        return maHocVien;
    }

    public void setMaHocVien(int maHocVien) {
        this.maHocVien = maHocVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public double[] getDiem() {
        return diem;
    }

    public void setDiem(double[] diem) {
        this.diem = diem;
    }
}
