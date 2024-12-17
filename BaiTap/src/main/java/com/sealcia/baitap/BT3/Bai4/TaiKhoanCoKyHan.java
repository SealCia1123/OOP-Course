package com.sealcia.baitap.BT3.Bai4;

import com.sealcia.baitap.BT3.Bai3.Config;
import java.time.LocalDate;

public class TaiKhoanCoKyHan extends TaiKhoan {
  private KyHan kyHan;
  private LocalDate ngayDaoHan;

  @Override
  public double getInterest() {
    return kyHan.getInterestRate();
  }

  @Override
  public void add(double soTien) {
    if (this.ngayDaoHan.equals(LocalDate.now())) {
      super.add(soTien);
    }
  }

  @Override
  public String toString() {
    return super.toString()
        + String.format(
            " - Ky han: %s - Ngay dao han: %s",
            this.kyHan, this.ngayDaoHan.format(Config.FORMATTER));
  }

  public TaiKhoanCoKyHan(
      String soDT,
      String tenTaiKhoan,
      String email,
      double soTien,
      LocalDate ngayTao,
      KyHan kyHan) {
    super(soDT, tenTaiKhoan, email, soTien, ngayTao);
    this.kyHan = kyHan;
    switch (kyHan) {
      case MOT_TUAN:
        this.ngayDaoHan = this.getNgayTao().plusWeeks(1);
        break;
      case MOT_THANG:
        this.ngayDaoHan = this.getNgayTao().plusMonths(1);
        break;
      case MOT_NAM:
        this.ngayDaoHan = this.getNgayTao().plusYears(1);
        break;
    }
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
