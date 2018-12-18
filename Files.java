package ru.mirea.lab.klenina.lab8;

import java.io.File;
import java.io.IOException;

public class Files {
    public static void main(String[] args) {

        String sourceDirName = "txt";
        String fileName = "File_path-java";
        String mainFilePath = sourceDirName + File.separator + fileName + File.separatorChar;

        System.out.println(mainFilePath + "_________String a = b + File.separator " +
                "+ c + File.separatorChar");

        File someFile = new File("/Users/macbokpro/Library/Mobile Documents/" +
                "com~apple~TextEdit/Documents/File_path-java.txt");

        System.out.println("Файл сущ-ет? " + someFile.exists());
        System.out.println("Это файл? " + someFile.isFile());
        System.out.println("Это директория? " + someFile.isDirectory());
        System.out.println("Размер файла: " + someFile.length());
        System.out.println("Последняя модификация файла: " + someFile.lastModified());
        System.out.println(someFile.list());
        System.out.println(someFile.listFiles());
        //System.out.println("Файл существует");

        File unrealFile = new File("/User/makbokpro/someFile.txt");

        System.out.println("\nФайл сущ-ет? " + unrealFile.exists());
        System.out.println("Это файл? " + unrealFile.isFile());
        System.out.println("Это директория? " + unrealFile.isDirectory());
        System.out.println("Размер файла: " + unrealFile.length());
        System.out.println("Последняя модификация файла: " + unrealFile.lastModified());
        System.out.println(unrealFile.list());
        System.out.println(unrealFile.listFiles());

        try{
            boolean success = someFile.createNewFile();
        } catch (IOException e){
            System.out.println(e.getMessage());
        }

        boolean success = someFile.renameTo(unrealFile);

        System.out.println("\nИмя  файла: " + someFile);

    }
}
