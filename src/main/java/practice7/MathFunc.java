package practice7;

public class MathFunc implements MathCalculable {
  @Override
  public double pow(double base, double exponent) {
    return Math.pow(base, exponent);
  }

  @Override
  public double modulus(double real, double imaginary) {
    return Math.hypot(real, imaginary);
  }

  public double circleLen(double radius) {
    return 2 * PI * radius;
  }

}
