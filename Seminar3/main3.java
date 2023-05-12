package Seminar3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class main3 {
    public static void main(String[] args) {
        ex3();
    }

    static void ex3(){
        /*
        РљР°С‚Р°Р»РѕРі С‚РѕРІР°СЂРѕРІ РєРЅРёР¶РЅРѕРіРѕ РјР°РіР°Р·РёРЅР° СЃРѕС…СЂР°РЅРµРЅ РІ РІРёРґРµ РґРІСѓРјРµСЂРЅРѕРіРѕ СЃРїРёСЃРєР° List<ArrayList<String>> С‚Р°Рє,
        С‡С‚Рѕ РЅР° 0Р№ РїРѕР·РёС†РёРё РєР°Р¶РґРѕРіРѕ РІРЅСѓС‚СЂРµРЅРЅРµРіРѕ СЃРїРёСЃРєР° СЃРѕРґРµСЂР¶РёС‚СЃСЏ РЅР°Р·РІР°РЅРёРµ Р¶Р°РЅСЂР°,
        Р° РЅР° РѕСЃС‚Р°Р»СЊРЅС‹С… РїРѕР·РёС†РёСЏС… - РЅР°Р·РІР°РЅРёСЏ РєРЅРёРі. РќР°РїРёС€РёС‚Рµ РјРµС‚РѕРґ РґР»СЏ Р·Р°РїРѕР»РЅРµРЅРёСЏ РґР°РЅРЅРѕР№ СЃС‚СЂСѓРєС‚СѓСЂС‹.
         */

        //С„Р°РЅС‚Р°СЃС‚РёРєР°, РіР°СЂСЂРё РїРѕС‚С‚РµСЂ, РЅРѕС‡РЅРѕР№ РґРѕР·РѕСЂ
        //СЂРѕРјР°РЅ, РІРѕР№РЅР° Рё РјРёСЂ
        //СЃРєР°Р·РєРё, СЂРµРїРєР°, РєРѕР»РѕР±РѕРє
        List<List<String>> shopBook = new ArrayList<>();
        addBook(shopBook, "С„РµРЅС‚РµР·Рё", "РіР°СЂСЂРё РїРѕС‚С‚РµСЂ");
        addBook(shopBook, "СЃРєР°Р·РєРё", "СЂРµРїРєР°");
        addBook(shopBook, "С„РµРЅС‚РµР·Рё", "РЅРѕС‡РЅРѕР№ РґРѕР·РѕСЂ");
        addBook(shopBook, "СЂРѕРјР°РЅ", "РІРѕР№РЅР° Рё РјРёСЂ");
        addBook(shopBook, "СЃРєР°Р·РєРё", "РєРѕР»РѕР±РѕРє");
        System.out.println(shopBook);
    }
    static void addBook(List<List<String>> shopBook, String genre, String name){
        for (int i = 0; i < shopBook.size(); i++) {
            if (shopBook.get(i).get(0).equalsIgnoreCase(genre)){
                shopBook.get(i).add(name);
                return;
            }
        }
        List<String> list = new ArrayList<>();
        list.add(genre);
        list.add(name);
        shopBook.add(list);
    }
    static void ex2(){
        /*
        РЎРѕР·РґР°С‚СЊ СЃРїРёСЃРѕРє С‚РёРїР° ArrayList
        РџРѕРјРµСЃС‚РёС‚СЊ РІ РЅРµРіРѕ РєР°Рє СЃС‚СЂРѕРєРё, С‚Р°Рє Рё С†РµР»С‹Рµ С‡РёСЃР»Р°.
        РџСЂРѕР№С‚Рё РїРѕ СЃРїРёСЃРєСѓ, РЅР°Р№С‚Рё Рё СѓРґР°Р»РёС‚СЊ С†РµР»С‹Рµ С‡РёСЃР»Р°.
         */
        List list = new ArrayList();
        list.add(4);
        list.add("15");
        list.add("РїСЂРёРІРµС‚");
        list.add("РїСЂРёРІРµС‚");
        list.add(77);
        list.add(5);
        list.add(4.5);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Integer){
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);
//        Iterator iterator = list.iterator();
//        while (iterator.hasNext()){
//            Object o = iterator.next();
//            if (o instanceof Integer){
//                iterator.remove();
//            }
//        }
    }
    static void ex1(){
        /*
        
         */
        List<Integer> list = createList(10, 4, 10);
        System.out.println(list);
        sort(list);
        System.out.println(list);
    }
    static List<Integer> createList(int size, int min, int max){
        List<Integer> list = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            list.add((int)(Math.random() * (max - min + 1) + min));
        }
        return list;
    }
    static void sort(List<Integer> list){
        Collections.sort(list, Comparator.reverseOrder());
    }
    static void ex0(){
        
        String s1 = "hello";
        String s2 = "hello";
        String s3 = s1;
        String s4 = "h" + "e" + "l" + "l" + "o";
        String s5 = new String("hello");
        String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});

        System.out.println(s1.equals(s2));
    }
    static void readFile(){
        File file = new File("test.txt");
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String res = "";
        while (scanner.hasNext()){
            res += scanner.nextLine() + "\n";
        }
        System.out.println(res);
    }
    }
    
}
