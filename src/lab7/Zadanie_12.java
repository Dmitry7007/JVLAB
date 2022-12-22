package lab7;
import java.util.Scanner;

public class Zadanie_12 {
    public static void main(String[] args) {
        System.out.println("Введите age: ");
        byte age = (new Scanner(System.in)).nextByte();

//      if (age < 18)
//          System.out.println
//                  ("Нельзя получить кредит");
//      if (age >= 18)
//            System.out.println
//                  ("Можно получить кредит");
        if (age < 18)
            System.out.println
                    ("Нельзя получить кредит");
        else
            System.out.println
                    ("Можно получить кредит ");
    }
}
