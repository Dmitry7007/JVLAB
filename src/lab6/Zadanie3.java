package lab6;

import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
        final int MONTHS_PER_YEAR = 12;

        double annualInterestRate, monthlyInterestRate, loanAmount, monthlyPayment, totalPayment;
        byte numberOfYears, a;
        Scanner input = new Scanner(System.in);

        System.out.println("Выберите цель кредитвания: \n 1 - ипотечный \n 2 - автомобильный \n 3 - образовательный \n 4 - свой вариант");
        annualInterestRate = switch (input.nextByte()) {
            case 1 -> 6;
            case 2 -> 2.4;
            case 3 -> 4.4;
            case 4 -> input.nextDouble();
            default -> input.nextDouble();
        };

        System.out.print("Введите срок кредита в годах: ");
        numberOfYears = input.nextByte();

        System.out.print("Введите сумму кредита в рублях:");
        loanAmount = input.nextDouble();

        monthlyInterestRate = annualInterestRate / 12 / 100;

        monthlyPayment = loanAmount * monthlyInterestRate / (1
                - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * MONTHS_PER_YEAR));
        totalPayment = monthlyPayment * numberOfYears * MONTHS_PER_YEAR;

        System.out.println("Ежемесячный платеж равен " +
                (int)(monthlyPayment * 100) / 100.0 + " руб.");
        System.out.println("Стоимость кредита равна " +
                (int)(totalPayment * 100) / 100.0 + " руб.");
    }
}