package practice4;

public class Memory {
  private int capacity;
  private String type;

  public Memory(String type, int capacity) {
    this.type = type;
    this.capacity = capacity;
  }

  @Override
  public String toString() {
    return "Memory: " + type + ", capacity: " + capacity + " GB";
  }

}
