//Logic
//Translates the input to English or morse code

import java.util.HashMap;

public class MorseCodeTranslator {
    String testText;
    String translatedText = "";
    HashMap<Character, String> morse;

    MorseCodeTranslator() {
        morse = new HashMap<>();
        morse.put('a', ".-");
        morse.put('b', "-...");
        morse.put('c', "-.-");
        morse.put('d', "-..");
        morse.put('e', ".");
        morse.put('f', "..-.");
        morse.put('g', "--.");
        morse.put('h', "....");
        morse.put('i', "..");
        morse.put('j', ".---");
        morse.put('k', "-.");
        morse.put('l', ".-..");
        morse.put('m', "--");
        morse.put('n', "-.");
        morse.put('o', "---");
        morse.put('p', ".--.");
        morse.put('q', "--.-");
        morse.put('r', ".-.");
        morse.put('s', "...");
        morse.put('t', "\"-\"");
        morse.put('u', "..-");
        morse.put('v', "...-");
        morse.put('w', ".--");
        morse.put('x', "-..-");
        morse.put('y', "-.--");
        morse.put('z', "--..");
    }

    public String englishToMorse(String inText) {
        //Removes spaces and converts all chars to lowercase
        testText = inText.replace(" ","").toLowerCase();

        for (int i = 0; i < testText.length(); i++) {
            translatedText += (morse.get(testText.charAt(i)) + " ");
        }

        return translatedText;
    }
}
