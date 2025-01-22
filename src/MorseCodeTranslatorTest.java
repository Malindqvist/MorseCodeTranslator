//Test of MorseCodeTranslator
//TDD. At least 5 JUnit test cases

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MorseCodeTranslatorTest {
    @Test
    public void englishToMorseTest(){
        MorseCodeTranslator mct = new MorseCodeTranslator();
        String testText = "cat";
        assertEquals("-.- .- \"-\" ", mct.englishToMorse(testText));
    }

}
