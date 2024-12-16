package com.sealcia.baitap.BT4.Bai2;

import java.time.LocalDate;

public class GiangVienThinhGiang extends GiangVien {
  private String noiCongTac;

  public GiangVienThinhGiang(
      String hoTen,
      String hocHam,
      String hocVi,
      LocalDate ngaySinh,
      LocalDate ngayCongTac,
      String noiCongTac) {
    super(hoTen, hocHam, hocVi, ngaySinh, ngayCongTac);
    this.noiCongTac = noiCongTac;
  }

  public String getNoiCongTac() {
    return noiCongTac;
  }

  public void setNoiCongTac(String noiCongTac) {
    this.noiCongTac = noiCongTac;
  }
}
