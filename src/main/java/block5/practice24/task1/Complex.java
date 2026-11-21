package block5.practice24.task1;

public class Complex {
  private int real;
  private int img;

  public Complex(int real, int img) {
    this.real = real;
    this.img = img;
  }

  @Override
  public String toString() {
    if (img < 0) {
      return real + " - " + (-img) + "i";
    }
    return real + " + " + img + "i";
  }

  public static void main(String[] args) {
    ComplexAbstractFactory factory = new ConcreteFactory(3, 4);

    System.out.println(factory.createComplex());
    System.out.println(factory.createComplex(7, -2));
  }
}
