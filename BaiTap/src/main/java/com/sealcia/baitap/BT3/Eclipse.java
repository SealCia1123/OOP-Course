package com.sealcia.baitap.BT3;

public class Eclipse {

    public final static double PI = 3.1415;
    private double bkTrucLon, bkTrucNho;
    protected String name = "Eclipse";

    public Eclipse(double bkTrucLon, double bkTrucNho) {
        this.bkTrucLon = bkTrucLon;
        this.bkTrucNho = bkTrucNho;
    }

    @Override
    public String toString() {
        return String.format("Hinh %s\nDien tich: %.1f\nChu vi: %.1f",
                this.name, this.tinhDienTich(), this.tinhChuVi());
    }

    public double tinhChuVi() {
        return 2 * PI * Math.sqrt((Math.pow(this.bkTrucLon, 2) + Math.pow(this.bkTrucNho, 2)) / 2);
    }

    public double tinhDienTich() {
        return PI * this.bkTrucLon * this.bkTrucNho;
    }

    /**
     * @return the bkTrucLon
     */
    public double getBkTrucLon() {
        return bkTrucLon;
    }

    /**
     * @param bkTrucLon the bkTrucLon to set
     */
    public void setBkTrucLon(double bkTrucLon) {
        this.bkTrucLon = bkTrucLon;
    }

    /**
     * @return the bkTrucNho
     */
    public double getBkTrucNho() {
        return bkTrucNho;
    }

    /**
     * @param bkTrucNho the bkTrucNho to set
     */
    public void setBkTrucNho(double bkTrucNho) {
        this.bkTrucNho = bkTrucNho;
    }

}
