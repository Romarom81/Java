package Seminar2;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main2 {

    public static void main(String[] args) {
        // char c1 = 'a';
        // char c2 = 'b';
        // int n = 10;
        // System.out.println(ex1(c1, c2, n));

        // System.out.println(ex2("aaaabbbbcdddaaarrrgggrrrr"));

        // System.out.println(ex3("А роза упала на лапу азора"));

        ex4("text", 20);

    }

    static String ex1(char c1, char c2, int n) {
        /*
         * Дано чётное число N (>0) и символы c1 и c2;
         * Написать метод который врнет строку длтны N, которая состоит из чередующихся
         * символов с 1 и с 2, начиная с с1. (Всего N символов )
         */
        if (n % 2 != 0) {
            return " Вы ввели нечетное число";
        }
        StringBuffer stringBuilder = new StringBuffer();
        for (int i = 0; i < n / 2; i++) {
            stringBuilder.append(c1);
            stringBuilder.append(c2);
        }
        return stringBuilder.toString();

    }

    static String ex2(String s) {
        /*
         * Напишите метод, который сжимает строку.
         * Пример: вход aaaabbbcddaa
         * на выходе: a4b3cd2a2
         */
        StringBuilder stringBuilder = new StringBuilder();
        char[] arr = s.toCharArray();
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                stringBuilder.append(arr[i - 1]);
                if (count > 1) {
                    stringBuilder.append(count);
                    count = 1;
                }
            }
        }
        stringBuilder.append(arr[arr.length - 1]);
        if (count > 1) {
            stringBuilder.append(count);
        }
        return stringBuilder.toString();

    }

    static boolean ex3(String s) {
        /*
         * Напишите метод, которвый принимает на вход строку (String), и определяет
         * является ли строка полиндромом (возвращает boolean )
         * Полиндром - слово или фраза, котрые одинаково читаются справа налево и слева
         * на право.
         */

        s = s.replace(" ", "");
        s = s.toLowerCase();
        StringBuilder stringBuilder1 = new StringBuilder(s);
        stringBuilder1.reverse();
        return stringBuilder1.toString().equals(s);

    }

    static void ex4(String s, int n) {
        /*
         * напишите метод, который составит строку , состоящую из 100 посторений слова
         * ТЕСТ,
         * напишите метод, который запишет эту строку в простой текстовый файл,
         * обработайте исключения.
         */
        String s1 = repeatString(s, n);

    }

    static String repeatString(String s, int n) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            stringBuilder.append(s);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();

    }

    /**
     * @param s
     * @throws IOException
     */
    static void saveToFile(String s) throws IOException {
        String path = "text.txt";
        try (FileWriter fileWriter = new FileWriter(path, false);){
            fileWriter.write(s);
            fileWriter.flush();
        } catch (Exception e) {
            e.printStackTrace();
        
    }
}
}
