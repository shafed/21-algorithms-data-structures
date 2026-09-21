package practice1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Практическая 1, задание 4: массив вводится с клавиатуры, сумма считается
 * циклами while и do while, дополнительно ищутся максимум и минимум.
 */
public class Task4ArrayStats {

    private static final int SIZE = 10;

    public static void main(String[] args) {
        int[] numbers = readNumbers(SIZE);

        // Задание требует посчитать сумму двумя циклами, поэтому считаем дважды.
        int sumWhile = 0;
        int i = 0;
        while (i < numbers.length) {
            sumWhile += numbers[i];
            i++;
        }

        // do while выполняет тело хотя бы один раз, поэтому он корректен только
        // для непустого массива — здесь это гарантирует константа SIZE.
        int sumDoWhile = 0;
        int j = 0;
        do {
            sumDoWhile += numbers[j];
            j++;
        } while (j < numbers.length);

        int min = numbers[0];
        int max = numbers[0];
        for (int k = 1; k < numbers.length; k++) {
            if (numbers[k] > max) {
                max = numbers[k];
            }
            if (numbers[k] < min) {
                min = numbers[k];
            }
        }

        System.out.println("Массив: " + Arrays.toString(numbers));
        System.out.println("Сумма (while):    " + sumWhile);
        System.out.println("Сумма (do while): " + sumDoWhile);
        System.out.println("Максимум: " + max);
        System.out.println("Минимум:  " + min);
    }

    /** Читает ровно {@code count} целых чисел, переспрашивая при неверном вводе. */
    private static int[] readNumbers(int count) {
        int[] numbers = new int[count];
        try (Scanner scanner = new Scanner(System.in)) {
            int i = 0;
            while (i < numbers.length) {
                System.out.print("Введите число " + (i + 1) + " из " + numbers.length + ": ");
                if (!scanner.hasNext()) {
                    throw new IllegalStateException(
                            "Ввод закончился, прочитано чисел: " + i + " из " + numbers.length);
                }
                if (!scanner.hasNextInt()) {
                    System.out.println("\"" + scanner.next() + "\" — не целое число, повторите ввод.");
                    continue;
                }
                numbers[i] = scanner.nextInt();
                i++;
            }
        }
        return numbers;
    }
}
