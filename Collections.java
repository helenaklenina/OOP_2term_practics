package ru.mirea.lab.klenina.lab7;
import java.util.ArrayList;
import java.lang.*;
//Коллекции (аналогично векторам) для реализации стеков, очередей, деревьев и др

public class Collections {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<String>(10);

        myList.add("first element");
        myList.add("second element");
        myList.add(2, "third element");
        myList.add(3,"fourth element");
        myList.add(4,"");


        int smth = 0;

        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i) == "") System.out.println("Nothing\n");
            else System.out.println(myList.get(i));
        }

        System.out.printf("В списке %d элементов \n", myList.size());
        for (String otherList : myList) {
            System.out.println(otherList);
        }

        if (myList.contains("")) { System.out.println("Still nothing here");
            myList.remove(0);

            Object[] elements = myList.toArray();
            for (Object element : elements) {
                System.out.println(element);

            }
        }
    }
}

