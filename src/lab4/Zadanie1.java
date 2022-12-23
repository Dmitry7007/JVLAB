package lab4;
import static java.lang.Math.pow;
import java.util.Scanner;
import  java.text.DecimalFormat;

public class Zadanie1 {
   static DecimalFormat df = new DecimalFormat();
   public static void work (long n) {
       boolean z = false;
       double c = 0;
       double a = 0;
       double b = 0;
       for (int k = 1; k <= 100; k++) {
           for (int j = 1; j <= 100; j++) {
               for (int i = 1; i <= 100; i++) {
                   if ((pow(c + k, n) == (pow(a + i, n) + pow(b + j, n))) && (((a + i) + (b + j) + (c + k)) % 1 == 0) && (a + i > 0) && (b + j > 0) && (c + k > 0)) {
                       z = true;
                       System.out.println("Есть натуральное решение: " + df.format(a + i) + "^" + n + " + " + df.format(b + j) + "^" + n + " = " + df.format(c + k) + "^" + n);
                   }
                   else if (k == 100 && j == 100 && i == 100 && z == false) {
                           System.out.println("Решения на мн-ве натуральных чисел нет!");
                   }
               }
           }
       }
   }

   public static void main (String[] args) {
       df.setMaximumFractionDigits(2);
       df.setMinimumFractionDigits(0);
       System.out.print("Введите натуральную степень n и убедитесь, что есть натуральные решения уравнения {a^n + b^n = c^n} для n=2 и нет решений для n>2: ");
       long n = (new Scanner (System.in)).nextLong();
       /* System.out.print("Введите число a: ");
       double a = (new Scanner (System.in)).nextDouble();
       System.out.print("Введите число b: ");
       double b = (new Scanner (System.in)).nextDouble(); 
       */
       work(n);
   }
}
