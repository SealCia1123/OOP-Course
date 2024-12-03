package com.sealcia.baitap.BT3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class QuanLySanPham {
    private List<SanPham> ds = new ArrayList<>();

    public void sort() {
        this.ds.sort((a, b) -> Double.compare(a.getPrice(), b.getPrice()));
    }

    public void update(int id) {
        System.out.println("1. Sua ten");
        System.out.println("2. Sua mo ta");
        System.out.println("3. Sua gia");
        System.out.print("Nhap lua chon: ");
        int choice = Integer.parseInt(Config.sc.nextLine());
        switch (choice) {
            case 1:
                System.out.print("Nhap ten moi: ");
                this.search(id).setName(Config.sc.nextLine());
                break;
            case 2:
                System.out.print("Nhap mo ta moi: ");
                this.search(id).setDesc(Config.sc.nextLine());
                break;
            case 3:
                System.out.print("Nhap gia moi: ");
                this.search(id).setPrice(Double.parseDouble(Config.sc.nextLine()));
                break;
            default:
                break;
        }
    }

    public List<SanPham> search(double min, double max) {
        return this.ds.stream()
            .filter(x -> x.getPrice() >= min && x.getPrice() <= max)
            .collect(Collectors.toList());
    }

    public List<SanPham> search(String keyword) {
        try {
            Class c = Class.forName(keyword);
            return this.ds.stream().filter(x -> c.isInstance(x)).collect(Collectors.toList());
        } catch (ClassNotFoundException e) {
            return this.ds.stream()
                .filter(x
                    -> x.getName().toLowerCase().contains(keyword.toLowerCase())
                        || x.getDesc().toLowerCase().contains(keyword.toLowerCase()))
                .collect(Collectors.toList());
        }
    }

    public SanPham search(int id) {
        return this.ds.stream().filter(x -> x.getId() == id).findFirst().get();
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

    public void removeSP(int id) {
        this.ds.removeIf(x -> x.getId() == id);
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
