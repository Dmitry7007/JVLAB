package lab4;

public class Zadanie_2 {
   static double y = 0;
   public static void main(String[] args) {
       for (int i = 1; i <= 10000; i++) {
           if (i % 2 == 0) {
               y -= 1/i;
           }
           y += 1/i;
       }
       System.out.println("Значение выражения равно: " + y);
   }
}
