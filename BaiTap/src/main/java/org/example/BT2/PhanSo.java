package org.example.BT2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhanSo {
    private int tuSo, mauSo;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<PhanSo> mangPS = new ArrayList<>();

        System.out.print("Nhap so luong phan so: ");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan so thu " + (i + 1) + ": ");
            mangPS.add(new PhanSo(sc.nextInt(), sc.nextInt()));
        }

        System.out.print("Phan So trong mang: ");
        mangPS.forEach((i) -> System.out.print(i.toString() + " \t"));
        System.out.println();

        PhanSo max = mangPS.stream().max((a, b) -> a.compareTo(b)).get();
        PhanSo sum = mangPS.stream().reduce(new PhanSo(), (a, b) -> a.cong(b));

        System.out.println("Max: " + max.toString());
        System.out.println("Sum: " + sum.toString());
        System.out.print("Sap xep tang dan: ");
        mangPS.stream().sorted((a, b) -> a.compareTo(b)).forEach(x -> System.out.print(x.toString() + " \t"));
    }

    public int compareTo(PhanSo p) {
        double a = (double) this.tuSo / this.mauSo;
        double b = (double) p.tuSo / p.mauSo;
        if (a > b) {
            return 1;
        } else if (a == b) {
            return 0;
        } else {
            return -1;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass())
            return false;
        if (this == obj)
            return true;
        PhanSo p = (PhanSo) obj;
        return this.tuSo == p.tuSo && this.mauSo == p.mauSo;
    }

    public PhanSo cong(PhanSo p) {
        return new PhanSo(this.tuSo * p.mauSo + this.mauSo * p.tuSo, this.mauSo * p.mauSo).rutGon();
    }

    public PhanSo tru(PhanSo p) {
        return new PhanSo(this.tuSo * p.mauSo - this.mauSo * p.tuSo, this.mauSo * p.mauSo).rutGon();
    }

    public PhanSo nhan(PhanSo p) {
        return new PhanSo(this.tuSo * p.tuSo, this.mauSo * p.mauSo).rutGon();
    }

    public PhanSo chia(PhanSo p) {
        return new PhanSo(this.tuSo * p.mauSo, this.mauSo * p.tuSo).rutGon();
    }

    public PhanSo rutGon() {
        int UCLN = PhanSo.UCLN(this.tuSo, this.mauSo);
        return new PhanSo(this.tuSo / UCLN, this.mauSo / UCLN);
    }

    public static int UCLN(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0)
            return a + b;
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return b;
    }

    @Override
    public String toString() {
        if (this.mauSo == 1)
            return Integer.toString(this.tuSo);
        return this.tuSo + "/" + this.mauSo;
    }

    public PhanSo() {
        this.tuSo = 0;
        this.mauSo = 1;
    }

    public PhanSo(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    public int getTuSo() {
        return tuSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }
}
