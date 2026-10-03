package practice4_1;

public class Table extends Furniture {
  public Table(String material, double price) {
    super(material, price);
  }

  @Override
  public String getType() {
    return "Table";
  }

}
