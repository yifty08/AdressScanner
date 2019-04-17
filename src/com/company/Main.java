package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstInitial, lastName, streetName, streetType, city;
        int houseNumber;

        System.out.print("Enter your first initial and last name: ");
        firstInitial = scanner.next();
        lastName = scanner.next();

        System.out.print("Enter your address: ");
        houseNumber = scanner.nextInt();
        streetName = scanner.next();
        streetType = scanner.next();

        System.out.println(firstInitial + "." +lastName);
        System.out.print(houseNumber+" ");
        System.out.print(streetName+" ");
        System.out.print(streetType);
    }
}
