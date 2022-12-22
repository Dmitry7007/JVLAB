package lab7;
import java.util.Scanner;

/*
Перепишите следующее предложение с помощью условного оператора.
if (ages >= 16)
ticketPrice = 20;
else
ticketPrice = 10;
 */
public class Zadanie_23 {
    public static void main(String[] args) {
        byte ticketPrice;
        System.out.println("Введите ages: ");
        byte ages = (new Scanner(System.in)).nextByte();
        System.out.println((ages >= 16) ? (ticketPrice = 20) : (ticketPrice = 10));
    }
}
