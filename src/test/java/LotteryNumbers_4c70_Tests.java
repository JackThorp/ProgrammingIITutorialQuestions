import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LotteryNumbers_4c70_Tests {

    @Test
    public void sevenNumbersAreGenerated() {
        Integer[] numbers = LotteryNumbers_4c70.lottoDraw();
        assertEquals(numbers.length, 7);
    }

    @Test
    public void numbersAreInRange() {
        Integer[] numbers = LotteryNumbers_4c70.lottoDraw();
        for(int x = 0; x < numbers.length; x++) {
            assertTrue(numbers[x] <= 49);
            assertTrue(numbers[x] >= 1);
        }

    }

    @Test
    public void numbersAreDistinct() {
        Set<Integer> values;

        for(int x = 0; x < 100; x++) {

            values = new HashSet<Integer>();
            Integer[] numbers = LotteryNumbers_4c70.lottoDraw();

            for (int y = 0; y < numbers.length; y++) {
                assertTrue(values.add(numbers[y]));
            }
        }

    }
}
