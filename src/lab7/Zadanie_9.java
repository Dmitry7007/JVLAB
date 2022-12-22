package lab7;
import  java.util.Scanner;

public class Zadanie_9 {
    public static void main(String[] args) {
        System.out.println("Введите X: ");
        float x = (new Scanner(System.in)).nextFloat();
        System.out.println("Введите Y: ");
        float y = (new Scanner(System.in)).nextFloat();
        float z = 0;
        if (x > 2) {
            if (y > 2) {
                z = x + y;
                System.out.println("z равен " + z);
            }
        } else
            System.out.println("x равен " + x);
    }
}
