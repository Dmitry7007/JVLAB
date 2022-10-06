package lab3;
import java.text.DecimalFormat;
import java.util.Scanner;
import static java.lang.Math.*;

public class Zadanie_4 {
    public static void main(String[] args) {
        System.out.println("Введите высоту, с которой падает тело:");
        double h = (new Scanner(System.in)).nextFloat();
        double t = sqrt(2*h/9.8);
        String tdrob = new DecimalFormat("#.###").format(t%1*1000);
        System.out.println("Время свободного падения тела с высоты " + h + "м равно: " + round(t) + "с " + tdrob + "мс");
    }
}
