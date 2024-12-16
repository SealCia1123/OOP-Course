package com.sealcia.baitap.BT3.Bai4;

public enum KyHan {
  MOT_TUAN,
  MOT_THANG,
  MOT_NAM;

  public double getInterestRate() {
    switch (this) {
      case MOT_TUAN:
        return 1;
      case MOT_THANG:
        return 0.5 / 100;
      case MOT_NAM:
        return 4.5 / 100;
      default:
        return 0;
    }
  }
}
