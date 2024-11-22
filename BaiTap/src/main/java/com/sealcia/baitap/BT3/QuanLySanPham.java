package com.sealcia.baitap.BT3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class QuanLySanPham {
    private List<SanPham> ds = new ArrayList<>();

    public List<SanPham> search(String keyword) {
        return this.ds.stream()
                .filter(x -> x.getName().toLowerCase().contains(keyword.toLowerCase())
                        || x.getDesc().toLowerCase().contains(keyword.toLowerCase()))
                .collect(Collectors.toList());
    }

    public void printAll() {
        this.ds.forEach(x -> x.print());
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
