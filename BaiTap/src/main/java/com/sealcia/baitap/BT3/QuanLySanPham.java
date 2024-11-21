package com.sealcia.baitap.BT3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuanLySanPham {
    private List<SanPham> ds = new ArrayList<>();

    public void printAll() {
        this.ds.forEach(x -> System.out.println(x + "\n=========================\n"));
    }

    public void addSP(SanPham... products) {
        this.ds.addAll(Arrays.asList(products));
    }

    public void addSP(SanPham product) {
        this.ds.add(product);
    }

    public void removeSP(SanPham product) {
        this.ds.remove(this.ds.indexOf(product));
    }

    public List<SanPham> getDs() {
        return ds;
    }

    public void setDs(List<SanPham> ds) {
        this.ds = ds;
    }
}
