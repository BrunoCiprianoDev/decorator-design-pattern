package com.example.impl;

import com.example.abst.DesktopComponent;
import com.example.abst.DesktopDecorator;

public class CPU extends DesktopDecorator {

  private String name;
  private float price;

  public CPU(String name, float price, DesktopComponent desktopComponent) {
    super(desktopComponent);
    this.name = name;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public float getPrice() {
    return this.price;
  }

  public String getStructure() {
    return this.getName();
  }

  public void setPrice(float price) {
    this.price = price;
  }

}
