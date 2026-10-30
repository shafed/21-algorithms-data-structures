package block3.practice17_2;

public class Tester {

  public static void main(String[] args) {
    Container list = new Container();
    int c = -1;

    while (c != 0) {
      System.out
          .println("1 addFirst, 2 addLast, 3 removeFirst, 4 removeLast, 5 print, 6 size, 7 isEmpty, 8 clear, 0 exit");
      c = Node.sc.nextInt();
      Node.sc.nextLine();

      if (c == 1) {
        list.addFirst();
      } else if (c == 2) {
        list.addLast();
      } else if (c == 3 && !list.isEmpty()) {
        list.removeFirst().printAttributes();
      } else if (c == 4 && !list.isEmpty()) {
        list.removeLast().printAttributes();
      } else if (c == 5) {
        int i = Node.sc.nextInt();
        Node.sc.nextLine();
        if (i >= 0 && i < list.size()) {
          list.printNode(i);
        }
      } else if (c == 6) {
        System.out.println(list.size());
      } else if (c == 7) {
        System.out.println(list.isEmpty());
      } else if (c == 8) {
        list.clear();
      }
    }
  }
}
