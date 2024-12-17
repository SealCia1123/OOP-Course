package com.sealcia.baitap.BT3.Bai5;

public class Main {
  public static void main(String[] args) {
    QuanLyNhanVien ql = new QuanLyNhanVien();
    NhanVien nv1 = new NhanVien("Nguyen A", "0987653", "123", "TPHCM", GioiTinh.NAM, 28);
    NhanVien nv2 = new BoPhanA("Tran Thi B", "0312345", "345", "Ha Noi", GioiTinh.NU, 30);
    NhanVien nv3 = new BoPhanB("Nguyen Van C", "012939", "938", "TPHCM", GioiTinh.NAM, 30);
    NhanVien nv4 = new BoPhanC("Tran D", "012398", "12345", "Can Tho", GioiTinh.NU, 30);
    ql.addNV(nv1, nv2, nv3, nv4);
    ql.printAll();

    System.out.println("\n==== Tim kiem theo que quan tai TPHCM");
    ql.search("TPHCM").forEach(x -> System.out.println(x));

    System.out.println("\n==== Tim kiem theo CMND");
    ql.search("012398").forEach(x -> System.out.println(x));
  }
}
