import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;


public class PigLatin_f73c_Tests {

    @Test
    public void consonantWordIsPiggified() {
        assertEquals("Emay", PigLatin_f73c.piggify("Me"));
        assertEquals("emay", PigLatin_f73c.piggify("me"));
    }

    @Test
    public void oneLetterWordsArePiggified() {
        assertEquals("away", PigLatin_f73c.piggify("a"));
        assertEquals("Away", PigLatin_f73c.piggify("A"));
    }

    @Test
    public void isVowelReturnsTrueForVowel() {
        assertTrue(PigLatin_f73c.isVowel('a'));
        assertTrue(PigLatin_f73c.isVowel('e'));
        assertTrue(PigLatin_f73c.isVowel('i'));
        assertTrue(PigLatin_f73c.isVowel('o'));
        assertTrue(PigLatin_f73c.isVowel('u'));
        assertTrue(PigLatin_f73c.isVowel('A'));
        assertTrue(PigLatin_f73c.isVowel('E'));
        assertTrue(PigLatin_f73c.isVowel('I'));
        assertTrue(PigLatin_f73c.isVowel('O'));
        assertTrue(PigLatin_f73c.isVowel('U'));
    }


    @Test
    public void isVowelReturnsFalseForConsonents() {
        assertTrue(!PigLatin_f73c.isVowel('t'));
        assertTrue(!PigLatin_f73c.isVowel('y'));
        assertTrue(!PigLatin_f73c.isVowel('b'));
    }

    @Test
    public void getWordsWorksWithJustSpaces() {
        ArrayList<String> result = new ArrayList<>(Arrays.asList("One", " ", "two", " ", "three", " ", "four"));
        assertEquals(result, PigLatin_f73c.getWords("One two three four"));
    }

    @Test
    public void getWordsWorksWithSpacesAndPunctuation() {
        ArrayList<String> result = new ArrayList<>(Arrays.asList("One", ",", " ", "two",".", " ", "(", "three", ")", " ", "four", "."));
        assertEquals(result, PigLatin_f73c.getWords("One, two. (three) four."));
    }

}
