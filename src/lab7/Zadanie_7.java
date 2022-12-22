package lab7;

import java.util.Scanner;

public class Zadanie_7 {
    public static void main(String[] args) {
        double pay = 10;
        System.out.println("Введите score: ");
        double score = (new Scanner(System.in)).nextDouble();
        if (score>90) {
            pay += pay*3/100;
        }
        else {
            pay += pay*1/100;
        }
        System.out.println("pay = " + pay);
    }
}
