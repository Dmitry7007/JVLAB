package lab7;

/*
Эквиваленты ли следующие выражения:
(x > 0 && x < 10) и ((x > 0) && (x < 10))
(x > 0 || x < 10) и ((x > 0) || (x < 10))
(x > 0 || x < 10 && y < 0) и (x > 0 || (x < 10 && y < 0))
 */

import java.util.Scanner;

public class Zadanie_27 {
    public static void main(String[] args) {
        System.out.println("Введите x: ");
        float x = (new Scanner(System.in)).nextFloat();
        System.out.println("Введите y: ");
        float y = (new Scanner(System.in)).nextFloat();

        System.out.println(x > 0 && x < 10);
        System.out.println((x > 0) && (x < 10));

        System.out.println(x > 0 || x < 10);
        System.out.println((x > 0) || (x < 10));

        System.out.println(x > 0 || x < 10 && y < 0);
        System.out.println(x > 0 || (x < 10 && y < 0));
    }
}
