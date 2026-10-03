package practice4;

public class Task4 {
  public static void main(String[] args) {
    Processor processor = new Processor("Intel Core i5", 6, 2.5);
    Memory memory = new Memory("DDR4", 16);
    Monitor monitor = new Monitor(27, 144);

    Computer computer = new Computer(ComputerBrand.ASUS, processor, memory, monitor);

    System.out.println(computer);
  }
}
