package practice_1;
import java.util.Scanner;

public class practice_1_4 {
    public static void main(String[] args) {
        int[] b = new int[10];
        int i = 0;
        float sum_list = 0;
        int cnt = 0;
        Scanner sc = new Scanner(System.in);
        while(i < 10) {
            System.out.println("Введите число: ");
            b[i] = sc.nextInt();
            sum_list = sum_list + b[i];
            cnt = cnt + 1;
            i = i + 1;
        }
        int min = b[0];
        int max = b[0];
        for (int k = 0; k < 10; k++) {
            if (b[k] > max) max = b[k];
            if (b[k] < min) min = b[k];
        }
        System.out.println(sum_list);
        System.out.println(sum_list/cnt);
        System.out.println(max);
        System.out.println(min);


    }
}
