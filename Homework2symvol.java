package Homework1304;

import java.util.Scanner;

public class Homework2symvol {
    public static void symvol() {
        Scanner scanner = new Scanner(System.in);
        String word;
        System.out.println("input word:");
        word = scanner.next();
        int numberSymbols = 0;
        int i;
        for ( i = 0; i < word.length(); i++ ) {
            numberSymbols++;

        } System.out.println(numberSymbols);
        if ( i % 2 == 1 ) {
            System.out.println("Middle symbol is " + word.charAt(i/2));
        } else {
            System.out.println("Middle symbols are " + word.charAt(i/2-1) + " and " + word.charAt(i/2));
        }

    }

    public static void main(String[] args) {
        symvol();
    }
}
