//Test of MorseCodeTranslator
//TDD. At least 5 JUnit test cases

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MorseCodeTranslatorTest {
    MorseCodeTranslator mct = new MorseCodeTranslator();

    @Test
    //English to Morse Code translation
    public void englishToMorseTest() {
        assertEquals("-.-. .- - ", mct.englishToMorse("cat"));
    }

    @Test
    //Morse Code to English translation
    public void morseToEnglishTest() {
        assertEquals("cat", mct.morseToEnglish("-.-. .- -"));
    }

    @Test
    //Empty input should return an empty string, not crashing
    public void emptyInputTest() {
        assertEquals("", mct.morseToEnglish(""));
    }

    @Test
    //Extra spaces in the input text should be removed
    public void morseToEnglishTextSplitTest() {
        assertEquals("snail", mct.morseToEnglish("...  -.  .- ..  .-.."));
    }

    @Test
    //The English to Morse translation should give the same result with uppercase or lowercase letters
    public void englishToMorseCaseTest() {
        assertEquals(".... . .-.. .-.. --- ", mct.englishToMorse("hello"));
        assertEquals(".... . .-.. .-.. --- ", mct.englishToMorse("HELLO"));
    }

}
