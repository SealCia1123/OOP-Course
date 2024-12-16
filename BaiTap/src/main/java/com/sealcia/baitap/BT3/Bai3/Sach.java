package com.sealcia.baitap.BT3.Bai3;


public class Sach extends SanPham {
  private int pages;

  @Override
  public void add() {
    super.add();
    System.out.print("Nhap so trang: ");
    this.pages = Integer.parseInt(Config.sc.nextLine());
  }

  @Override
  public String toString() {
    return super.toString() + String.format("So trang: %d", this.pages);
  }

  public Sach() {}

  public Sach(int id, String name, String desc, String producer, double price, int pages) {
    super(id, name, desc, producer, price);
    this.pages = pages;
  }
}
