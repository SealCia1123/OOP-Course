package com.sealcia.baitap.BT2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DsHocVien {

    private List<HocVien> ds = new ArrayList<>();

    public int count(int age) {
        return (int) this.getDs().stream().filter(x -> x.tinhTuoi() < age || x.tinhTuoi() > age).count();
    }

    public int count(int min, int max) {
        return (int) this.getDs().stream().filter(x -> x.tinhTuoi() >= min && x.tinhTuoi() <= max).count();
    }

    public void outputHB() {
        File f = new File("src/main/resources/hocbong.txt");
        try (PrintWriter writer = new PrintWriter(f)) {
            this.getDSHocBong().forEach(x -> writer.println("Ma hoc vien: " + x.getMaHocVien()
                    + "\nTen: " + x.getHoTen() + "\nQue quan: " + x.getQueQuan()
                    + "\nNgay sinh: " + x.getNgaySinh().format(Config.FORMATTER) + "\nDiem trung binh: "
                    + x.tinhDiemTB()));
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

    public void printAll() {
        this.ds.forEach(x -> x.print());
    }

    public void them(HocVien... h) {
        this.ds.addAll(Arrays.asList(h));
    }

    public void them(HocVien h) {
        this.ds.add(h);
    }

    public void input() {
        File f = new File("src/main/resources/hocvien.txt");
        try (Scanner sc = new Scanner(f)) {
            while (sc.hasNext()) {
                this.getDs().add(new HocVien(sc.nextLine(), sc.nextLine(), sc.nextLine()));
            }
        } catch (FileNotFoundException fnfe) {
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
