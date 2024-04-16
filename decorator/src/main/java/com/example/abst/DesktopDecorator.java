package com.example.abst;

public abstract class DesktopDecorator implements DesktopComponent {

  private DesktopComponent desktop;

  public DesktopDecorator(DesktopComponent desktopComponent) {
    this.desktop = desktopComponent;
  }

  public DesktopComponent getDesktop() {
    return desktop;
  }

  public void setDesktop(DesktopComponent desktop) {
    this.desktop = desktop;
  }

  public abstract float getPrice();

  public String getStructure() {
    return this.desktop.getStructure() + "/" + this.getStructure();
  }

  public float getTotalPrice() {
    return this.desktop.getPrice() + this.getPrice();
  }

}
