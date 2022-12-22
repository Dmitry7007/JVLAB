package lab7;

import java.util.Scanner;

public class Zadanie_13 {
    public static void main(String[] args) {
        System.out.println("Введите number: ");
        byte number = (new Scanner(System.in)).nextByte();

        System.out.println("Первый вариант: ");
        if (number % 2 == 0)
            System.out.println
                    (number + " четное");
        if (number % 5 == 0)
            System.out.println
                    (number + " кратно 5");

        System.out.println("Второй вариант: ");
        if (number % 2 == 0)
            System.out.println
                    (number + " четное");
        else if (number % 5 == 0)
            System.out.println
                    (number + " кратно 5");
    }
}
