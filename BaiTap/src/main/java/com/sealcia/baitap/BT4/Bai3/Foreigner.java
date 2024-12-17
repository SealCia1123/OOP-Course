package com.sealcia.baitap.BT4.Bai3;

import java.time.LocalDate;

public class Foreigner extends Person {

  private String passport, nationality;

  public Foreigner(
      String id,
      String name,
      Gender sex,
      String phoneNumber,
      LocalDate dob,
      String passport,
      String nationality) {
    super(id, name, sex, phoneNumber, dob);
    this.passport = passport;
    this.nationality = nationality;
  }

  public String getPassport() {
    return passport;
  }

  public void setPassport(String passport) {
    this.passport = passport;
  }

  public String getNationality() {
    return nationality;
  }

  public void setNationality(String nationality) {
    this.nationality = nationality;
  }
}
