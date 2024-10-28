package org.example.BT2;

import java.util.Scanner;

public class PhanSo {
    private int tuSo, mauSo;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap phan so thu nhat: ");
        PhanSo p = new PhanSo(sc.nextInt(), sc.nextInt());
        p = p.rutGon();
        System.out.println("Phan so p (da rut gon): " + p.toString());

        System.out.print("Nhap phan so thu hai: ");
        PhanSo q = new PhanSo(sc.nextInt(), sc.nextInt());
        q = q.rutGon();
        System.out.println("Phan so q (da rut gon): " + q.toString());
        System.out.println("Phep cong: " + p.cong(q).toString());
        System.out.println("Phep tru: " + p.tru(q).toString());
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
