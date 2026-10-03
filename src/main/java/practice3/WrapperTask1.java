package practice3;

public class WrapperTask1 {
  // 1
  Double x = Double.valueOf(0.5);
  // 2
  String s = "50";
  double d = Double.parseDouble(s);
  // 3
  double y1 = x;
  int y2 = x.intValue();
  long y3 = x.longValue();
  short y4 = x.shortValue();
  char y5 = (char) x.doubleValue();
  byte y6 = x.byteValue();
  float y7 = x.floatValue();
  boolean y8 = x != 0;
  // 5
  String d1 = Double.toString(3.14);

  public static void main(String[] args) {
    Double x = Double.valueOf(0.5);

    // 4
    System.out.println(x);
  }
}
