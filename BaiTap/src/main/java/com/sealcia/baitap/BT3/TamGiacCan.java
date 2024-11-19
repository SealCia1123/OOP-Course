package com.sealcia.baitap.BT3;

public class TamGiacCan extends TamGiac {
    public TamGiacCan(double ab, double c) throws Exception {
        super(ab, ab, c);
    }

    @Override
    public String toString() {
        return String.format("Hinh tam giac can\nDien tich: %.1f\nChu vi: %.1f",
                this.tinhDienTich(), this.tinhChuVi());
    }
}
