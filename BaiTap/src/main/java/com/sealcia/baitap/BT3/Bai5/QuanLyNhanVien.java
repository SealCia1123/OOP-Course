package com.sealcia.baitap.BT3.Bai5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class QuanLyNhanVien {
  private List<NhanVien> ds = new ArrayList<>();

  public List<NhanVien> search(String keyword) {
    try {
      return this.ds.stream()
          .filter(x -> x.getQueQuan().contains(keyword) || x.getHoTen().contains(keyword))
          .collect(Collectors.toList());
    } catch (Exception e) {
      return this.ds.stream().filter(x -> x.getCMND().equals(keyword)).collect(Collectors.toList());
    }
  }

  public void printAll() {
    this.ds.forEach(x -> System.out.println(x + "\n====="));
  }

  public void addNV(NhanVien nv) {
    this.ds.add(nv);
  }

  public void addNV(NhanVien... nv) {
    this.ds.addAll(Arrays.asList(nv));
  }

  public void removeNV(NhanVien nv) {
    this.ds.removeIf(x -> x.getId() == nv.getId());
  }

  public void removeNV(int id) {
    this.ds.removeIf(x -> x.getId() == id);
  }
}
