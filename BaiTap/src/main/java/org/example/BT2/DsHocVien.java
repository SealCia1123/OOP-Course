package org.example.BT2;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DsHocVien {
    private List<HocVien> ds = new ArrayList<>();

    public static void main(String[] args) {
        DsHocVien ds = new DsHocVien();
        ds.input();
        ds.nhapDiem();
        ds.getDs().forEach((i) -> i.printInfo());
        ds.search(1).printInfo();
        ds.search("Nguyen").stream().forEach(x -> x.printInfo());
    }

    public HocVien search(int maHocVien) {
        return this.getDs().stream().filter(x -> x.getMaHocVien() == maHocVien).findFirst().get();
    }

    public List<HocVien> search(String hoTen) {
        return this.getDs().stream().filter(x -> x.getHoTen().contains(hoTen)).collect(Collectors.toList());
    }

    public void input() {
        File f = new File("src/main/resources/hocvien.txt");
        try {
            Scanner sc = new Scanner(f);
            while (sc.hasNext()) {
                SimpleDateFormat fd = new SimpleDateFormat("dd/MM/yyyy");
                this.getDs().add(new HocVien(sc.nextLine(), sc.nextLine(), fd.parse(sc.nextLine())));
            }
        } catch (FileNotFoundException | ParseException p) {
            System.out.println("Khong tim thay file");
        }
    }

    public void nhapDiem() {
        for (var i : this.getDs()) {
            i.nhapDiem();
        }
    }

    public DsHocVien() {
    }

    public List<HocVien> getDs() {
        return ds;
    }
}
