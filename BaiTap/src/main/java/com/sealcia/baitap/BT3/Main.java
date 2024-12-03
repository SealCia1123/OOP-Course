package com.sealcia.baitap.BT3;

public class Main {
    public static void main(String[] args) {
        QuanLySanPham ql = new QuanLySanPham();
        SanPham p1 = new Sach(1, "But chi", "But chi hang A", "Hang A", 5.1, 100);
        SanPham p2 = new BangDia(2, "But bi", "But bi hang A", "Hang A", 3.1, 200);
        SanPham p3 = new Sach(3, "Thuoc ke", "Thuoc ke", "ABC", 200, 120);
        SanPham p4 = new Sach(4, "Truyen tranh", "Truyen Doraemon", "Kim Dong", 100, 100);
        SanPham p5 = new BangDia(5, "Bang dia lau", "Noi tinh yeu bat dau", "CCMK", 10.1, 3.5);
        SanPham p6 = new Sach(10, "Truyen tranh 2", "Truyen Doraemon 2", "Kim Dong", 20, 100);
        SanPham p7 = new Sach(20, "Truyen Conan", "Conan tap 123", "Kim Dong", 15.2, 60);
        SanPham p8 = new BangDia(8, "Phim 1", "Mo ta phim", "20th Fox", 30.2, 80);
        ql.addSP(p1);
        ql.addSP(p2);
        ql.addSP(p3, p4, p5, p6, p7, p8);
        System.out.println("=========Before=========");
        ql.printAll();
        System.out.println("=========After=========");
        ql.removeSP(new Sach(4, "Truyen tranh", "Truyen Doraemon", "Kim Dong", 20, 100));
        ql.removeSP(10);
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
