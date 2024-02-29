package excersises.chapter8;

import java.io.FileWriter;
import java.io.IOException;

public class Uebung1 {
    public static void main(String[] args) {

        FileWriter datei = null;

        try {
            String text;
            datei = new FileWriter("ausgabe.txt");
            text = "1\n";
            for (int i = 2; i <= 100; i++) {
                text += i;
                text += "\n";
            }

            datei.write(text, 0, text.length());
            datei.flush();

        }catch(IOException e){
            System.out.println("Hat nicht geklappt.");
            return;

        }finally{
            try {
                datei.close();
            }catch(IOException e){

            }
        }

        // ARM (Automatic-Ressource-Management --> try-with-Ressource)
        try(FileWriter datei2 = new FileWriter("ausgabe2.txt")){
            String text;

            text = "1\n";
            for (int i = 2; i <= 100; i++) {
                text += i;
                text += "\n";
            }

            datei2.write(text, 0, text.length());
            datei2.flush();
        }catch(IOException e){
            System.out.println("Hat nicht geklappt!");
        }

        System.out.println("Ende");
    }
}
