package practice13;

public class TesterAddress {
  public static void main(String[] args) {
    Address address = new Address();
    address.parseComma("Britain, Surrey, Little Whinging, Privet Drive, 4, -, -");
    System.out.println(address);

    address.parseComma("  Britain , London Region , London , Diagon Alley , 8A , 3 , 42  ");
    System.out.println(address);

    address.parseAll("Britain. Devon. Ottery St Catchpole. Burrow Lane. 15. 1. 9");
    System.out.println(address);

    address.parseAll("Britain; Yorkshire, Godric's Hollow. Phoenix Street; 6B, 4. 13");
    System.out.println(address);
  }

}
