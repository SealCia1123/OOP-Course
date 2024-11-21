package com.sealcia.baitap.BT3;

public class TamGiac {
    private double a, b, c;

    @Override
    public String toString() {
        return String.format("Hinh tam giac\n- Dien tich: %.1f\n- Chu vi: %.1f",
                this.tinhDienTich(), this.tinhChuVi());
    }

    public double tinhChuVi() {
        return this.a + this.b + this.c;
    }

    public double tinhDienTich() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - this.a) * (p - this.b) * (p - this.c));
    }

    public TamGiac(double a, double b, double c) throws Exception {
        if (a > b + c || b > a + c || c > a + b) {
            throw new Exception("Invalid data");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * @return the a
     */
    public double getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(double a) {
        this.a = a;
    }

    /**
     * @return the b
     */
    public double getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(double b) {
        this.b = b;
    }

    /**
     * @return the c
     */
    public double getC() {
        return c;
    }

    /**
     * @param c the c to set
     */
    public void setC(double c) {
        this.c = c;
    }

}
