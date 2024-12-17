package com.sealcia.baitap.BT4.Bai3;

public class Vaccine {
  private static int count = 1;
  private String id, name, origin;
  private int quantity;

  {
    this.id = String.format("%06d", Vaccine.count++);
  }

  public void showInfo() {
    System.out.printf(
        "ID: %s\nName: %s\nOrigin: %s\nQuantity: %d\n",
        this.id, this.name, this.origin, this.quantity);
  }

  public Vaccine(String name, String origin, int quantity) {
    this.name = name;
    this.origin = origin;
    this.quantity = quantity;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getOrigin() {
    return origin;
  }

  public void setOrigin(String origin) {
    this.origin = origin;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }
}
