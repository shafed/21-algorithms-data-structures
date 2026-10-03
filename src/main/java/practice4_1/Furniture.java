package practice4_1;

public abstract class Furniture {
  private String material;
  private double price;

  public Furniture(String material, double price) {
    this.material = material;
    this.price = price;
  }

  public abstract String getType();

  @Override
  public String toString() {
    return getType() + ", material: " + material + ", price: " + price + " RUB";
  }

}
