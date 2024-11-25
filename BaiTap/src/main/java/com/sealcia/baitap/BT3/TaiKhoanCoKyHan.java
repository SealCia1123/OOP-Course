package com.sealcia.baitap.BT3;

import java.time.LocalDate;

public class TaiKhoanCoKyHan extends TaiKhoan {
    private KyHan kyHan;
    private LocalDate ngayDaoHan;

    @Override
    public void add(double soTien) {
        if (this.ngayDaoHan.equals(LocalDate.now())) {
            super.add(soTien);
        }
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Ky han: %s\nNgay dao han: %s\n", this.kyHan,
                this.ngayDaoHan.format(Config.FORMATTER));
    }

    public TaiKhoanCoKyHan(String soDT, String tenTaiKhoan, String email, double soTien,
            LocalDate ngayTao, KyHan kyHan, LocalDate ngayDaoHan) {
        super(soDT, tenTaiKhoan, email, soTien, ngayTao);
        this.kyHan = kyHan;
        this.ngayDaoHan = ngayDaoHan;
    }

    public KyHan getKyHan() {
        return kyHan;
    }

    public void setKyHan(KyHan kyHan) {
        this.kyHan = kyHan;
    }

    public LocalDate getNgayDaoHan() {
        return ngayDaoHan;
    }

    public void setNgayDaoHan(LocalDate ngayDaoHan) {
        this.ngayDaoHan = ngayDaoHan;
    }


}
