package lab7;
import java.util.Scanner;
import static java.lang.Math.pow;

public class Zadanie_14 {
    public static void main(String[] args) {
        final int SMS_PER_METER = 100;
        double weight, heightm, heightsm, bmi;

        Scanner input = new Scanner(System.in);

        System.out.print("Введите вес в килограммах: ");
        weight = input.nextDouble();

        System.out.print("Введите рост в метрах: ");
        heightm = input.nextDouble();

        System.out.print("Введите рост в сантиметрах: ");
        heightsm = input.nextDouble();

        bmi = weight / (pow(heightm + heightsm/SMS_PER_METER, 2));

        System.out.println("BMI равно " + bmi);
        if (bmi < 18.5)
            System.out.println("Недостаточный вес");
        else if (bmi < 25)
            System.out.println("Норма");
        else if (bmi < 30)
            System.out.println("Избыточный вес");
        else
            System.out.println("Ожирение");
    }
}
