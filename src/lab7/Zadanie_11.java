package lab7;
import java.util.Scanner;

public class Zadanie_11 {
    public static void main(String[] args) {
        System.out.println("Введите i: ");
        float i = (new Scanner(System.in)).nextFloat();
        System.out.println("Введите j: ");
        float j = (new Scanner(System.in)).nextFloat();
        System.out.println("Введите k: ");
        float k = (new Scanner(System.in)).nextFloat();
        float x = 1, y = 1 , z = 1;

        System.out.println("Первый вариант: ");
        if (i > 0) {
            if (j > 0)
                x = 0;
            else if (k > 0)
                y = 0;
        }
        else
            z = 0;
        System.out.println("x = " + x + "y = " + y + "z = " + z);

        System.out.println("Второй вариант: ");
        if (i > 0)
            if (j > 0)
                x = 0;
            else if (k > 0)
                y = 0;
            else
                z = 0;
        System.out.println("x = " + x + "y = " + y + "z = " + z);
    }
}
