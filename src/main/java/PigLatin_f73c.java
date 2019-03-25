import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class PigLatin_f73c {


    private static final char[] VOWELS = {'a', 'e', 'i', 'o', 'u'};

    // Read lines from std input
    // If word begins with consonant move it to the end and append "ay" otherwise just append "way"


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();
        StringBuilder output = new StringBuilder();

        while(line != null) {
            ArrayList<String> words = getWords(line);

            String pig_line_out = "";
            for(String word : words) {
                pig_line_out += piggify(word);
            }
            output.append(pig_line_out + "\n");

            line = br.readLine();
        }

        System.out.print(output);

    }

    public static ArrayList<String> getWords(String line) {

        char[] c_line = line.toCharArray();

        ArrayList<Character> word = new ArrayList<>();
        ArrayList<String> ret = new ArrayList<>();

        char c;
        int line_count = 0;

        // Loop through every character of the line
        while(line_count < c_line.length) {

            c = c_line[line_count];

            // Collect all continuous sequences of alphabetic characters together
            if(Character.isAlphabetic(c)) {
                word.add(c);
            } else {

                // Current character is punctuation or space.
                // Push the accumulated word if present.
                addWordToSet(ret,word);

                // Preserve punctuation and space by adding current character as its own string.
                ret.add(String.valueOf(c));
                word.clear();
            }

            ++line_count;
        }

        // Push remaining r
        addWordToSet(ret, word);

        return ret;
    }

    public static ArrayList<String> addWordToSet(ArrayList<String> set, ArrayList<Character> word) {
        if(!word.isEmpty()) {
            set.add(word.stream().map(String::valueOf).collect(Collectors.joining()));
        }
        return  set;
    }


    public static String piggify(String word) {

        // Make sure word is non empty
        assert(word != null);


        // Remove first character
        char first = word.charAt(0);

        // Only continue if first character is alphabetical - ignore punctuation and spaces!
        if(!Character.isAlphabetic(first)) return word;

        // Mark whether we are dealing with caps or vowel starting words
        boolean has_caps = Character.isUpperCase(first);
        boolean vowel_start = isVowel(first);

        // Set suffix and front depending on vowel start
        String suffix = vowel_start ? "way" : Character.toLowerCase(first) + "ay";
        String front = vowel_start ? word : word.substring(1);

        // Make full word
        char[] result = (front + suffix).toCharArray();

        // Capitalise first character if needed
        if(has_caps) {
             result[0] = Character.toUpperCase(result[0]);
        }

        // Convert to String and return
        return String.valueOf(result);
    }

    public static boolean isVowel(char c) {

        c = Character.toLowerCase(c);

        for(char v : VOWELS) {
            if(v == c) { return true;}
        }
        return false;
    }
}
