package block4.practice19;

public class SortItem implements MenuItem {
  private LabClass labClass;

  public SortItem(LabClass labClass) {
    this.labClass = labClass;
  }

  @Override
  public void execute() {
    labClass.sortByGpa();
  }

  @Override
  public String getName() {
    return "Sort by GPA";
  }
}
