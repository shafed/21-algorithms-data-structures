package practice_1;

public class practice_1_7 {
    public static long fact(int n) {
        long res = 1;
        for (int i = 1; i <= n; i++) {
            res *= i;
        }
        return res;
    }

    static void main() {
        System.out.println(fact(5));
    }
}
