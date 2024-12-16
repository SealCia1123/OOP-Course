package com.sealcia.baitap.BT3.Bai4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QLTK {
  private List<TaiKhoan> ds = new ArrayList<>();

  public void withdraw(String soTaiKhoan, String tenTaiKhoan, double soTien) {
    this.lookUp(soTaiKhoan, tenTaiKhoan).subtract(soTien);
  }

  public void deposit(String soTaiKhoan, String tenTaiKhoan, double soTien) {
    this.lookUp(soTaiKhoan, tenTaiKhoan).add(soTien);
  }

  public TaiKhoan lookUp(String soTaiKhoan, String tenTaiKhoan) {
    return this.ds.stream()
        .filter(x -> x.getSoTaiKhoan().equals(soTaiKhoan) && x.getTenTaiKhoan().equals(tenTaiKhoan))
        .findFirst()
        .get();
  }

  public void addAccount(TaiKhoan... tk) {
    this.ds.addAll(Arrays.asList(tk));
  }

  public void addAccount(TaiKhoan tk) {
    this.ds.add(tk);
  }

  public QLTK() {}

  public List<TaiKhoan> getDs() {
    return ds;
  }

  public void setDs(List<TaiKhoan> ds) {
    this.ds = ds;
  }
}
