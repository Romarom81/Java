package Seminar2.HomeTask;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class HomeTask2 {
    public static void main(String[] args) {
        /*
         * 2. *Получить исходную json строку из файла, используя FileReader или Scanner
          */
        String line = getLineJson("Text.jsn");
        System.out.println(line);
        
    }
    static String getLineJson ( String nameFile) {
        String lineFromJson = null;
        try {
            File file = new File(nameFile);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while((line = br.readLine()) != null){
                //обрабатываем считанную строку - пишем ее в консоль
                System.out.println(line);
            }
            br.close();
            fr.close();
            } catch (FileNotFoundException e) {
            e.printStackTrace();
            } catch (IOException e) {
            e.printStackTrace();
            }
            return lineFromJson;
            

        
    }

}
