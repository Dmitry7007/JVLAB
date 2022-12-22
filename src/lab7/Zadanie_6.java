package lab7;
import java.util.Scanner;

// Напишите предложение if, которое реализует следующую блок-схему:

public class Zadanie_6 {
    public static void main(String[] args) {
        double product = 0;
        System.out.println("Введите Х: ");
        double x = (new Scanner(System.in)).nextDouble();
        if (x!=0){
            product *= x;
        }
        System.out.println("product = " + product);
    }
}
