import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class ReversedOrderInput_2d33 {

    private static final int MAX = 100;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //reverseWithArrays(br);
        reverseWithDeque(br);
    }

    private static void reverseWithDeque(BufferedReader br) throws IOException {

        Deque<String> input = new ArrayDeque<>();
        String line = br.readLine();

        while(line != null) {
            input.push(line);
            line = br.readLine();
        }

        // Pop off the queue in reverse order
        while(!input.isEmpty()) {
            System.out.println(input.pop());
        }
    }

    public static void reverseWithArrays(BufferedReader br) throws IOException {

        // Read first line of input and set up variables
        String[] lines = new String[MAX];
        String line = br.readLine();
        int line_count = 0;

        // Read and count lines of input
        while(line != null && line_count < MAX) {

            lines[line_count] = line;
            line_count++;
            line = br.readLine();
        }

        // Print out lines in reverse order
        for(int i = line_count - 1; i >= 0; i--) {
            System.out.println(lines[i]);
        }
    }
}
