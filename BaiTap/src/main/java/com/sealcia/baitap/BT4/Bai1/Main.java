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
    ql.themHinh(h1);
    ql.themHinh(h2, h3, h4, h5, h6, h7, h8);
    ql.hienThi();

    ql.xoaHinh("tron");
    System.out.println("===Sau khi xoa: ===");
    ql.hienThi();
  }
}
