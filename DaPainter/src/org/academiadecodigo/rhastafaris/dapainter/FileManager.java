package org.academiadecodigo.rhastafaris.dapainter;

import java.io.*;

public class FileManager {

    private static final String FILEPATH = "resources/save.txt";


    public static String readFile() {

        String result = "";
        BufferedReader reader = null;

        try {
            String line;
            reader = new BufferedReader(new FileReader(FILEPATH));
            while ((line = reader.readLine()) != null) {
            result += line + "\n";
            }
        }   catch (IOException e){
            System.err.println("error with reading file.");
        }   finally {
            try {
            reader.close();
            }   catch (IOException e){
                e.printStackTrace();
            }
        }
        return result;
    }


    public static void writeFile(String string){
        BufferedWriter writer;

        try {
            writer = new BufferedWriter(new FileWriter(FILEPATH));
            writer.write(string);
            writer.close();
        }   catch (IOException e){
            System.err.println("Error with writeFile process" + e.getMessage());
        }
    }


}
