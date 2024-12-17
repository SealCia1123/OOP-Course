package com.sealcia.baitap.BT4.Bai3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VaccineControl {
  private List<Vaccine> list = new ArrayList<>();

  public void show() {
    this.list.forEach(
        x -> {
          x.showInfo();
          System.out.println();
        });
  }

  public void addVaccines(Vaccine... v) {
    this.list.addAll(Arrays.asList(v));
  }

  public void addVaccines(Vaccine v) {
    this.list.add(v);
  }

  public List<Vaccine> getList() {
    return list;
  }

  public void setList(List<Vaccine> list) {
    this.list = list;
  }
}
