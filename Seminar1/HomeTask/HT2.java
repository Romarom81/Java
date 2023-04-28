package Seminar1.HomeTask;

import java.util.Scanner;

public class HT2 {
    public static void main(String[] args) {
        /*
         * Вычислить n! (произведение чисел от 1 до n)
         */


        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите положительное число от 1 до 20: ");
        int num = scanner.nextInt();
        System.out.println(" Факториал числа " + num + " = " + fact( fillArray(num)));
        scanner.close();

       
    }
    static int[] fillArray(int size) { // метод заполнения массива
        int[] array = new int [size];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        return array;
    }
    static int fact (int []arr){
        int result =1;
        for (int i = 0; i < arr.length; i++) {
            result = result * arr[i];
        }
        return result;

    }
    
}

    

