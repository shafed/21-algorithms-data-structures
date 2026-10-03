package practice3;

public class FormatterTask1 {
  public static void main(String[] args) {
    // 1 доллар = 83 рублей, 1 евро = 93 рублей.
    CurrencyConverter converter = new CurrencyConverter(83, 93);

    System.out.printf("1000 рублей = %.2f долларов%n", converter.rublesToDollars(1000));
    System.out.printf("10 долларов = %.2f рублей%n", converter.dollarsToRubles(10));
    System.out.printf("1000 рублей = %.2f евро%n", converter.rublesToEuros(1000));
    System.out.printf("10 евро = %.2f рублей%n", converter.eurosToRubles(10));
  }
}
