package lab7;
import java.util.Scanner;

// Напишите предложение if, которое увеличивает pay на 3%, если score больше 90.
public class Zadanie_5 {
    public static void main(String[] args) {
        double pay = 10;
        System.out.println("Введите score: ");
        double score = (new Scanner(System.in)).nextDouble();
        if (score>90) {
            pay += pay*3/100;
        }
        System.out.println("pay = " + pay);
    }
}
