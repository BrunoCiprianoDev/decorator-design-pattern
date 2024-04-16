package com.example.impl;

import com.example.abst.DesktopComponent;

public class ComputerCase implements DesktopComponent {

  private float price;
  private String name;

  public ComputerCase() {
  }

  public ComputerCase(String name, float price) {
    this.name = name;
    this.price = price;
  }

  public float getPrice() {
    return price;
  }

  public void setPrice(float price) {
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public String getStructure() {
    return this.getName();
  }

  public void setName(String name) {
    this.name = name;
  }

}