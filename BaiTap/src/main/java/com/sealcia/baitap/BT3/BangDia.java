package com.sealcia.baitap.BT3;

public class BangDia extends SanPham {
    private double length;

    @Override
    public String toString() {
        return super.toString() + String.format("\nDo dai: %.1f", this.length);
    }

    public BangDia(int id, String name, String desc, String producer, double price, double length) {
        super(id, name, desc, producer, price);
        this.length = length;
    }
}
