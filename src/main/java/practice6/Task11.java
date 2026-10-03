package practice6;

public class Task11 {
  public static void main(String[] args) {
    Convertable kelvin = new KelvinConverter();
    Convertable fahrenheit = new FahrenheitConverter();

    double[] temperatures = { -49, 0, 36.6, 100 };
    for (double temp : temperatures) {
      System.out.printf("Celsius: %.2f C | Kelvin: %.2f K | Fahrenheit: %.2f F%n",
          temp, kelvin.convert(temp), fahrenheit.convert(temp));
    }
  }

}
