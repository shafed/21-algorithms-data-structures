package block5.practice24.task3;

import java.io.FileNotFoundException;

public interface ICreateDocument {
  IDocument createNew();

  IDocument createOpen(String path) throws FileNotFoundException;
}
