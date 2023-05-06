package Seminar2.HomeTask;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class HomeTaske1 {
    
    public static void main(String[] args) {
        /*
         * Дана json строка [{ "фамилия":"Иванов","оценка":"5","предмет":"Математика"},
         * {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
         * {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
         * Задача написать метод(ы), который распарсит строку и выдаст ответ вида:
         * Студент Иванов получил 5 по предмету Математика.
         * Студент Петрова получил 4 по предмету Информатика.
         * Студент Краснов получил 5 по предмету Физика.
         * 
         * Используйте StringBuilder для подготовки ответа
         * 
         * Исходная json строка это просто String !!! Для работы используйте методы
         * String, такие как replace, split, substring и т.д. по необходимости
         * 
         * Создать метод, который запишет результат работы в файл. Обработайте
         * исключения и запишите ошибки в лог файл.
         * */
        String stringFromFile = getInfo("Text.jsn");
        System.out.println(stringFromFile);
        String[] array = gluing_strings(jsnparsetoarray(stringFromFile));
        for (int i = 0; i < array.length; i++)
            System.out.println(array[i]);
    }

    public static String getInfo(String file) {
        String lineFromFile = null;
        try {
            FileReader readFile = new FileReader(file);
            BufferedReader reader = new BufferedReader(readFile);
            lineFromFile = reader.readLine();
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lineFromFile;
    }

    private static String[][] jsnparsetoarray(String jsnstr) {
        String line = jsnstr.substring(1, jsnstr.length() - 1);

        String[] jsnarray = line.split(", ");

        String[][] jsnarrayofBase = new String[jsnarray.length][3];
        for (int i = 0; i < jsnarray.length; i++) {
            line = jsnarray[i].substring(1, jsnarray[i].length() - 1);
            for (int j = 0; j < 3; j++) {
                String[] minJsnarray = line.split(",");
                String[] microJsnarray = minJsnarray[j].split(":");
                jsnarrayofBase[i][j] = microJsnarray[1].substring(1, microJsnarray[1].length() - 1);

            }
        }
        return jsnarrayofBase;
    }

    private static String[] gluing_strings(String[][] arraystr) {
        String[] gluing_str = new String[arraystr.length];
        StringBuilder Newstr = new StringBuilder();
        for (int i = 0; i < arraystr.length; i++) {
            Newstr.append("Студент ");
            Newstr.append(arraystr[i][0]);
            Newstr.append(" получил  ");
            Newstr.append(arraystr[i][1]);
            Newstr.append(" по предмету ");
            Newstr.append(arraystr[i][2]);
            gluing_str[i] = Newstr.toString();
            Newstr.delete(0, Newstr.length());
        }
        return gluing_str;
    }

}
