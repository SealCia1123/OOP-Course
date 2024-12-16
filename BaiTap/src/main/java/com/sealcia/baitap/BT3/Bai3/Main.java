package com.sealcia.baitap.BT3.Bai3;

public class Main {
  public static void main(String[] args) {
    QuanLySanPham ql = new QuanLySanPham();
    SanPham p1 = new Sach(1, "OOP", "Sach hoc OOP", "OU", 25.1, 100);
    SanPham p2 = new BangDia(2, "Java", "Java Fundamentals", "Oracle", 120.1, 200);
    SanPham p3 = new Sach(3, "OOP Advance", "Advanced OOP", "OU", 200, 120);
    SanPham p4 = new BangDia(4, "C#", "Trash language", "Microsoft", 22.2, 160.5);
    SanPham p5 = new Sach(5, "Go Simplicity", "Go and why it's good", "Google", 133, 200);
    ql.addSP(p1);
    ql.addSP(p2);
    ql.addSP(p3, p4, p5);
    // ql.addSP();
    ql.printAll();
    // System.out.println("===After delete===");
    // ql.removeSP(new Sach(4, "Truyen tranh", "Truyen Doraemon", "Kim Dong", 20, 100));
    // ql.printAll();

    // System.out.println("===Tim kiem san pham co ten 'But'===");
    // ql.search("but").forEach(x -> x.print());
    // System.out.println("===Tim kiem san pham co id 3===");
    // ql.search(3).print();
    // System.out.println("===Tim kiem san pham co khoang gia tu 10 den 100===");
    // ql.search(10, 100).forEach(x -> x.print());
    // ql.update(2);
    System.out.println("===Sort===");
    ql.sortType();
    ql.printAll();
  }
}
