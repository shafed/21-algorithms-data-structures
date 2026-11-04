package block4.practice19;

public class PrintItem implements MenuItem {
  private LabClass labclass;

  public PrintItem(LabClass labclass) {
    this.labclass = labclass;
  }

  @Override
  public void execute() {
    labclass.printStudents();
  }

  @Override
  public String getName() {
    return "Print students";
  }

}
