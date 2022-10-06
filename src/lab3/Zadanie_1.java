package lab3;
import  java.util.Scanner;
import static java.lang.Math.pow;

public class Zadanie_1 {

 /* static float StepenDvoyki (int n) {
     float sd = 1;
     if (n==0) {
         return 1;
     }
     if (n>0){
         for(int i=0;i<n;i++){
             sd = sd*2;
         }
         return (long)sd;
     }
     else {
         for(int i=0;i<(-n);i++){
             sd = sd*2;
         }
         return 1/sd;
     }
 } */

    public static void main(String[] args) {
        System.out.print("Введите показатель степени: ");
        Scanner input = new Scanner(System.in);
        // System.out.print(StepenDvoyki(input.nextInt()));
        System.out.print(pow(2, input.nextDouble()));
    }
}
