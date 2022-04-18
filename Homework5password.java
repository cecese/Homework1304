package Homework1304;

import java.util.Scanner;

public class Homework5password {
    public static void check() {
        Scanner scanner = new Scanner(System.in);
        String passWord = "bhg7Lgy#h";
        String inputPassword;
        System.out.println("Input password: ");
        inputPassword = scanner.next();
        if (inputPassword.equalsIgnoreCase(passWord)) {
            System.out.println("Password is valid");
        } else {
            System.out.println("Wrong pasword. Try again.");
        }
    }

    public static void main(String[] args) {
        check();
    }
}
