package com.sealcia.baitap.BT3;

import java.util.ArrayList;
import java.util.List;

public class QuanLyNhanVien {
    private List<NhanVien> ds = new ArrayList<>();

    public void addNV(NhanVien nv) {
        this.ds.add(nv);
    }

    public void removeNV(NhanVien nv) {
        this.ds.removeIf(x -> x.id == nv.id);
    }

    public void removeNV(int id) {
        this.ds.removeIf(x -> x.id == id);
    }
}
