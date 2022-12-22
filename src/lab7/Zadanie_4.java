package lab7;
import java.util.Scanner;

// Напишите предложение if, которое присваивает переменной x значение 1, если y больше 0.

public class Zadanie_4 {
    public static void main(String[] args) {
        double x = 0;
        System.out.println("Введите Y: ");
        double y = (new Scanner(System.in)).nextDouble();
        if (y>0) {
            x = 1;
        }
        System.out.println("x = " + x);
    }
}
