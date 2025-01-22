//Main
//Reads user input and sends it to logic class MorseCodeTranslator
//Gets the result of the translation and writes it out

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MorseCodeTranslator MCT = new MorseCodeTranslator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Morse Code Translator");
        System.out.println("What do you want to do?");
        System.out.println("1. Translate from English to Morse");
        System.out.println("2. Translate from Morse to English");

        try {
            int choice = scanner.nextInt();
            while(choice != 1 && choice != 2){
                System.out.println("Please enter 1. for English or 2. for Morse");
                choice = scanner.nextInt();
            }
            scanner.nextLine();
            System.out.println("Enter the text you wish to translate:");
            if(choice == 1){
                System.out.println("Translation:");
                System.out.println(MCT.englishToMorse(scanner.nextLine()));
            }

            if (choice == 2) {
                System.out.println("Translate to English");
            }

        } catch (Exception e){
            System.out.println("Error: " + e);
        }

    }
}