package com.sealcia.baitap.BT3.Bai4;

import java.time.LocalDate;

public class Main {
  public static void main(String[] args) {
    QLTK ql = new QLTK();
    TaiKhoan tk1 =
        new TaiKhoan(
            "0123456789",
            "Nguyen Van A",
            "nguyenvana@gmail.com",
            100.2,
            LocalDate.of(2024, 10, 29));
    TaiKhoan tk2 =
        new TaiKhoan(
            "0124586928", "Tran Thi C", "tranthic@gmail.com", 100, LocalDate.of(2020, 10, 10));
    TaiKhoan tk3 =
        new TaiKhoanCoKyHan(
            "0965432312",
            "Tran Van B",
            "tranvanb@gmail.com",
            200.19,
            LocalDate.of(2024, 11, 1),
            KyHan.MOT_THANG);
    TaiKhoan tk4 =
        new TaiKhoanCoKyHan(
            "123", "Robert", "fakeemail@gmail.com", 15, LocalDate.of(2024, 7, 13), KyHan.MOT_NAM);
    TaiKhoan tk5 =
        new TaiKhoanCoKyHan(
            "149", "John", "fake@gmail.com", 20, LocalDate.of(2024, 7, 20), KyHan.MOT_TUAN);
    ql.addAccount(tk1, tk2, tk3, tk4, tk5);
    System.out.println(ql.lookUp("00001", "Nguyen Van A"));
    System.out.println(ql.lookUp("00003", "Tran Van B"));
  }
}
