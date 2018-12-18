package ru.mirea.lab.klenina.lab8;

import java.io.*;

public class Metodichka {
    public static void main(String[] args) {

        File file = new File("/Users/macbokpro/Library/Mobile Documents/" +
                "com~apple~TextEdit/Documents/File_path-java.txt");

        try(FileWriter writer = new FileWriter("/Users/macbokpro/Library/Mobile Documents/" +
                "com~apple~TextEdit/Documents/File_path-java.txt", false)) {

            // запись всей строки
            String text = "Мама мыла раму, раму мыла мама";
            writer.write(text); // запись по символам

            writer.append('\n');
            writer.append('E');
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }

        System.out.println("Это Деректория?" + (file.isDirectory() ? "yep" : "nope"));
        System.out.println("File Name: " + file.getName());

        try(FileReader reader = new FileReader("/Users/macbokpro/Library/Mobile Documents/" +
                "com~apple~TextEdit/Documents/File_path-java.txt")) {



            int element; // for each symbols
            while ((element = reader.read()) != -1) {
                System.out.print((char)element);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //file.delete();
    }
}

