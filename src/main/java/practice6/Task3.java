package practice6;

public class Task3 {
  public static void main(String[] args) {

    Nameable[] names = { new Planet("Earth"), new Animal("Tiger"), new Planet("Mars"), new Animal("Leon") };

    for (Nameable name : names) {
      System.out.println(name.getName());
    }
  }

}
