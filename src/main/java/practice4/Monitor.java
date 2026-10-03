package practice4;

public class Monitor {
  private double diagonal;
  private int refreshRate;

  public Monitor(double diagonal, int refreshRate) {
    this.diagonal = diagonal;
    this.refreshRate = refreshRate;
  }

  @Override
  public String toString() {
    return "Monitor: " + diagonal + " inches, refresh rate: " + refreshRate + " Hz";
  }

}
