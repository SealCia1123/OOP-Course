package com.sealcia.baitap.BT3;

public class Main {
    public static void main(String[] args) throws Exception {
        QuanLySanPham ql = new QuanLySanPham();
        SanPham p1 = new SanPham(1, "But chi", "But chi hang A", "Hang A", 5.1);
        SanPham p2 = new SanPham(2, "But bi", "But bi hang A", "Hang A", 3.1);
        SanPham p3 = new SanPham(3, "Thuoc ke", "Thuoc ke dinh hon ke", "Chi Dan", 200);
        SanPham p4 = new Sach(4, "Truyen tranh", "Truyen Doraemon", "Kim Dong", 20, 100);
        SanPham p5 = new BangDia(5, "Bang dia lau", "Noi tinh yeu bat dau", "CCMK", 10.1, 3.18);
        ql.addSP(p1);
        ql.addSP(p2);
        ql.addSP(p3, p4, p5);
        System.out.println("=========Before=========");
        ql.printAll();
        System.out.println("=========After=========");
        ql.removeSP(new Sach(4, "Truyen tranh", "Truyen Doraemon", "Kim Dong", 20, 100));
        ql.printAll();

        System.out.println("======Tim kiem san pham co ten 'But'======");
        ql.search("but").forEach(x -> x.print());
    }
}
