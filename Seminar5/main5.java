package Seminar5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;

public class main5 {
    public static void main(String[] args) {
        ex0();

    }

    static void ex0(){
        /*
         *  Создать структуру для хранения номеров паспортов и фамилий сотрудников организации:
         * 123456 Иванов
         * 366462 Петров
         * 965556 Сидоров 
         * 569526 Иванов 
         * 955433 Петров
         * 856622 Васильев 
         * Вывести информацию по сотрудникам с фамилией Иванов.
         */
        Passports passports = new Passports();
        passports.add("123456", "Иванов");
        passports.add("366462", "Петров");
        passports.add("965556", "Сидоров ");
        passports.add("569526", "Иванов ");
        passports.add("955433", "Петров");
        passports.add("856622", "Васильев");
        
        System.out.println(passports.getByLastName(" Иванов"));
        
        
    }
    static void ex3(String line){
        /*
        Р’Р·СЏС‚СЊ РЅР°Р±РѕСЂ СЃС‚СЂРѕРє, РЅР°РїСЂРёРјРµСЂ,

        РњРѕСЂРѕР· Рё СЃРѕР»РЅС†Рµ РґРµРЅСЊ С‡СѓРґРµСЃРЅС‹Р№
        Р•С‰Рµ С‚С‹ РґСЂРµРјР»РµС€СЊ РґСЂСѓРі РїСЂРµР»РµСЃС‚РЅС‹Р№
        РџРѕСЂР° РєСЂР°СЃР°РІРёС†Р° РїСЂРѕСЃРЅРёСЃСЊ.

        РќР°РїРёСЃР°С‚СЊ РјРµС‚РѕРґ, РєРѕС‚РѕСЂС‹Р№ РѕС‚СЃРѕСЂС‚РёСЂСѓРµС‚ СЌС‚Рё СЃР»РѕРІР° РїРѕ РґР»РёРЅРµ СЃ РїРѕРјРѕС‰СЊСЋ TreeMap.
        РЎС‚СЂРѕРєРё СЃ РѕРґРёРЅР°РєРѕРІРѕР№ РґР»РёРЅРѕР№ РЅРµ РґРѕР»Р¶РЅС‹ вЂњРїРѕС‚РµСЂСЏС‚СЊСЃСЏвЂќ.
        */
        line = line.replace("\n", " ");
        line = line.replace(".", "");
        String[] words = line.split(" ");
        Map<Integer, List<String>> map = new TreeMap<>(Comparator.reverseOrder());
        for (String word: words){
            int len = word.length();
            if (map.containsKey(len)){
                List<String> list = map.get(len);
                list.add(word);
            } else {
                List<String> list = new ArrayList<>();
                list.add(word);
                map.put(len, list);
            }
        }
        System.out.println(map);
    }
    static boolean ex2(String line){
        /*
        РќР°РїРёСЃР°С‚СЊ РїСЂРѕРіСЂР°РјРјСѓ, РѕРїСЂРµРґРµР»СЏСЋС‰СѓСЋ РїСЂР°РІРёР»СЊРЅРѕСЃС‚СЊ СЂР°СЃСЃС‚Р°РЅРѕРІРєРё СЃРєРѕР±РѕРє РІ РІС‹СЂР°Р¶РµРЅРёРё.
        РџСЂРёРјРµСЂ 1: a+(d*3) - РёСЃС‚РёРЅР°
        РџСЂРёРјРµСЂ 2: [a+(1]*3) - Р»РѕР¶СЊ
        РџСЂРёРјРµСЂ 3: [6+(3*3)] - РёСЃС‚РёРЅР°
        РџСЂРёРјРµСЂ 4: {a}[+]{(d*3)} - РёСЃС‚РёРЅР°
        РџСЂРёРјРµСЂ 5: <{a}+{(d*3)}> - РёСЃС‚РёРЅР°
        РџСЂРёРјРµСЂ 6: {a+]}{(d*3)} - Р»РѕР¶СЊ
        */
        Stack<Character> stack = new Stack<>();
        char[] c1 = line.toCharArray();
        Map<Character, Character> map = new HashMap<>();
        map.put('(',')');
        map.put('[',']');
        map.put('{','}');
        map.put('<','>');

        for (char c : c1) {
            if (map.containsKey(c)) {
                stack.push(c);
            }
            if (map.containsValue(c)) {
                if (stack.isEmpty() || map.get(stack.pop()) != c) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    static boolean ex2_2(String line){
        Stack<Character> stack = new Stack<>();
        char[] c1 = line.toCharArray();
        Map<Character, Character> map = new HashMap<>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');
        map.put('>','<');

        for (int i = 0; i < c1.length; i++) {
            if (map.containsValue(c1[i])){
                stack.push(c1[i]);
            }
            if (map.containsKey(c1[i])){
                if (stack.isEmpty() || map.get(c1[i]) != stack.pop()){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    static boolean ex1(String s1, String s2){
        /*
        Р”Р°РЅС‹ 2 СЃС‚СЂРѕРєРё, РЅР°РїРёСЃР°С‚СЊ РјРµС‚РѕРґ, РєРѕС‚РѕСЂС‹Р№ РІРµСЂРЅРµС‚ true, РµСЃР»Рё СЌС‚Рё СЃС‚СЂРѕРєРё СЏРІР»СЏСЋС‚СЃСЏ РёР·РѕРјРѕСЂС„РЅС‹РјРё Рё false, РµСЃР»Рё РЅРµС‚.
        РЎС‚СЂРѕРєРё РёР·РѕРјРѕСЂС„РЅС‹, РµСЃР»Рё РѕРґРЅСѓ Р±СѓРєРІСѓ РІ РїРµСЂРІРѕРј СЃР»РѕРІРµ РјРѕР¶РЅРѕ Р·Р°РјРµРЅРёС‚СЊ РЅР° РЅРµРєРѕС‚РѕСЂСѓСЋ Р±СѓРєРІСѓ РІРѕ РІС‚РѕСЂРѕРј СЃР»РѕРІРµ, РїСЂРё СЌС‚РѕРј
        РїРѕРІС‚РѕСЂСЏСЋС‰РёРµСЃСЏ Р±СѓРєРІС‹ РѕРґРЅРѕРіРѕ СЃР»РѕРІР° РјРµРЅСЏСЋС‚СЃСЏ РЅР° РѕРґРЅСѓ Рё С‚Сѓ Р¶Рµ Р±СѓРєРІСѓ СЃ СЃРѕС…СЂР°РЅРµРЅРёРµРј РїРѕСЂСЏРґРєР° СЃР»РµРґРѕРІР°РЅРёСЏ.
        (РќР°РїСЂРёРјРµСЂ, add - egg РёР·РѕРјРѕСЂС„РЅС‹)
        Р±СѓРєРІР° РјРѕР¶РµС‚ РЅРµ РјРµРЅСЏС‚СЊСЃСЏ, Р° РѕСЃС‚Р°С‚СЊСЃСЏ С‚Р°РєРѕР№ Р¶Рµ. (РќР°РїСЂРёРјРµСЂ, note - code)
        РџСЂРёРјРµСЂ 1:
        Input: s = "foo", t = "bar"
        Output: false
        РџСЂРёРјРµСЂ 2:
        Input: s = "paper", t = "title"
        Output: true
         */
        //p=t
        //a=i
        //e=l
        //r=e

        //foo    bar
        //f=b
        //o=a
        if (s1.length() != s2.length()){
            return false;
        }
        Map<Character, Character> map = new HashMap<>();
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        for (int i = 0; i < c1.length; i++) {
            if (map.containsKey(c1[i])){
                if (c2[i] != map.get(c1[i])){
                    return false;
                }
            } else {
                map.put(c1[i], c2[i]);
            }
        }
        return true;
}
