package block5.practice24.task1;

public class ConcreteFactory implements ComplexAbstractFactory {
  private int real;
  private int img;

  public ConcreteFactory(int real, int img) {
    this.real = real;
    this.img = img;
  }

  @Override
  public Complex createComplex() {
    return new Complex(real, img);
  }

  @Override
  public Complex createComplex(int real, int img) {
    return new Complex(real, img);
  }
}
