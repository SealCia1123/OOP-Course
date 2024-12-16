package com.sealcia.baitap.BT3.Bai3;

public class BangDia extends SanPham {
  private double length;

  @Override
  public void add() {
    super.add();
    this.length = Double.parseDouble(Config.sc.nextLine());
  }

  @Override
  public String toString() {
    return super.toString() + String.format("Do dai: %.1f", this.length);
  }

  public BangDia() {}

  public BangDia(int id, String name, String desc, String producer, double price, double length) {
    super(id, name, desc, producer, price);
    this.length = length;
  }
}
