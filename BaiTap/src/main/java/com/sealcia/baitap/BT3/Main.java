package com.sealcia.baitap.BT3;

public class Main {
    public static void main(String[] args) {
        QuanLySanPham ql = new QuanLySanPham();
        SanPham p1 = new Sach(1, "But chi", "But chi hang A", "Hang A", 5.1, 100);
        SanPham p2 = new BangDia(2, "But bi", "But bi hang A", "Hang A", 3.1, 200);
        SanPham p3 = new Sach(3, "Thuoc ke", "Thuoc ke", "ABC", 200, 120);
        SanPham p4 = new Sach(4, "Truyen tranh", "Truyen Doraemon", "Kim Dong", 100, 100);
        ql.addSP(p1);
        ql.addSP(p2);
        ql.addSP(p3, p4);
        ql.addSP();
        ql.printAll();
        System.out.println("====After delete====");
        ql.removeSP(new Sach(4, "Truyen tranh", "Truyen Doraemon", "Kim Dong", 20, 100));
        ql.printAll();

        System.out.println("======Tim kiem san pham co ten 'But'======");
        ql.search("but").forEach(x -> x.print());
        System.out.println("======Tim kiem san pham co id 3======");
        ql.search(3).print();
        System.out.println("======Tim kiem san pham co khoang gia tu 10 den 100======");
        ql.search(10, 100).forEach(x -> x.print());
        ql.update(2);
        System.out.println("======Sort=======");
    }
}
