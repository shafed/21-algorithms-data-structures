package practice4;

public class Processor {
  private String model;
  private int cores;
  private double frequency;

  public Processor(String model, int cores, double frequency) {
    this.model = model;
    this.cores = cores;
    this.frequency = frequency;
  }

  @Override
  public String toString() {
    return "Processor: " + model + ", cores: " + cores + ", frequency: " + frequency + " GHz";
  }

}
