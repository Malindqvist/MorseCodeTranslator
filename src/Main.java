//Main
//Reads user input and sends it to logic class MorseCodeTranslator
//Gets the result of the translation and writes it out

public class Main {
    public static void main(String[] args) {
        MorseCodeTranslator MCT = new MorseCodeTranslator();
        System.out.println(MCT.englishToMorse("hej"));
    }
}