package Seminar4.HomeTask;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Iterator;


public class HT3 {
    public static void main(String[] args) {
        /*
         * Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. 
         * Используйте итератор
         */

        LinkedList<Integer> fewList = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            fewList.add(getRandomNumber());
        }
        System.out.println(fewList);
        
        Iterator<Integer> iterator = fewList.iterator();

        int sum = 0;
        while (iterator.hasNext()){
            sum += iterator.next();
        }
        System.out.println(sum); // сумма 


    }
    public static int getRandomNumber() { // генерирует случайное число
        double x = (Math.random() * 99);
        int num = (int) x;
        return num;
    }
    

    
}
