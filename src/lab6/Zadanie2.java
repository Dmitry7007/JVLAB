package lab6;
import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        int amount, numberOf5000Roubles, numberOf2000Roubles, numberOf1000Roubles, numberOf500Roubles, numberOf100Roubles, numberOf200Roubles, numberOf50Roubles;
        System.out.println("Введите сумму в рублях, кратную 50: ");
        amount = (new Scanner(System.in)).nextInt();

        numberOf5000Roubles = amount / 5000;
        amount %= 5000;

        numberOf2000Roubles = amount / 2000;
        amount %= 2000;

        numberOf1000Roubles = amount / 1000;
        amount %= 1000;

        numberOf500Roubles = amount / 500;
        amount %= 500;

        numberOf200Roubles = amount / 200;
        amount %= 200;

        numberOf100Roubles = amount / 100;
        amount %= 100;

        numberOf50Roubles = amount / 50;

        System.out.println("Ваша сумма состоит из");
        System.out.println("     " + numberOf5000Roubles + "шт. 5-тыс. руб. купюр,");
        System.out.println("     " + numberOf2000Roubles + "шт. 2-тыс. руб. купюр,");
        System.out.println("     " + numberOf1000Roubles + "шт. 1-тыс. руб. купюр,");
        System.out.println("     " + numberOf500Roubles + "шт. 500-руб. купюр,");
        System.out.println("     " + numberOf200Roubles + "шт. 200-руб. купюр,");
        System.out.println("     " + numberOf100Roubles + "шт. 100-руб. купюр,");
        System.out.println("     " + numberOf50Roubles + "шт. 50-руб. купюр.");
    }
}
