package com.sealcia.baitap.BT4.Bai1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QLHinh {
  private List<Hinh> dsHinh = new ArrayList<>();

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
