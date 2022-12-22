package lab7;

public class Zadanie_15 {
    public static void main(String[] args) {
        byte x = 1;
        System.out.println ("(true) && (3 > 4) " + ((true) && (3 > 4)));
        System.out.println ("!(x > 0) && (x > 0) " + (!(x > 0) && (x > 0)));
        System.out.println ("(x > 0) || (x < 0) " + ((x > 0) || (x < 0)));
        System.out.println ("(x != 0) || (x == 0) " + ((x != 0) || (x == 0)));
        System.out.println ("(x >= 0) || (x < 0) " + ((x >= 0) || (x < 0)));
        System.out.println ("(x != 1) == !(x == 1) " + ((x != 1) == !(x == 1)));
    }
}
