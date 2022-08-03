package com.ironhack;

import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
/*
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
*/
        Scanner input = new Scanner(System.in);

        System.out.println("Por favor, introduce tu frase");

        String phrase = input.nextLine();

        String[] words = phrase.split(" ");
        int counter = 0;

        for (String word : words) {
            word = word.toLowerCase();
            if (word.startsWith("a")
                    || word.startsWith("e")
                    || word.startsWith("i")
                    || word.startsWith("o")
                    || word.startsWith("u")) {
                counter++;
            } else {
                System.err.println("Word " + word + " doesn't start with a vowel");
            }
        }
        System.out.println(counter);

        input.close();

    }

    public static void findVowels() {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int count = 0;
        String[] words = line.split(" ");

        System.out.println("Please introduce a phrase to be counted");
        Pattern pattern = Pattern.compile("(\\b[AaEeIiOoUu]+[\\w]*\\b)");


        for (String word : words) {
            if (pattern.matcher(word).find()) {
                count++;
            } else {
                System.err.println("Word skipped " + word);
            }
        }

        System.out.println("Words: " + count);

        scanner.close();
    }
}

