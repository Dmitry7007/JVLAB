package lab2;
import  java.util.Scanner;

public class Zadanie_4 {
    public static void main(String[] args) {
        int a;
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число для возведения в квадрат:");
        a = input.nextInt();
        System.out.println("Результат: " + (long)(Math.pow(a,2)));
    }
}
