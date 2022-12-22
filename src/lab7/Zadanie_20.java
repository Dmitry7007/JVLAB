package lab7;

/*
Напишите логические выражения, которые равны true, если:
- age больше 13 и меньше 18;
- weight больше 23 кг или height больше 152 см;
- weight больше 23 кг или height больше 152 см, но не одновременно.
 */

import java.util.Scanner;

public class Zadanie_20 {
    public static void main(String[] args) {
        System.out.println("Введите age: ");
        int age = (new Scanner(System.in)).nextInt();

        System.out.println("Введите weight: ");
        int weight = (new Scanner(System.in)).nextInt();

        System.out.println("Введите height: ");
        int height = (new Scanner(System.in)).nextInt();

        System.out.println(age > 13 && age < 18);
        System.out.println(weight > 23 || height > 152);
        System.out.println((weight > 23) ^ (height > 152));
    }
}
