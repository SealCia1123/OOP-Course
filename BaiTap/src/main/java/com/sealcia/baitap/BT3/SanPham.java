package com.sealcia.baitap.BT3;

public abstract class SanPham {
    private int id;
    private String name, desc, producer;
    private double price;

    public void add() {
        System.out.print("Nhap id: ");
        this.id = Integer.parseInt(Config.sc.nextLine());
        System.out.print("Nhap ten: ");
        this.name = Config.sc.nextLine();
        System.out.print("Nhap mo ta: ");
        this.desc = Config.sc.nextLine();
        System.out.print("Nhap nha san xuat: ");
        this.producer = Config.sc.nextLine();
        System.out.print("Nhap gia: ");
        this.price = Double.parseDouble(Config.sc.nextLine());
    }

    @Override
    public String toString() {
        return String.format("ID: %d - Ten: %s\nMo ta: %s - NSX: %s\nGia ban: %.2f - ", this.id,
            this.name, this.desc, this.producer, this.price);
    }

    public void print() {
        System.out.println(this.toString() + "\n=======================");
    }

    public SanPham() {}

    public SanPham(int id, String name, String desc, String producer, double price) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.producer = producer;
        this.price = price;
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
