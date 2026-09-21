package practice1;

/**
 * Практическая 1, задание 7: факториал числа методом класса через цикл,
 * плюс проверка работы метода в main.
 */
public class Task7Factorial {

    /** 20! — последнее значение факториала, которое помещается в long. */
    private static final int MAX_N = 20;

    /** Возвращает n! для 0 &lt;= n &lt;= {@value #MAX_N}. */
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Факториал определён только для n >= 0, получено: " + n);
        }
        if (n > MAX_N) {
            throw new IllegalArgumentException(
                    "n = " + n + " > " + MAX_N + ": результат не помещается в long");
        }

        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        for (int n = 0; n <= 10; n++) {
            System.out.println(n + "! = " + factorial(n));
        }
        System.out.println(MAX_N + "! = " + factorial(MAX_N));

        // Проверяем, что метод отвергает некорректные аргументы.
        for (int n : new int[] { -1, MAX_N + 1 }) {
            try {
                factorial(n);
                System.out.println("ОШИБКА: factorial(" + n + ") не бросил исключение");
            } catch (IllegalArgumentException e) {
                System.out.println("factorial(" + n + ") отклонён: " + e.getMessage());
            }
        }
    }
}
