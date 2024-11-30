package com.sealcia.baitap.BT3;

import java.time.LocalDate;

public class MainTK {
    public static void main(String[] args) {
        QLTK ql = new QLTK();
        TaiKhoan tk1 = new TaiKhoan(
            "0123456789", "Nguyen Van A", "a@gmail.com", 100.2, LocalDate.of(2024, 10, 29));
        TaiKhoan tk2 = new TaiKhoanCoKyHan("09876543231", "Nguyen Van B", "b@gmail.com", 200.19,
            LocalDate.of(2024, 11, 1), KyHan.MOT_THANG, LocalDate.of(2024, 12, 1));
        TaiKhoan tk3 = new TaiKhoan(
            "012458628", "Nguyen Van C", "c@gmail.com", 100, LocalDate.of(2020, 10, 10));
        ql.addTK(tk1, tk2, tk3);
        ql.lookup("00001", "Nguyen Van A").print();
        ql.deposit("00001", "Nguyen Van A", 100);
        ql.lookup("00001", "Nguyen Van A").print();
        ql.lookup("00002", "Nguyen Van B").print();
        ql.deposit("00002", "Nguyen Van B", 100);
        ql.lookup("00002", "Nguyen Van B").print();
    }
}
