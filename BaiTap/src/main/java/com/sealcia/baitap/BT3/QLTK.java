package com.sealcia.baitap.BT3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QLTK {
    private List<TaiKhoan> ds = new ArrayList<>();

    public void deposit(String soTaiKhoan, String tenTaiKhoan, double soTien) {
        this.lookup(soTaiKhoan, tenTaiKhoan).add(soTien);
    }

    public TaiKhoan lookup(String soTaiKhoan, String tenTaiKhoan) {
        return this.ds.stream().filter(
                x -> x.getSoTaiKhoan().equals(soTaiKhoan) && x.getTenTaiKhoan().equals(tenTaiKhoan))
                .findFirst().get();
    }

    public void addTK(TaiKhoan... tk) {
        this.ds.addAll(Arrays.asList(tk));
    }

    public void addTK(TaiKhoan tk) {
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
