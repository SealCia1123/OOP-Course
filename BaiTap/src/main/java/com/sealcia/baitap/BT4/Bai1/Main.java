package com.sealcia.baitap.BT4.Bai1;

public class Main {
  public static void main(String[] args) {
    QLHinh ql = new QLHinh();
    Hinh h1 = new HinhChuNhat(30, 20);
    Hinh h2 = new Ellipse(30, 20);
    Hinh h3 = new TamGiac(7, 10, 5);
    Hinh h4 = new TamGiacCan(10, 20);
    Hinh h5 = new TamGiacDeu(10);
    Hinh h6 = new HinhTron(30);
    Hinh h7 = new HinhVuong(25);
    Hinh h8 = new HinhTron(23);
    Hinh h9 = new HinhChuNhat(20, 10);
    ql.themHinh(h1);
    ql.themHinh(h2, h3, h4, h5, h6, h7, h8, h9);
    ql.hienThi();
    // ql.xoaHinh("tron");
    // System.out.println("\n\n=== Sau khi xoa ===");
    // ql.hienThi();

    // try {
    //   System.out.println("\n\n=== Cac hinh Tam Giac ===");
    //   ql.layHinh("com.sealcia.baitap.BT4.Bai1.TamGiac")
    //       .forEach(x -> System.out.println(x + "\n====="));
    // } catch (ClassNotFoundException cnfe) {
    //   System.out.println("Class not found");
    //   cnfe.printStackTrace();
    // }

    // ql.sortByName();
    // System.out.println("\n\n=== Sap xep theo ten ===");
    // ql.hienThi();

    // ql.sapXep2();
    // System.out.println("\n\n=== Sap xep theo ten va dien tich ===");
    // ql.hienThi();

    System.out.println("======");
    System.out.printf("Dien tich trung binh: %.1f", ql.tinhTB());
  }
}
