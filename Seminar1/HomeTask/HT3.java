package Seminar1.HomeTask;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HT3 {
    public static void main(String[] args) {
        /*3.Вывести все простые числа от 1 до n 
            (числа, которые делятся только на 1 и на себя без остатка) 
        */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите положительное число: ");
        int number = scanner.nextInt();
        scanner.close();
        List<Integer> primes = new ArrayList<>();

        for (int i = 2; i <= number; i++) {
            boolean isPrimeNumber = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }

            if (isPrimeNumber) {
                primes.add(i);
            }
        }
        System.out.println("Простые числа: " + primes);
    }
}
            
  
