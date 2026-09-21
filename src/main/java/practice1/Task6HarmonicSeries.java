package practice1;

import java.util.Locale;

/**
 * Практическая 1, задание 6: первые 10 чисел гармонического ряда с
 * форматированным выводом. Выводятся и члены ряда 1/n, и частичные суммы H(n),
 * потому что «числа гармонического ряда» читается и так, и так.
 */
public class Task6HarmonicSeries {

    private static final int TERMS = 10;

    public static void main(String[] args) {
        System.out.printf(Locale.ROOT, "%3s %12s %12s%n", "n", "1/n", "H(n)");
        System.out.println("-".repeat(29));

        double partialSum = 0.0;
        for (int n = 1; n <= TERMS; n++) {
            // 1.0 / n, а не 1 / n: иначе это целочисленное деление и все члены,
            // кроме первого, окажутся нулями.
            double term = 1.0 / n;
            partialSum += term;
            System.out.printf(Locale.ROOT, "%3d %12.6f %12.6f%n", n, term, partialSum);
        }
    }
}
