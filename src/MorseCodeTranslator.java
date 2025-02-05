//Logic
//Translates the input to English or Morse Code

import java.util.HashMap;
import java.util.Map;

public class MorseCodeTranslator {
    String newText;
    String translatedText;
    HashMap<Character, String> morse;
    HashMap<String, Character> english;
    String[] morseWords;

    MorseCodeTranslator() {
        //Creates the Morse Code HashMap
        morse = new HashMap<>();
        morse.put('a', ".-");
        morse.put('b', "-...");
        morse.put('c', "-.-.");
        morse.put('d', "-..");
        morse.put('e', ".");
        morse.put('f', "..-.");
        morse.put('g', "--.");
        morse.put('h', "....");
        morse.put('i', "..");
        morse.put('j', ".---");
        morse.put('k', "-.-");
        morse.put('l', ".-..");
        morse.put('m', "--");
        morse.put('n', "-.");
        morse.put('o', "---");
        morse.put('p', ".--.");
        morse.put('q', "--.-");
        morse.put('r', ".-.");
        morse.put('s', "...");
        morse.put('t', "-");
        morse.put('u', "..-");
        morse.put('v', "...-");
        morse.put('w', ".--");
        morse.put('x', "-..-");
        morse.put('y', "-.--");
        morse.put('z', "--..");

        //Creates the English HashMap by reversing the keys and values of the Morse Code HashMap
        english = new HashMap<>();
        for (Map.Entry<Character, String> entry : morse.entrySet()) {
            english.put(entry.getValue(), entry.getKey());
        }

    }

    //Translates the user input to Morse Code
    public String englishToMorse(String inText) {
        clearTranslation();
        //Removes spaces and converts all chars to lowercase
        newText = inText.replace(" ", "").toLowerCase();

        for (int i = 0; i < newText.length(); i++) {
            char currentChar = newText.charAt(i);
            //If the current char key is in the HashMap, add the value to the string
            //Else add the unchanged char to the string
            if (morse.containsKey(currentChar)) {
                translatedText = translatedText.concat(morse.get(newText.charAt(i)) + " ");
            } else {
                translatedText = translatedText.concat(String.valueOf(currentChar));
            }

        }

        return translatedText;
    }

    //Translates the user input to English
    public String morseToEnglish(String inText) {
        clearTranslation();
        //Splits up the inText into the morseWords array
        morseWords = inText.split(" ");

        //Translates the Morse Code to English letters and creates a string
        for (String morseWord : morseWords) {
            //If the Morse Code exists in the HashMap, add the corresponding English letter
            if (english.containsKey(morseWord)) {
                translatedText = translatedText.concat(String.valueOf(english.get(morseWord)));
            }
        }

        return translatedText;
    }

    //Clears the translated text when new user input is entered
    public void clearTranslation() {
        translatedText = "";
    }

}
