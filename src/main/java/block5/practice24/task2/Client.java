package block5.practice24.task2;

public class Client {
  public Chair chair;

  public void setChair(Chair chair) {
    this.chair = chair;
  }

  public void sit(Chair chair) {
    if (chair == null) {
      System.out.println("Choose a chair first");
      return;
    }
    System.out.println("Sitting down");
  }
}
