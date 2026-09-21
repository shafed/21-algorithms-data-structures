package practice1;

public class Task7 {

    public static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] numbers = { 0, 1, 5, 10, 20, -1 };

        for (int i = 0; i < numbers.length; i++) {
            int n = numbers[i];
            if (n < 0) {
                System.out.println("Факториал определён только для n >= 0, получено: " + n);
            } else {
                System.out.println(n + "! = " + factorial(n));
            }
        }
    }
}
