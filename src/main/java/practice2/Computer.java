package practice2;

public class Computer {
  private int price;
  private String brand;

  public Computer(int price, String brand) {
    this.price = price;
    this.brand = brand;
  }

  public String getBrand() {
    return brand;
  }

  @Override
  public String toString() {
    return "The Computer brand is " + brand + " and it price is " + price;
  }
}
