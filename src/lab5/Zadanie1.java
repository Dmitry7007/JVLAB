package lab5;
import java.util.Scanner;


public class Zadanie1 {
    public static void main(String[] args) {
        System.out.println("Введите цифру");
        byte a = (new Scanner(System.in)).nextByte();
        switch (a) {
            case 0 -> System.out.println("Нуль/ноль");
            case 1 -> System.out.println("Один");
            case 2 -> System.out.println("Два");
            case 3 -> System.out.println("Три");
            case 4 -> System.out.println("Четыре");
            case 5 -> System.out.println("Пять");
            case 6 -> System.out.println("Шесть");
            case 7 -> System.out.println("Семь");
            case 8 -> System.out.println("Восемь");
            case 9 -> System.out.println("Девять");
            default -> System.out.println("Нет такой цифры!");
        }
    }
}
