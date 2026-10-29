package block2.practice13;

public class Shirt {

  private String id;
  private String name;
  private String color;
  private String size;

  public Shirt(String shirt) {
    String[] parts = shirt.split(",");
    id = parts[0].trim();
    name = parts[1].trim();
    color = parts[2].trim();
    size = parts[3].trim();
  }

  @Override
  public String toString() {
    return "ID: " + id
        + "\nName: " + name
        + "\nColor: " + color
        + "\nSize: " + size + "\n";
  }
}
