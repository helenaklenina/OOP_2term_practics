package ru.mirea.lab.klenina.lab1;

import java.lang.System;
import java.util.Scanner;


public class Lab1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("what variant do you want? 1-for, 2-while, 3-do,while 4-harmonic ryad, 5-factorial");

        int variant = sc.nextInt();
        int sum = 0;
        int i;
        if (variant == 1 || variant == 2 || variant == 3) {
            System.out.println("enter the symbol(s)");
            String s1 = sc.next();
            switch (variant) {
                case 1:
                    variant = 1;
                    for (i = 0; i <= s1.length(); i++) {
                        sum = sum + i;
                    }
                    break;
                case 2:
                    variant = 2;
                    i = 0;
                    while (i <= s1.length()) {
                        sum = sum + i;
                        i++;
                    }
                    break;
                case 3:
                    variant = 3;
                    i = 0;
                    do {
                        sum = sum + i;
                        i++;
                    } while (i <= s1.length());
                    break;
            }
            System.out.print(sum);
        }
        double k = 1.0;
        if (variant == 4) {
            for (i = 1; i < 10; i++) {
                k = 1 / i;
                System.out.println(k);
            }
        }
        if (variant == 5) {
            System.out.println("enter the symbol(s)");
            int s2 = sc.nextInt();
            for (i = 1; i <= s2; i++) {
                k = i * k;
            }
            System.out.println(k);
        }
    }
}
