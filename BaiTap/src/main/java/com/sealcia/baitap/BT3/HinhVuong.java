package com.sealcia.baitap.BT3;

public class HinhVuong extends HinhChuNhat {
    public String toString() {
        return String.format("Hinh vuong\n- Chu vi: %.1f\n- Dien tich: %.1f",
                this.tinhChuVi(), this.tinhDienTich());
    }

    public HinhVuong(double canh) {
        super(canh, canh);
    }
}
