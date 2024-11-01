package org.example.BT2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
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
        System.out.println("===========Tim kiem so tt 1===========");
        ds.search(1).printInfo();
        System.out.println("===========Tim kiem tu 'Nguyen' trong ten===========");
        ds.search("Nguyen").forEach(x -> x.printInfo());
        System.out.println("===========Tim kiem tu 'Ha' trong que quan===========");
        ds.search("Ha").forEach(x -> x.printInfo());
        System.out.println("===========Sap xep theo diem tb mon hoc===========");
        ds.sort().forEach(x -> x.printInfo());
        System.out.println("===========Ghi danh sach hoc bong vao file===========");
        ds.outputHB();
    }

    public void outputHB() {
        File f = new File("src/main/resources/hocbong.txt");
        try (PrintWriter writer = new PrintWriter(f)) {
            SimpleDateFormat fd = new SimpleDateFormat("dd/MM/yyyy");
            this.getDSHocBong().forEach(x -> writer.println("Ma hoc vien: " + x.getMaHocVien() +
                    "\nTen: " + x.getHoTen() + "\nQue quan: " + x.getQueQuan() +
                    "\nNgay sinh: " + fd.format(x.getNgaySinh()) + "\nDiem 3 mon: " +
                    x.getDiem()[0] + "  " + x.getDiem()[1] + "  " + x.getDiem()[2]));
        } catch (FileNotFoundException e) {
            System.out.println("Khong tim thay file");
        }
    }

    public List<HocVien> getDSHocBong() {
        return this.getDs().stream().filter(x -> x.datHocBong()).collect(Collectors.toList());
    }

    public List<HocVien> sort() {
        return this.getDs().stream().sorted((a, b) -> a.compareTo(b)).collect(Collectors.toList());
    }

    public HocVien search(int maHocVien) {
        return this.getDs().stream().filter(x -> x.getMaHocVien() == maHocVien).findFirst().get();
    }

    public List<HocVien> search(String kw) {
        return this.getDs().stream().filter(x -> x.getHoTen().contains(kw) || x.getQueQuan().contains(kw))
                .collect(Collectors.toList());
    }

    public void input() {
        File f = new File("src/main/resources/hocvien.txt");
        try (Scanner sc = new Scanner(f)) {
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
