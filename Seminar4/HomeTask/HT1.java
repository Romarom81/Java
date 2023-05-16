package Seminar4.HomeTask;

import java.util.LinkedList;

public class HT1 {
    public static void main(String[] args) {
        /*
         * Пусть дан LinkedList с несколькими элементами. 
         * Реализуйте метод, который вернет “перевернутый” список.
         * Постараться не обращаться к листу по индексам
         */
        LinkedList<Integer> lidl = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            lidl.add(getRandomNumber());
        }
        System.out.println(lidl);
        System.out.println(getReversedLinkedList(lidl));
    }
    static LinkedList<Integer> getReversedLinkedList (LinkedList<Integer> linkedList){
            // возврат перевернутого списка
            LinkedList<Integer> reversedLinkedList = new LinkedList<>();
        while (linkedList.size() > 0){
                reversedLinkedList.add(linkedList.pollLast());
        }
        return reversedLinkedList;

        
    }
    public static int getRandomNumber() { // генерирует случайное число
        double x = (Math.random() * 99);
        int num = (int) x;
        return num;
    }
    
    
}
