package Seminar4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class main4 {
    public static void main(String[] args) {
       ex4(); 
    }
    static void ex4(){
        MyStack stack = new MyStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.empty());
        System.out.println("РєРѕР»РёС‡РµСЃС‚РІРѕ СЌР»РµРјРµРЅС‚РѕРІ РІ СЃС‚РµРєРµ: " + stack.size());
        System.out.println(stack.pop());
    }
    static void ex3(){
        /*
        1) Написать метод, который принимает массив элементов , 
        добавляет их в стэк и выводит на консоль содержимое стэка.
        2) Написать метод, который принимает массив элементов , 
        добавляет их в очередь и выводит на консоль содержимое очереди.
         */
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
        System.out.println();

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i < 5; i++) {
            queue.add(i);
        }
        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
    static void ex2(){
        /*
        Реализовать консольное приложение, которое принимает от пользователя
        строку и запоминает её.
        Если вводится print  то выводит так, чтобы последняя введенная была первой в списке, 
        а вторая - последней.
        если введено revert , то удаляет последнюю введённую строку из памяти. 
        */
        LinkedList<String> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        boolean work = true;
        while (work){
            System.out.println("Р’РІРµРґРёС‚Рµ РєРѕРјР°РЅРґСѓ: ");
            String line = scanner.nextLine();
            switch (line){
                case "print":
                    ListIterator<String> iterator = list.listIterator(list.size());
                    while (iterator.hasPrevious()){
                        System.out.println(iterator.previous());
                    }
                    break;
                case "revert":
                    list.removeLast();
                    break;
                case "exit":
                    System.out.println("Р”Рѕ СЃРєРѕСЂРѕР№ РІСЃС‚СЂРµС‡Рё!");
                    work = false;
                    break;
                default:
                    list.add(line);
            }
            System.out.println();
        }
    }
    static void ex1(){
        /*
        Реализовать консольное приложение, которое принимает от пользователя
        строку вида text~num
        нужно распилить строку по ~ и сохранить text в связанный список на позицию num.
        Если введено print~num, выводит строку из позиции num связанного списка и удаляет её
         */
        
        List<String> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        boolean work = true;
        while (work){
            System.out.println("Р’РІРµРґРёС‚Рµ РєРѕРјР°РЅРґСѓ: ");
            String line = scanner.nextLine();
            String[] arr = line.split("~");
            int num = Integer.parseInt(arr[1]);
            String text = arr[0];

            switch (text){
                case "print":
                    System.out.println(list.remove(num));
                    break;
                case "exit":
                    System.out.println("Р”Рѕ СЃРєРѕСЂРѕР№ РІСЃС‚СЂРµС‡Рё!");
                    work = false;
                    break;
                default:
                    list.add(num, text);
            }
            System.out.println();
        }
    }
    static void ex0(){
        /*
        1) замерить время , за которое добавляются элементы в ArrayList добавяться 10000 элементов.
        2) замерить время , за которое добавляются элементы в LinkedList  добавяться 10000 элементов.
         Сравините с предыдущим.
         */
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();
        long timeStart = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list1.add(0, i);
        }
        long timeFinish = System.currentTimeMillis();
        System.out.println(timeFinish - timeStart);
    }
    
}
