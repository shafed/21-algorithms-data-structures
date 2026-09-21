import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] b = new int[10];
        Scanner sc = new Scanner(System.in);
        float sum_list = 0;
        int cnt = 0;
        for (int i=0; i < 10; i++) {
            System.out.print("Введите число: ");
            b[i] = sc.nextInt();
            sum_list = sum_list + b[i];
            cnt = cnt + 1;
        }
        System.out.println(sum_list);
        System.out.println(sum_list/cnt);
    }
}