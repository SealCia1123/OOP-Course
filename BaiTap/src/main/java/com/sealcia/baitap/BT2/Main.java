package com.sealcia.baitap.BT2;

public class Main {

    public static void main(String[] args) {
        DsHocVien ds = new DsHocVien();
        ds.input();
        ds.nhapDiem();
        ds.getDs().forEach((i) -> i.printInfo());
        System.out.println("===========Tim kiem so tt 1===========");
        ds.search(1).printInfo();
        System.out.println("===========Tim kiem tu 'Nguyen' trong ten===========");
        ds.search("Nguyen").forEach(x -> x.printInfo());
        System.out.println("===========Tim kiem tu 'Ha' trong que quan===========");
        ds.search("Ha").forEach(x -> x.printInfo());
        System.out.println("===========Sap xep theo diem tb mon hoc===========");
        ds.sort().forEach(x -> x.printInfo());
        ds.outputHB();
        System.out.println("===========Danh sach hoc vien nho hon 18 tuoi===========");
        System.out.println(ds.count(18));
        System.out.println("===========Danh sach hoc vien lon hon 18 va nho hon 24===========");
        System.out.println(ds.count(18, 23));
    }
}