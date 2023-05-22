package Seminar6;
import java.util.*;

public class main6 {
    public static void main(String[] args) {
        Cat cat1 = new Cat("РњСѓСЂР·РёРє", "РњРµР№РЅРєСѓРЅ", 10, "Р’Р°СЃРёР»РёР№ РџРµС‚СЂРѕРІРёС‡");
        Cat cat2 = new Cat("Р’Р°СЃСЊРєР°", "РџРµСЂСЃРёРґСЃРєР°СЏ", 8, "РРІР°РЅ");
        Cat cat3 = new Cat("Р’Р°СЃСЊРєР°", "РџРµСЂСЃРёРґСЃРєР°СЏ", 8, "РРІР°РЅ");
        Cat cat4 = new Cat("РЎС‚РµРїРєР°", "РќРµРёР·РІРµСЃС‚РЅР°", 8, "РЎРІРµС‚Р»Р°РЅР°");
//        System.out.println(cat1);
//        System.out.println(cat2);
//        System.out.println(cat3);

        Set<Cat> cats = new HashSet<>();
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        cats.add(cat4);
//        for (Cat cat: cats){
//            System.out.println(cat);
//        }
        for (Cat cat: cats){
            if (cat.getAge() == 8){
                System.out.println(cat);
            }
        }
    }

    static void ex1(){
        /*
        1. РќР°РїРёС€РёС‚Рµ РјРµС‚РѕРґ, РєРѕС‚РѕСЂС‹Р№ Р·Р°РїРѕР»РЅРёС‚ РјР°СЃСЃРёРІ РёР· 1000 СЌР»РµРјРµРЅС‚РѕРІ СЃР»СѓС‡Р°Р№РЅС‹РјРё С†РёС„СЂР°РјРё РѕС‚ 0 РґРѕ 24.
        2. РЎРѕР·РґР°Р№С‚Рµ РјРµС‚РѕРґ, РІ РєРѕС‚РѕСЂС‹Р№ РїРµСЂРµРґР°Р№С‚Рµ Р·Р°РїРѕР»РЅРµРЅРЅС‹Р№ РІС‹С€Рµ РјР°СЃСЃРёРІ Рё СЃ РїРѕРјРѕС‰СЊСЋ Set РІС‹С‡РёСЃР»РёС‚Рµ
        РїСЂРѕС†РµРЅС‚ СѓРЅРёРєР°Р»СЊРЅС‹С… Р·РЅР°С‡РµРЅРёР№ РІ РґР°РЅРЅРѕРј РјР°СЃСЃРёРІРµ Рё РІРµСЂРЅРёС‚Рµ РµРіРѕ РІ РІРёРґРµ С‡РёСЃР»Р° СЃ РїР»Р°РІР°СЋС‰РµР№ Р·Р°РїСЏС‚РѕР№.
        Р”Р»СЏ РІС‹С‡РёСЃР»РµРЅРёСЏ РїСЂРѕС†РµРЅС‚Р° РёСЃРїРѕР»СЊР·СѓР№С‚Рµ С„РѕСЂРјСѓР»Сѓ:
        РїСЂРѕС†РµРЅС‚ СѓРЅРёРєР°Р»СЊРЅС‹С… С‡РёСЃРµР» = РєРѕР»РёС‡РµСЃС‚РІРѕ СѓРЅРёРєР°Р»СЊРЅС‹С… С‡РёСЃРµР» * 100 / РѕР±С‰РµРµ РєРѕР»РёС‡РµСЃС‚РІРѕ С‡РёСЃРµР» РІ РјР°СЃСЃРёРІРµ.
         */
        Integer[] arr = createArray(1000, 0, 24);
        System.out.println(Arrays.toString(arr));
        double unicPercent = unicPercent(arr);
        System.out.println("РџСЂРѕС†РµРЅС‚ СѓРЅРёРєР°Р»СЊРЅРѕСЃС‚Рё СЂР°РІРµРЅ = " + unicPercent);
    }
    static double unicPercent(Integer[] arr){
        Set<Integer> set = new HashSet<>(Arrays.asList(arr));
        double unicPercent = set.size() * 100.0 / arr.length;
        return unicPercent;
    }
    static Integer[] createArray(int capacity, int min, int max){
        Integer[] arr = new Integer[capacity];
        for (int i = 0; i < capacity; i++) {
            arr[i] = (int)(Math.random() * (max - min + 1) + min);
        }
        return arr;
    }
    static void ex0(){
        /*
        1. РЎРѕР·РґР°Р№С‚Рµ HashSet, Р·Р°РїРѕР»РЅРёС‚Рµ РµРіРѕ СЃР»РµРґСѓСЋС‰РёРјРё С‡РёСЃР»Р°РјРё: {1, 2, 3, 2, 4, 5, 6, 3}.
        Р Р°СЃРїРµС‡Р°С‚Р°Р№С‚Рµ СЃРѕРґРµСЂР¶РёРјРѕРµ РґР°РЅРЅРѕРіРѕ РјРЅРѕР¶РµСЃС‚РІР°.
        2. РЎРѕР·РґР°Р№С‚Рµ LinkedHashSet, Р·Р°РїРѕР»РЅРёС‚Рµ РµРіРѕ СЃР»РµРґСѓСЋС‰РёРјРё С‡РёСЃР»Р°РјРё: {1, 2, 3, 2, 4, 5, 6, 3}.
        Р Р°СЃРїРµС‡Р°С‚Р°Р№С‚Рµ СЃРѕРґРµСЂР¶РёРјРѕРµ РґР°РЅРЅРѕРіРѕ РјРЅРѕР¶РµСЃС‚РІР°.
        3. РЎРѕР·РґР°Р№С‚Рµ TreeSet, Р·Р°РїРѕР»РЅРёС‚Рµ РµРіРѕ СЃР»РµРґСѓСЋС‰РёРјРё С‡РёСЃР»Р°РјРё: {1, 2, 3, 2, 4, 5, 6, 3}.
        Р Р°СЃРїРµС‡Р°С‚Р°Р№С‚Рµ СЃРѕРґРµСЂР¶РёРјРѕРµ РґР°РЅРЅРѕРіРѕ РјРЅРѕР¶РµСЃС‚РІР°.
         */
        Integer[] arr = new Integer[]{3, 2, 6, 1, 2, 4, 5, 3};
        Set<Integer> set1 = new HashSet<>(Arrays.asList(arr));
        Set<Integer> set2 = new LinkedHashSet<>(Arrays.asList(arr));
        Set<Integer> set3 = new TreeSet<>(Arrays.asList(arr));
        System.out.println(set1);
        System.out.println(set2);
        System.out.println(set3);
    }
}