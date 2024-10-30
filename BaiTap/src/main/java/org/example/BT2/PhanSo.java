package org.example.BT2;

import java.util.ArrayList;
import java.util.Comparator;
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

        System.out.println("Phan So trong mang: ");
        mangPS.forEach((i) -> System.out.print(i.toString() + " "));
        System.out.println();

        PhanSo max = mangPS.stream().max((a, b) -> a.compareTo(b)).get();
        PhanSo sum = mangPS.stream().reduce(new PhanSo(), (a, b) -> a.cong(b));
        System.out.println("Max: " + max.toString());
        System.out.println("Sum: " + sum.toString());
    }

    public int compareTo(PhanSo p) {
        double a = (double) this.getTuSo() / this.getMauSo();
        double b = (double) p.getTuSo() / p.getMauSo();
        if (a > b) {
            return 1;
        } else if (a == b) {
            return 0;
        } else {
            return -1;
        }
    }

    public PhanSo cong(PhanSo p) {
        PhanSo kq = new PhanSo(this.getTuSo() * p.getMauSo() + this.getMauSo() * p.getTuSo(),
                this.getMauSo() * p.getMauSo());
        return kq.rutGon();
    }

    public PhanSo tru(PhanSo p) {
        PhanSo kq = new PhanSo(this.getTuSo() * p.getMauSo() - this.getMauSo() * p.getTuSo(),
                this.getMauSo() * p.getMauSo());
        return kq.rutGon();
    }

    public PhanSo nhan(PhanSo p) {
        PhanSo kq = new PhanSo(this.getTuSo() * p.getTuSo(), this.getMauSo() * p.getMauSo());
        return kq.rutGon();
    }

    public PhanSo chia(PhanSo p) {
        PhanSo kq = new PhanSo(this.getTuSo() * p.getMauSo(), this.getMauSo() * p.getTuSo());
        return kq.rutGon();
    }

    public PhanSo rutGon() {
        PhanSo p = new PhanSo(this.getTuSo(), this.getMauSo());
        int UCLN = PhanSo.UCLN(p.getTuSo(), p.getMauSo());
        p.setTuSo(p.getTuSo() / UCLN);
        p.setMauSo(p.getMauSo() / UCLN);
        return p;
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
        if (this.getMauSo() == 1)
            return this.getTuSo() + "";
        return this.getTuSo() + "/" + this.getMauSo();
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
