package block2.practice13;

import java.util.StringTokenizer;

public class Address {

  private String country;
  private String region;
  private String city;
  private String street;
  private String house;
  private String building;
  private String apartment;

  public void parseComma(String address) {
    String[] parts = address.split(",");
    country = parts[0].trim();
    region = parts[1].trim();
    city = parts[2].trim();
    street = parts[3].trim();
    house = parts[4].trim();
    building = parts[5].trim();
    apartment = parts[6].trim();

  }

  public void parseAll(String address) {
    StringTokenizer tok = new StringTokenizer(address, ",.;");
    country = tok.nextToken().trim();
    region = tok.nextToken().trim();
    city = tok.nextToken().trim();
    street = tok.nextToken().trim();
    house = tok.nextToken().trim();
    building = tok.nextToken().trim();
    apartment = tok.nextToken().trim();

  }

  @Override
  public String toString() {
    return "Country: " + country
        + "\nRegion: " + region
        + "\nCity: " + city
        + "\nStreet: " + street
        + "\nHouse: " + house
        + "\nBuilding: " + building
        + "\nApartment: " + apartment + "\n";
  }

}
