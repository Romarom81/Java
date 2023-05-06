package Seminar2.HomeTask;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class HomeTask3 {
    public static void main(String[] args) throws Exception{
        /*
         * *Реализуйте алгоритм сортировки пузырьком числового массива, 
         * результат после каждой итерации запишите в лог-файл
         */
        int [] array = new int [] {};
        array = randomArr();
        System.out.println(array);
        int [] arraySort = new int [] {};
        arraySort = babblSort (array);
        System.out.println(arraySort);


    }   
    public static int[] randomArr() {
        Random rand = new Random();
        int arr[] = new int[15];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        return arr;    
    }
    public static int[] babblSort(int arr[]) throws IOException {
        Logger loger = Logger.getLogger(HomeTask3.class.getName());
        FileHandler fHandler = new FileHandler("Text.txt");
        SimpleFormatter sFormatter = new SimpleFormatter();
        fHandler.setFormatter(sFormatter);
        loger.addHandler(fHandler);

        int temp;
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

            loger.info(Arrays.toString(arr));
        }
        return arr;
    }
    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
