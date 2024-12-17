/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sealcia.baitap.BT4.Bai3;

/**
 * @author sealcia
 */
public class Main {
  public static void main(String[] args) {
    VaccineControl controller = new VaccineControl();
    Vaccine v1 = new Vaccine("ABC", "USA", 1200);
    Vaccine v2 = new Vaccine("DEF", "China", 999);
    Vaccine v3 = new Vaccine("HKI", "Germany", 129);
    Vaccine v4 = new Vaccine("IKG", "Japan", 90);
    controller.addVaccines(v1, v2, v3, v4);
    controller.show();
  }
}
