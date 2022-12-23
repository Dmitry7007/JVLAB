package lab7;
import java.util.Scanner;

public class Zadanie_10 {
    public static void main(String[] args) {
        System.out.println("Введите X: ");
        int x = (new Scanner(System.in)).nextInt();
        System.out.println("Введите Y: ");
        int y = (new Scanner(System.in)).nextInt();
        if (x > 2)
            if (y > 2) {
                int z = x + y;
                System.out.println("z равен " + z);
            } else
                System.out.println("x равен " + x);
    }
}
