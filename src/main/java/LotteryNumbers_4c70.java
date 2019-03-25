import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class LotteryNumbers_4c70 {

    private static final Integer TOP_DRAW = 49;
    private static final Integer DRAW_SIZE = 7;

    public static void main(String[] args) {
        Integer[] draw = lottoDraw();

        String output;

        for(int x = 0; x < draw.length; x++) {
            output = x < draw.length - 1 ? "Number " + (x + 1) : "Bonus Number: ";
            System.out.println(output + ": " + draw[x]);
        }
    }

    public static Integer[] lottoDraw() {

        //
        Set<Integer> draw = new HashSet<>();
        Random rand = new Random();

        while(draw.size() < DRAW_SIZE) {
            draw.add(rand.nextInt(TOP_DRAW) + 1);
        }
        return draw.toArray(new Integer[0]);
    }
}
