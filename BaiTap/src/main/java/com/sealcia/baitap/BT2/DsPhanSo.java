package com.sealcia.baitap.BT2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DsPhanSo {
    private List<PhanSo> ds;

    public static void main(String[] args) throws IndexOutOfBoundsException {
        DsPhanSo dsPhanSo = new DsPhanSo();
        PhanSo p1 = new PhanSo(20, 6);
        PhanSo p2 = new PhanSo(10, 2);
        dsPhanSo.addPS();
        dsPhanSo.addPS(new PhanSo(3, 2));
        dsPhanSo.addPS(new PhanSo(2, 7));
        dsPhanSo.addPS(p1, p2);
        System.out.print("Truoc khi xoa: ");
        dsPhanSo.showDs();
        dsPhanSo.remove(3, 2);
        dsPhanSo.remove(new PhanSo(20, 6));
        System.out.print("Sau khi xoa: ");
        dsPhanSo.showDs();
        System.out.println("Tong: " + dsPhanSo.sum());
        System.out.println("Min: " + dsPhanSo.findMin());
        System.out.println("Max: " + dsPhanSo.findMax());
        System.out.print("Sort: ");
        dsPhanSo.sort().forEach(x -> System.out.print(x + " \t"));
    }

    public List<PhanSo> sort() {
        return this.ds.stream().sorted((a, b) -> a.compareTo(b)).collect(Collectors.toList());
    }

    public PhanSo findMax() {
        return this.ds.stream().max((a, b) -> a.compareTo(b)).get();
    }

    public PhanSo findMin() {
        return this.ds.stream().min((a, b) -> a.compareTo(b)).get();
    }

    public PhanSo sum() {
        return this.ds.stream().reduce(new PhanSo(), (a, b) -> a.cong(b)).rutGon();
    }

    public void remove(int tuSo, int mauSo) throws IndexOutOfBoundsException {
        this.ds.remove(this.ds.indexOf(new PhanSo(tuSo, mauSo)));
    }

    public void remove(PhanSo p) throws IndexOutOfBoundsException {
        this.ds.remove(this.ds.indexOf(p));
    }

    public void showDs() {
        this.ds.forEach(x -> System.out.print(x.toString() + " \t"));
        System.out.println();
    }

    public void addPS(PhanSo... p) {
        this.ds.addAll(Arrays.asList(p));
    }

    public void addPS(PhanSo p) {
        this.ds.add(p);
    }

    public void addPS() {
        PhanSo p = new PhanSo();
        p.nhap();
        this.ds.add(p);
    }

    public DsPhanSo() {
        ds = new ArrayList<>();
    }

    public DsPhanSo(List<PhanSo> ds) {
        this.ds = ds;
    }

    public void setDs(List<PhanSo> ds) {
        this.ds = ds;
    }

    public List<PhanSo> getDs() {
        return ds;
    }
}
