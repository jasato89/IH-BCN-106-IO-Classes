package com.ironhack;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Por favor, introduce tu nombre");
        String name = input.nextLine();
        System.out.println("Hola " + name);
        System.err.println("Introduce tu edad");

        int age;
        do {
            age = input.nextInt();
            if (age < 0) System.out.println("Tu edad no puede ser negativa");
        } while (age < 0);

        if (age > 18) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Acceso restringido");
        }


        input.close();
    }
}
