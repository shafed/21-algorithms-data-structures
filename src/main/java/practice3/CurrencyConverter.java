package practice3;

public class CurrencyConverter {
  private final double dollarRate;
  private final double euroRate;

  public CurrencyConverter(double dollarRate, double euroRate) {
    this.dollarRate = dollarRate;
    this.euroRate = euroRate;
  }

  public double rublesToDollars(double rubles) {
    return rubles / dollarRate;
  }

  public double dollarsToRubles(double dollars) {
    return dollars * dollarRate;
  }

  public double rublesToEuros(double rubles) {
    return rubles / euroRate;
  }

  public double eurosToRubles(double euros) {
    return euros * euroRate;
  }
}
