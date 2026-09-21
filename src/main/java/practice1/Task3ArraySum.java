package practice1;

import java.util.Arrays;
import java.util.Locale;

/**
 * Практическая 1, задание 3: массив создаётся инициализацией (как в Си),
 * сумма и среднее арифметическое считаются в цикле for.
 */
public class Task3ArraySum {

    public static void main(String[] args) {
        // Задание требует именно инициализацию массива, а не ввод с клавиатуры
        // (ввод — это задание 4).
        int[] numbers = { 4, 8, 15, 16, 23, 42, -7, 0, 11, 5 };

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        // Приведение к double обязательно: без него sum / numbers.length даст
        // целочисленное деление и среднее округлится.
        double average = (double) sum / numbers.length;

        System.out.println("Массив: " + Arrays.toString(numbers));
        System.out.println("Элементов: " + numbers.length);
        System.out.println("Сумма элементов: " + sum);
        System.out.printf(Locale.ROOT, "Среднее арифметическое: %.3f%n", average);
    }
}
