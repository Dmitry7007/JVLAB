package lab3;
import java.util.Scanner;
import static java.lang.Math.sqrt;

public class Zadanie_5 {
    public static void main(String[] args) {
        float a, b = 0;
        System.out.println("Введите длину гипотенузы:");
        a = new Scanner(System.in).nextFloat();
        System.out.println("Введите длину катета:");
        b = new Scanner(System.in).nextFloat();
        System.out.println("Длина второго катета: " + sqrt(a*a-b*b));
    }
}
