package lab7;

import java.util.Scanner;

/*
Перепишите следующие предложения с помощью предложений if-else:
  score = (x > 10) ? 3 * scale : 4 * scale;
  tax = (income > 10000) ? income * 0.2 : income * 0.17 + 1000;
  System.out.println((number % 3 == 0) ? i : j);
 */
public class Zadanie_24 {
    public static void main(String[] args) {
        float score, tax;
        System.out.println("Введите scale: ");
        float scale = (new Scanner(System.in)).nextFloat();
        System.out.println("Введите x: ");
        float x = (new Scanner(System.in)).nextFloat();
        System.out.println("Введите income: ");
        float income = (new Scanner(System.in)).nextFloat();
        System.out.println("Введите number: ");
        float number = (new Scanner(System.in)).nextFloat();

        if (x>10) score = 3 * scale;
        else score = 4 * scale;
        System.out.println("score: " + score);

        if (income > 1000) tax = income * 0.2f;
        else  tax = income * 0.17f + 1000;
        System.out.println("tax: " + tax);

        if (number % 3 == 0) System.out.println('i');
        else System.out.println('j');

    }
}
