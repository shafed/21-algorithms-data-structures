package block4.practice19;

public interface MenuItem {
  String getName();

  void execute() throws StudentNotFoundException, EmptyStringException;
}
