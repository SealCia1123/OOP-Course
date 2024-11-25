
package com.sealcia.baitap.BT3;

public class SanPham {
    private int id;
    private String name, desc, producer;
    private double price;

    public int compareTo(SanPham product) {
        if (this.price > product.price) {
            return 1;
        } else if (this.price < product.price) {
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return String.format("ID: %d\nTen: %s\nMo ta: %s\nNha san xuat: %s\nGia ban: %.2f",
                this.id, this.name, this.desc, this.producer, this.price);
    }

    public void print() {
        System.out.println(this.toString() + "\n=======================");
    }

    public SanPham(int id, String name, String desc, String producer, double price) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.producer = producer;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || this.getClass() != obj.getClass())
            return false;
        if (this == obj)
            return true;
        SanPham product = (SanPham) obj;
        return this.id == product.id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
