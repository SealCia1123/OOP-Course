package com.sealcia.baitap.BT4.Bai1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class QLHinh {
  private List<Hinh> dsHinh = new ArrayList<>();

  public int timHinh(Hinh h) {
    return this.dsHinh.indexOf(h);
  }

  public double tinhTB() {
    return this.dsHinh.stream().map(Hinh::tinhDienTich).reduce(0.0, Double::sum) / 2;
  }

  public void sapXep2() {
    this.dsHinh.sort(
        (a, b) -> {
          String type1 = a.getClass().toString();
          String type2 = b.getClass().toString();
          if (type1.equals(type2)) {
            return -Double.compare(a.tinhDienTich(), b.tinhDienTich());
          }
          return a.getTen().compareTo(b.getTen());
        });
  }

  public void sapXep1() {
    this.dsHinh.sort((a, b) -> -a.getTen().compareTo(b.getTen()));
  }

  public List<Hinh> layHinh(String keyword) throws ClassNotFoundException {
    Class c = Class.forName(keyword);
    return this.dsHinh.stream().filter(x -> c.isInstance(x)).collect(Collectors.toList());
  }

  public void hienThi() {
    this.dsHinh.forEach(
        x -> {
          System.out.println(x);
          System.out.println("=========");
        });
  }

  public void xoaHinh(String ten) {
    this.dsHinh.removeIf(x -> x.getTen().equalsIgnoreCase(ten));
  }

  public void themHinh(Hinh h) {
    this.dsHinh.add(h);
  }

  public void themHinh(Hinh... h) {
    this.dsHinh.addAll(Arrays.asList(h));
  }
}
