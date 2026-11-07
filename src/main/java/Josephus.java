import java.util.ArrayDeque;

public class Josephus {
  static int josephusQueue(int n, int m) {
    ArrayDeque<Integer> q = new ArrayDeque<>();
    for (int i = 1; i <= n; i++) {
      q.offer(i);
    }
    while (n > 1) {
      for (int i = 0; i < m - 1; i++) {
        q.offer(q.poll());
      }
      q.poll();
      n--;
    }
    return q.poll();
  }

  public static void main(String[] args) {
    int[] n = {1, 1, 2, 5, 7, 10, 5};
    int[] m = {1, 5, 2, 2, 3, 3, 1};
    int[] exp = {1, 1, 1, 3, 4, 4, 5};
    for (int i = 0; i < n.length; i++) {
      int got = josephusQueue(n[i], m[i]);
      System.out.printf(
          "n=%-2d m=%-2d expected %-2d got %-2d %s%n",
          n[i], m[i], exp[i], got, got == exp[i] ? "OK" : "<-- ERROR");
    }
  }
}
