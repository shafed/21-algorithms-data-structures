package practice4_1;

public class FurnitureShop {
  private Furniture[] furnitures;

  public FurnitureShop(Furniture[] furnitures) {
    this.furnitures = furnitures;
  }

  public void showFurniture() {
    for (Furniture furniture : furnitures) {
      System.out.println(furniture);
    }
  }

}
