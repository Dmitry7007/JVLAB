package lab4;
import java.util.Scanner;

public class Zadanie_2 {
   static double y = 0;
   System.out.println("Введите знаменатель последнего слагаемого суммы: ");
   int n = (new Scanner (System.in)).nextInt();
   if (n <= 0) {
      System.out.println("Введите натуральное число! ");
   }
   
   public static void main(String[] args) {
       for (int i = 1; i <= n; i++) {
           if (i % 2 == 0) {
               y -= 1/i;
           }
           y += 1/i;
       }

       System.out.println("Значение выражения равно: " + y);
   }
}
