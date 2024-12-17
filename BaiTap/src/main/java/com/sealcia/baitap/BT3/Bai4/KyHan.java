package com.sealcia.baitap.BT3.Bai4;

public enum KyHan {
  MOT_TUAN,
  MOT_THANG,
  MOT_NAM;
  private double PERCENT = 0.01;

  public double getInterestRate() {
    switch (this) {
      case MOT_TUAN:
        return 0.5 * PERCENT;
      case MOT_THANG:
        return 4.5 * PERCENT;
      case MOT_NAM:
        return 6.8 * PERCENT;
      default:
        return 0.1 / 100;
    }
  }
}
