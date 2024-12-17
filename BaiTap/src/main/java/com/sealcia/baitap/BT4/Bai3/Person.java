package com.sealcia.baitap.BT4.Bai3;

import java.time.LocalDate;

public abstract class Person {
  private String name, id, phoneNumber;
  private Gender sex;
  private LocalDate dob;

  public Person(String id, String name, Gender sex, String phoneNumber, LocalDate dob) {
    this.id = id;
    this.name = name;
    this.sex = sex;
    this.phoneNumber = phoneNumber;
    this.dob = dob;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public Gender getSex() {
    return sex;
  }

  public void setSex(Gender sex) {
    this.sex = sex;
  }

  public LocalDate getDob() {
    return dob;
  }

  public void setDob(LocalDate dob) {
    this.dob = dob;
  }
}
