package lab6;

import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) {

        double canadDollars, cursCD, rubles;
        Scanner input = new Scanner(System.in);

        System.out.print("Введите сумму в канадских долларах:");
        canadDollars = input.nextDouble();

        System.out.print("Введите курс канадского доллара в рублях:");
        cursCD = input.nextDouble();

        rubles = cursCD*canadDollars;

        System.out.println("Cумма в рублях:"  + (int) rubles);

    }
}