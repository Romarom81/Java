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
        1) РќР°РїРёСЃР°С‚СЊ РјРµС‚РѕРґ, РєРѕС‚РѕСЂС‹Р№ РїСЂРёРЅРёРјР°РµС‚ РјР°СЃСЃРёРІ СЌР»РµРјРµРЅС‚РѕРІ, РїРѕРјРµС‰Р°РµС‚ РёС… РІ СЃС‚СЌРє Рё РІС‹РІРѕРґРёС‚ РЅР° РєРѕРЅСЃРѕР»СЊ СЃРѕРґРµСЂР¶РёРјРѕРµ СЃС‚СЌРєР°.
        2) РќР°РїРёСЃР°С‚СЊ РјРµС‚РѕРґ, РєРѕС‚РѕСЂС‹Р№ РїСЂРёРЅРёРјР°РµС‚ РјР°СЃСЃРёРІ СЌР»РµРјРµРЅС‚РѕРІ, РїРѕРјРµС‰Р°РµС‚ РёС… РІ РѕС‡РµСЂРµРґСЊ Рё РІС‹РІРѕРґРёС‚ РЅР° РєРѕРЅСЃРѕР»СЊ СЃРѕРґРµСЂР¶РёРјРѕРµ РѕС‡РµСЂРµРґРё.
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
        Р РµР°Р»РёР·РѕРІР°С‚СЊ РєРѕРЅСЃРѕР»СЊРЅРѕРµ РїСЂРёР»РѕР¶РµРЅРёРµ, РєРѕС‚РѕСЂРѕРµ:
        РџСЂРёРЅРёРјР°РµС‚ РѕС‚ РїРѕР»СЊР·РѕРІР°С‚РµР»СЏ Рё вЂњР·Р°РїРѕРјРёРЅР°РµС‚вЂќ СЃС‚СЂРѕРєРё.
        Р•СЃР»Рё РІРІРµРґРµРЅРѕ print, РІС‹РІРѕРґРёС‚ СЃС‚СЂРѕРєРё С‚Р°Рє, С‡С‚РѕР±С‹ РїРѕСЃР»РµРґРЅСЏСЏ РІРІРµРґРµРЅРЅР°СЏ Р±С‹Р»Р° РїРµСЂРІРѕР№ РІ СЃРїРёСЃРєРµ, Р° РїРµСЂРІР°СЏ - РїРѕСЃР»РµРґРЅРµР№.
        Р•СЃР»Рё РІРІРµРґРµРЅРѕ revert, СѓРґР°Р»СЏРµС‚ РїСЂРµРґС‹РґСѓС‰СѓСЋ РІРІРµРґРµРЅРЅСѓСЋ СЃС‚СЂРѕРєСѓ РёР· РїР°РјСЏС‚Рё.
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
        Р РµР°Р»РёР·РѕРІР°С‚СЊ РєРѕРЅСЃРѕР»СЊРЅРѕРµ РїСЂРёР»РѕР¶РµРЅРёРµ, РєРѕС‚РѕСЂРѕРµ:
        РџСЂРёРЅРёРјР°РµС‚ РѕС‚ РїРѕР»СЊР·РѕРІР°С‚РµР»СЏ СЃС‚СЂРѕРєСѓ РІРёРґР°
        text~num
        РќСѓР¶РЅРѕ СЂР°СЃСЃРїР»РёС‚РёС‚СЊ СЃС‚СЂРѕРєСѓ РїРѕ ~, СЃРѕС…СЂР°РЅРёС‚СЊ text РІ СЃРІСЏР·РЅС‹Р№ СЃРїРёСЃРѕРє РЅР° РїРѕР·РёС†РёСЋ num.
        Р•СЃР»Рё РІРІРµРґРµРЅРѕ print~num, РІС‹РІРѕРґРёС‚ СЃС‚СЂРѕРєСѓ РёР· РїРѕР·РёС†РёРё num РІ СЃРІСЏР·РЅРѕРј СЃРїРёСЃРєРµ Рё СѓРґР°Р»СЏРµС‚ РµС‘ РёР· СЃРїРёСЃРєР°.
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
        1) Р—Р°РјРµСЂСЊС‚Рµ РІСЂРµРјСЏ, Р·Р° РєРѕС‚РѕСЂРѕРµ РІ ArrayList РґРѕР±Р°РІСЏС‚СЃСЏ 10000 СЌР»РµРјРµРЅС‚РѕРІ.
        2) Р—Р°РјРµСЂСЊС‚Рµ РІСЂРµРјСЏ, Р·Р° РєРѕС‚РѕСЂРѕРµ РІ LinkedList РґРѕР±Р°РІСЏС‚СЃСЏ 10000 СЌР»РµРјРµРЅС‚РѕРІ. РЎСЂР°РІРЅРёС‚Рµ СЃ РїСЂРµРґС‹РґСѓС‰РёРј.
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
