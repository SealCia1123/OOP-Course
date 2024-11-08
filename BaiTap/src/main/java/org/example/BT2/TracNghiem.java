package org.example.BT2;

import org.example.BT2.CauHoi;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TracNghiem {
    private List<CauHoi> dsCauHoi = new ArrayList<>();

    public static void main(String[] args) {
        TracNghiem tracNghiem = new TracNghiem();
        int opt = -1;
        Scanner sc = new Scanner(System.in);
        while (opt != 0) {
            System.out.println("========== Trac Nghiem Tieng Anh ==========");
            System.out.println("1. Them cau hoi");
            System.out.println("2. Luyen tap");
            System.out.println("0. Thoat");
            System.out.print("Nhap lua chon: ");
            opt = Integer.parseInt(sc.nextLine());
            switch (opt) {
                case 1:
                    tracNghiem.addQuestion();
                    break;
                case 2:
                    for (CauHoi i : tracNghiem.getRandomQuestion()) {
                        try {
                            i.printQuestion();
                            i.checkAnswer();
                            System.out.println("=================");
                        } catch (FileNotFoundException fnfe) {
                            System.out.println("Khong co cau hoi trong kho du lieu");
                        }
                    }
                    break;
                case 0:
                    System.out.println("Chao tam biet!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le");
                    break;
            }
        }
    }

    public List<CauHoi> getRandomQuestion() {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.print("Nhap so luong cau hoi muon on tap: ");
        int n = Integer.parseInt(sc.nextLine());
        List<CauHoi> lists = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            lists.add(this.getDsCauHoi().get(r.nextInt(this.getDsCauHoi().size())));
        }
        return lists;
    }

    public TracNghiem() {
        this.loadDir();
    }

    public void loadDir() {
        List<File> files = Stream.of(new File(CauHoi.questionDir).listFiles()).collect(Collectors.toList());
        files.forEach(x -> this.getDsCauHoi().add(new CauHoi(x)));
    }

    public void addQuestion() {
        try {
            CauHoi question = new CauHoi();
            this.getDsCauHoi().add(question);
        } catch (FileNotFoundException fnfe) {
            System.out.println("Khong tim thay duong dan");
        }
    }

    public List<CauHoi> getDsCauHoi() {
        return dsCauHoi;
    }

    public void setDsCauHoi(List<CauHoi> dsCauHoi) {
        this.dsCauHoi = dsCauHoi;
    }
}
