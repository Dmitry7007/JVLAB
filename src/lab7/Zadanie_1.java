package lab7;
import java.util.Scanner;

public class Zadanie_1 {
    public static void main(String[] args) {
        double radius;
        double area;

        System.out.print("Введите радиус круга: ");
        radius = (new Scanner (System.in)).nextDouble();

        if (radius < 0) {
            System.out.println("Некорректные входные данные! ");
        }
        else {
        area = 3.14159 * radius * radius;
        System.out.println("Площадь круга для радиуса " + radius + " равна " + area + ".");
        }
    }
}
