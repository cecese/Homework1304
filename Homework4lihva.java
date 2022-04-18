package Homework1304;

import java.util.Scanner;

public class Homework4lihva {

    public static void prostaLihva() {
        double glavnica;
        double lihva;
        double period;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Въведете главница: ");
        glavnica = scanner.nextDouble();
        System.out.println("Въведете лихвен процент: ");
        lihva = scanner.nextDouble();
        lihva = lihva/100;
        System.out.println("Въведете период в месеци");
        period = scanner.nextDouble();
        System.out.println("Лихвата за периода ще бъде: " + glavnica*lihva*period/100);
    }
       public static void slojnaLihva() {
           double glavnica;
           double lihva;
           double period;
           Scanner scanner = new Scanner(System.in);
           System.out.println("Въведете главница: ");
           glavnica = scanner.nextDouble();
           System.out.println("Въведете лихвен процент в %: ");
           lihva = scanner.nextDouble();
           lihva = lihva/100;
           System.out.println("Въведете период в месеци");
           period = scanner.nextDouble();

           System.out.println("Лихвата за периода ще бъде: " +
                   (glavnica*lihva/100*period ));

       }

    public static void main(String[] args) {
        System.out.println("Въвдете каква лихва желаете да се изчисли: ");
        String vidLihva;
        Scanner scanner = new Scanner(System.in);
        vidLihva = scanner.next();
        if (vidLihva.equalsIgnoreCase("проста")) {
            prostaLihva();
        } else
         slojnaLihva();
    }
}
