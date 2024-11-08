package org.example.BT2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class HocVien {
    private static int count = 1;
    private int maHocVien;
    private String hoTen, queQuan;
    private Date ngaySinh;
    private double[] diem = new double[3];

    public int tinhTuoi() {
        DateFormat formatter = new SimpleDateFormat("yyyyMMdd");
        int d1 = Integer.parseInt(formatter.format(this.getNgaySinh()));
        int d2 = Integer.parseInt(formatter.format(new Date()));
        return (d2 - d1) / 10000;
    }

    public int compareTo(HocVien h) {
        if (this.tinhDiemTB() == h.tinhDiemTB()) {
            return 0;
        } else if (this.tinhDiemTB() < h.tinhDiemTB()) {
            return -1;
        } else {
            return 1;
        }
    }

    public boolean datHocBong() {
        for (var i : this.diem) {
            if (i < 5)
                return false;
        }
        return this.tinhDiemTB() > 8;
    }

    public void printInfo() {
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Ma hoc vien: " + this.getMaHocVien());
        System.out.println("Ten: " + this.getHoTen());
        System.out.println("Que quan: " + this.getQueQuan());
        System.out.println("Ngay sinh: " + f.format(this.getNgaySinh()));
        System.out.println("Diem 3 mon: " + this.getDiem()[0] + "  " + this.getDiem()[1] + "  " + this.getDiem()[2]);
        System.out.println("============================");
    }

    public void nhapDiem() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap diem 3 mon: ");
        double[] temp = new double[this.getDiem().length];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = sc.nextDouble();
        }
        this.diem = temp;
    }

    public double tinhDiemTB() {
        double res = 0;
        for (var i : this.getDiem()) {
            res += i;
        }
        return res / 3;
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
