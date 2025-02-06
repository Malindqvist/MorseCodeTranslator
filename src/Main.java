//Main
//Reads user input and sends it to logic class MorseCodeTranslator
//Gets the result of the translation and writes it out

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MorseCodeTranslator MCT = new MorseCodeTranslator();
        Scanner scanner = new Scanner(System.in);
        String userInput;
        int choice = 0;

        System.out.println("Welcome to the Morse Code Translator");

        while (true) {
            boolean validChoice = false;
            try {
                System.out.println("What do you want to do?");
                System.out.println("1. Translate from English to Morse Code");
                System.out.println("2. Translate from Morse Code to English");

                //Keeps asking for user input until valid
                while (!validChoice) {
                    try {
                        choice = scanner.nextInt();
                        if (choice == 1 || choice == 2) {
                            validChoice = true;
                        } else {
                            System.out.println("Please enter 1. for English or 2. for Morse Code");
                        }
                    } catch (Exception e) {
                        System.out.println("Please enter 1. for English or 2. for Morse Code");
                        //Clearing the scanner to avoid writing the error message for eternity
                        scanner.nextLine();
                    }
                }

                //Clearing the scanner
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        System.out.println("Enter the text you want to translate:");
                        System.out.println(MCT.englishToMorse(scanner.nextLine()));
                        System.out.println();
                        break;
                    case 2:
                        System.out.println("Enter the Morse Code you want to translate:");
                        userInput = scanner.nextLine();
                        //Checks the user input. Only dots, dashes and spaces are allowed
                        if (userInput.matches("[.\\s\\-]+")) {
                            System.out.println(MCT.morseToEnglish(userInput));
                            System.out.println();
                        } else {
                            System.out.println("Invalid input. Only dots, dashes and spaces are allowed.");
                        }
                        break;
                    default:
                        System.out.println("Invalid input!");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }


        }


    }


}