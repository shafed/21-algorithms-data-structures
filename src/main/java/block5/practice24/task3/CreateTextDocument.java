package block5.practice24.task3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CreateTextDocument implements ICreateDocument {

  @Override
  public IDocument createNew() {
    return new TextDocument("");
  }

  @Override
  public IDocument createOpen(String path) throws FileNotFoundException {
    String text = "";
    Scanner fileScanner = new Scanner(new File(path));
    while (fileScanner.hasNextLine()) {
      text += fileScanner.nextLine() + "\n";
    }
    fileScanner.close();

    return new TextDocument(text);
  }
}
