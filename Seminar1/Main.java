package Seminar1;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // vx0();
        // vx1();
        // vx2();
        // System.out.println(vx3("Добро пожаловать на курс Java"));
        System.out.println(vx4(2, 4));
    }

    static void vx0() {
        /*
         * в консоли запросить имя пользователя
         * в зависимости от времени , вывести определенное приветсвие
         * Доброе утро, < Имя>! время 05:00 до 11:59
         * Добрый день, < Имя>! время 12:00 до 17:59
         * Доброе вечер, < Имя>! время 18:00 до 22:59
         * Доброй ночи, < Имя>! время 23:00 до 05:00
         */
        System.out.println(" Как тебя зовут?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        LocalTime time = LocalTime.now();
        int hour = time.getHour();
        if (hour >= 5 && hour < 12) {
            System.out.println("Доброе утро," + name + "!");
        } else if (hour >= 12 && hour < 18) {
            System.out.println("Добрый день," + name + "!");
        } else if (hour >= 18 && hour < 23) {
            System.out.println("Добрый вечер," + name + "!");
        } else if (hour >= 23 && hour < 5) {
            System.out.println("Доброй ночи," + name + "!");
        }
        scanner.close();

    }

    static void vx1() {
        /*
         * дан массив двоичных чисел , например [1,1,0,1,1,1]
         * вывести максимальное количество подряд идущих единиц.
         */
        // int [] array = new int []{1,1,0,1,1,1}; // готовый массив задали
        int[] randomArray = generateArray(6, 0, 1);
        System.out.println(Arrays.toString(randomArray));
        int count = count_ones(randomArray);
        System.out.println(" количество единиц = " + count);

    }

    static int[] generateArray(int size, int min_seed, int max_seed) { // метод создания массива с рандомным заполением
        int[] resultArray = new int[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            resultArray[i] = rand.nextInt(min_seed, max_seed + 1);
        }
        return resultArray;
    }

    static int count_ones(int[] arr) {
        int maxOnes = 0;
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                temp++;
            } else {
                if (temp > maxOnes) {
                    maxOnes = temp;
                }
                temp = 0;
            }
        }
        if (temp > maxOnes) {
            maxOnes = temp;
        }
        return maxOnes;
    }

    static void vx2() {
        /*
         * дан массив чисел [3,2,5,3] и число val = 3
         * числа равные заданному необходимо перененсти в конец массива
         * таким образом несколько (или все) элементов массива должны быть отличны от
         * заданного ,
         * а остальные равны ему.
         */
        int[] numbers = new int[] { 3, 2, 5, 3 };
        System.out.println(Arrays.toString(numbers));
        int val = 3;
        int[] res = new int[numbers.length];
        Arrays.fill(res, val);
        for (int i = 0, j = 0; i < res.length; i++) {
            if (numbers[i] != val) {
                res[j] = numbers[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(res));
    }

    static String vx3(String text) {
        /*
         * во фразе "Добро пожаловать на курс Java" переставить слова в обратном порядке
         */
        String[] temp = text.split(" ");
        String res = "";
        for (int i = temp.length - 1; i >= 0; i--) {
            res += temp[i] + " ";
        }
        return res;

    }

    static double vx4(int a, int b) {
        /*
         * Реализовать функцию возведения числа а в степень b.
         * a,b из Z. Сводя количество операций к мимнимуму.
         * Пример: а =3 , b = 2, ответ = 9
         * Пример: а =2 , b = -2, ответ = 0,25
         * Пример: а =3 , b = 0, ответ = 1
         * 
         */

        if (b == 0 || a == 1) {
            return 1;
        }
        double res = 1;
        for (int i = 0; i < Math.abs(b); i++) {
            res *= a;
        }
        return b > 0 ? res : 1 / res;

    }
}