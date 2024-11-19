package com.sealcia.baitap.BT3;

public class TamGiacDeu extends TamGiacCan {
    public TamGiacDeu(double abc) throws Exception {
        super(abc, abc);
    }

    @Override
    public String toString() {
        return String.format("Hinh tam giac deu\nDien tich: %.1f\nChu vi: %.1f",
                this.tinhDienTich(), this.tinhChuVi());
    }
}
