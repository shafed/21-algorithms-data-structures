package practice4_1;

public class Task9 {
  public static void main(String[] args) {
    Furniture[] furnitures = {
        new Chair("wood", 3500),
        new Table("wood", 12000),
        new Chair("metal", 5000),
    };
    FurnitureShop shop = new FurnitureShop(furnitures);
    shop.showFurniture();
  }
}
