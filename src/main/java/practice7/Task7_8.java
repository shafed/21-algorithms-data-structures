package practice7;

public class Task7_8 {

  public static void main(String[] args) {
    Printable[] papers = {
        new Book("Dune"),
        new Magazine("Nature"),
        new Book("The Hobbit"),
        new Magazine("National Geographic")
    };

    System.out.println("Magazines:");
    Magazine.printMagazines(papers);
    System.out.println("\nBooks:");
    Book.printBooks(papers);
  }
}
