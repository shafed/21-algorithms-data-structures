package block5.practice24.task3;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ConsoleEditor {
  private IDocument document;
  private ICreateDocument factory;

  public ConsoleEditor(ICreateDocument factory) {
    this.factory = factory;
  }

  public void newDocument() {
    document = factory.createNew();
  }

  public void openDocument(String path) {
    try {
      document = factory.createOpen(path);
    } catch (FileNotFoundException e) {
      System.err.println("File not found: " + path);
    }
  }

  public void saveDocument(String path) {
    if (document == null) {
      System.err.println("Create or open a document before saving.");
      return;
    }

    try {
      document.save(path);
      System.out.println("Saved: " + path);
    } catch (IOException e) {
      System.err.println("Could not save the document: " + e.getMessage());
    }
  }

  public static void main(String[] args) {
    ConsoleEditor editor = new ConsoleEditor(new CreateTextDocument());
    Scanner input = new Scanner(System.in);

    System.out.println("Commands: new, open, save, exit");
    while (input.hasNextLine()) {
      String command = input.nextLine().trim();
      if (command.equals("exit")) {
        break;
      }
      switch (command) {
        case "new" -> editor.newDocument();
        case "open" -> {
          System.out.println("Enter file path:");
          if (input.hasNextLine()) {
            editor.openDocument(input.nextLine());
          }
        }
        case "save" -> {
          System.out.println("Enter save path:");
          if (input.hasNextLine()) {
            editor.saveDocument(input.nextLine());
          }
        }
        default -> System.err.println("Unknown command. Use new, open, save, or exit.");
      }
    }
    input.close();
  }
}
