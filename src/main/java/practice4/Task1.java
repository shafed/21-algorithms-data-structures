package practice4;

enum Seasons {
  SUMMER(18) {
    @Override
    public String getDescription() {
      return "Теплое время года";
    }
  },

  WINTER(-6),
  SPRING(7),
  AUTUMN(6);

  private final double averageTemperature;

  Seasons(double averageTemperature) {
    this.averageTemperature = averageTemperature;
  }

  public double getAverageTemperature() {
    return averageTemperature;
  }

  public String getDescription() {
    return "Холодное время года";
  }
}

public class Task1 {
  public static void printFavorite(Seasons favoriteSeason) {

    switch (favoriteSeason) {
      case SUMMER:
        System.out.println("Я люблю лето");
        break;
      case WINTER:
        System.out.println("Я люблю зиму");
        break;
      case SPRING:
        System.out.println("Я люблю весну");
        break;
      case AUTUMN:
        System.out.println("Я люблю осень");
        break;
    }
  }

  public static void main(String[] args) {

    Seasons favoriteSeason = Seasons.SPRING;
    System.out.println(favoriteSeason);
    System.out.println("Средняя температура: " + favoriteSeason.getAverageTemperature() + " °C");
    System.out.println(favoriteSeason.getDescription());

    printFavorite(favoriteSeason);

    for (Seasons season : Seasons.values()) {
      System.out.println(season + ": " + season.getAverageTemperature() + " °C, " + season.getDescription());
    }
  }

}
