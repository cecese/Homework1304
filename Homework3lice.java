package Homework1304;

import java.util.Scanner;

public class Homework3lice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Въведете вид на фигурата: ");
        String figure;
        figure = scanner.next();
        int weight;
        int height;
        int radius;

        if ( figure.equalsIgnoreCase("квадрат") ) {
            System.out.println("Въведете страна на квадрата:");
            weight = scanner.nextInt();
            System.out.println("Лицето на квадрата е:" + " " + weight*weight );

        } else if ( figure.equalsIgnoreCase("триъгълник")) {
           System.out.println("Въведете основа на триъгълника: ");
            weight = scanner.nextInt();
            System.out.println("Въведете височина на триъгълника: ");
            height = scanner.nextInt();
            System.out.println("Лицето на триъгълника е" + " " + (weight*height/2));
        } else if ( figure.equalsIgnoreCase("кръг")) {
            double p = Math.PI;
            System.out.println("Въведете радиус на кръг: ");
            radius = scanner.nextInt();
            System.out.println("Лицето на кръга е" + " " + radius*radius*p);
        } else if ( figure.equalsIgnoreCase( "правоъгълник") ){
            System.out.println("Въведета страна на правоъгълника: ");
            weight = scanner.nextInt();
            System.out.println("Въведете височина на правоъгълника: ");
            height = scanner.nextInt();
            System.out.println("Лицето на правоъгълника е" + " " + weight*height);
        } else {
            System.out.println("Грешка");
        }

                }

                }



