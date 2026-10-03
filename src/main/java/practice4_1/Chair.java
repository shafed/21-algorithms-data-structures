package practice4_1;

public class Chair extends Furniture {

  public Chair(String material, double price) {
    super(material, price);
  }

  @Override
  public String getType() {
    return "Chair";
  }
}
