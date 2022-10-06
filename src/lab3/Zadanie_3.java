package lab3;
import java.util.Scanner;

public class Zadanie_3 {
    public static void main(String[] args) {
        double a, b = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        a = input.nextDouble();
        System.out.println("Введите второе число: ");
        b = input.nextDouble();
        System.out.println("Сумма: " + (a + b) + "\nРазность (1-е минус 2-е): " + (a-b) + "\nРазность (2-е минус 1-е): " + (b-a) + "\nПроизведение: " + (a*b));
    }
}
