package lab3;
import java.util.Scanner;

public class Zadanie_2 {
    static int FactorialDoDesyati (int n) {
        if (n>0 && n<10){
            int fac = 1;
            while (n>1){
                fac = fac * n;
                n--;
            }
            return fac;
        }
        else {
            System.out.println("Функция определена на множестве натуральных чисел меньше 10!");
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println("Введите число меньше 10 для нахождения его факториала:");
        Scanner input = new Scanner(System.in);
        System.out.println("Факториал введённого числа: " + FactorialDoDesyati(input.nextByte()));
    }
}