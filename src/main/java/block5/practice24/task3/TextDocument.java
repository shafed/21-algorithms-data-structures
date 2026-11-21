package block5.practice24.task3;

import java.io.FileWriter;
import java.io.IOException;

public class TextDocument implements IDocument {
  private String text;

  public TextDocument(String text) {
    this.text = text;
  }

  @Override
  public void save(String path) throws IOException {
    FileWriter writer = new FileWriter(path);
    try {
      writer.write(text);
    } finally {
      writer.close();
    }
  }
}
