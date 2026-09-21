package practice1;

/**
 * Практическая 1, задание 5: вывод аргументов командной строки в цикле for.
 *
 * <p>Запуск: {@code mvn exec:java -Dexec.mainClass=practice1.Task5CommandLineArgs
 * -Dexec.args="один два три"}
 */
public class Task5CommandLineArgs {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Аргументы командной строки не переданы.");
            return;
        }

        System.out.println("Передано аргументов: " + args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "] = " + args[i]);
        }
    }
}
