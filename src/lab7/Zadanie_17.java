package lab7;
import java.util.Scanner;

public class Zadanie_17 {
    public static void main(String[] args) {
        System.out.println("Введите Х: ");
        float x = (new Scanner(System.in)).nextFloat();
        System.out.println(((x-5) < 4.5) && ((x-5) > -4.5));
        System.out.println((x-5) >= 4.5);
    }
}
