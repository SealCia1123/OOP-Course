package com.sealcia.baitap.BT3;

public class Sach extends SanPham {
    private int pages;

    @Override
    public String toString() {
        return super.toString() + String.format("\nSo trang: %d", this.pages);
    }

    public Sach(int id, String name, String desc, String producer, double price, int pages) {
        super(id, name, desc, producer, price);
        this.pages = pages;
    }
}
