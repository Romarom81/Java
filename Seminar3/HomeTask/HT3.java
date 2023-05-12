package Seminar3.HomeTask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class HT3 {
    public static void main(String[] args) {
        /*
         * Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями. 
         * Вывести название каждой планеты и количество его повторений в списке.
         */
        String[] planets = new String[] {"Меркурий", "Венера", "Меркурий","Земля", "Марс","Меркурий", "Юпитер", "Сатурн","Марс", "Уран","Марс", "Нептун"};
        Random rnd = new Random();
        ArrayList <String> str = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            str.add(planets[rnd.nextInt(8)]);
        }
        System.out.println(str);
        Set <String> mySet = new HashSet<String>(str);
        for (String string : mySet) {
            System.out.println(string + " " + Collections.frequency(str, string));
        } 
        

    }
    
}
