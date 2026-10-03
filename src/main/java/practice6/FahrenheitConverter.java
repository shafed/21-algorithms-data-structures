package practice6;

public class FahrenheitConverter implements Convertable {
  @Override
  public double convert(double celsius) {
    return celsius * 9.0 / 5.0 + 32;
  }

}
