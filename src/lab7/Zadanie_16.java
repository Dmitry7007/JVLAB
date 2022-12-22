package lab7;
import java.util.Scanner;

/* 1. Напишите логическое выражение, которое равно true, если число, сохраненное
        в переменной num, находится в диапазоне от 1 до 100 включительно.
   2. Напишите логическое выражение, которое равно true, если число, сохраненное
        в переменной num, находится в диапазоне от 1 до 100 включительно или если
        число является отрицательным.
 */
public class Zadanie_16 {
    public static void main(String[] args) {
        System.out.println("Введите num: ");
        double num = (new Scanner(System.in)).nextDouble();
        System.out.println((1 <= num) && (num <= 100));
        System.out.println( ((1 <= num) && (num <= 100)) || (num < 0));
    }
}
