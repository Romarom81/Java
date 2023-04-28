package Seminar1.HomeTask;

import java.util.Scanner;
public class HT1 {
    public static void main(String[] args) {
        /*
         * 1.Вычислить n-ое треугольного число (сумма чисел от 1 до n)
         */

        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число: ");
        int i = iScanner.nextInt();
        int res = (i * (i + 1)) / 2;
        System.out.println(res);
        iScanner.close();
    }
}
