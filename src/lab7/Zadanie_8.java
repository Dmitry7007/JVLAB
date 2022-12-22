package lab7;
import java.util.Scanner;;

public class Zadanie_8 {
    public static void main(String[] args) {
        System.out.println("Введите частоу пульса: ");
        int puls = (new Scanner(System.in)).nextInt();
        if (puls>56) {
            System.out.println("Продолжайте тренироваться! ");
        }
        else {
            System.out.println("Ваше сердце в отличном состоянии! ");
        }
    }
}
