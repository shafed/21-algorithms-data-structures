package practice1;

public class Task5 {

    // Запуск: mvn exec:java -Dexec.mainClass=practice1.Task5 -Dexec.args="один два три"
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Аргументы командной строки не переданы.");
            return;
        }

        for (String s : args) {
            System.out.println(s);
        }
    }
}
