package com.sealcia.baitap.BT2;

import java.time.LocalDate;
import java.util.stream.DoubleStream;

public class HocVien {

    private static int count = 1;
    private int maHocVien = count++;
    private String hoTen, queQuan;
    private LocalDate ngaySinh;
    private double[] diem = new double[Config.SO_MON];

    public int isNhoHon18() {
        return this.ngaySinh.plusYears(18).compareTo(LocalDate.now());
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
            if (i < 5) {
                return false;
            }
        }
        return this.tinhDiemTB() >= 8;
    }

    public void printInfo() {
        System.out.println("Ma hoc vien: " + this.getMaHocVien());
        System.out.println("Ten: " + this.getHoTen());
        System.out.println("Que quan: " + this.getQueQuan());
        System.out.println("Ngay sinh: " + this.ngaySinh.format(Config.FORMATTER));
        System.out.println("Diem 3 mon: " + this.getDiem()[0] + "  " + this.getDiem()[1] + "  "
                + this.getDiem()[2]);
        System.out.println("============================");
    }

    public void nhapDiem() {
        System.out.printf("Nhap diem 3 mon cho sinh vien %s: ", this.hoTen.toUpperCase());
        for (int i = 0; i < Config.SO_MON; i++) {
            diem[i] = Config.sc.nextDouble();
        }
    }

    public double tinhDiemTB() {
        return DoubleStream.of(this.diem).average().getAsDouble();
    }

    public HocVien(String hoTen, String queQuan, LocalDate ngaySinh) {
        this.hoTen = hoTen;
        this.queQuan = queQuan;
        this.ngaySinh = ngaySinh;
    }

    public HocVien(String hoTen, String queQuan, String ngaySinh) {
        this(hoTen, queQuan, LocalDate.parse(ngaySinh, Config.FORMATTER));
    }

    public void print() {
        System.out.println("Ho va ten: " + this.hoTen);
        System.out.println("Que quan: " + this.queQuan);
        System.out.println("Ngay sinh: " + this.ngaySinh.format(Config.FORMATTER));
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

    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public double[] getDiem() {
        return diem;
    }

    public void setDiem(double[] diem) {
        this.diem = diem;
    }
}
