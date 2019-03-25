import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Collatz_98e3_Tests {

    @Test
    public void nextReturnsHalfForEvens() {

        CollatzSequencer_98e3 sq = new CollatzSequencer_98e3();
        assertEquals(4, sq.next(8));
        assertEquals(50, sq.next(100));
        assertEquals(0, sq.next(0));
    }

    @Test
    public void nextReturnsOneAboveTripleForOdds() {

        CollatzSequencer_98e3 sq = new CollatzSequencer_98e3();
        assertEquals(28, sq.next(9));
        assertEquals(304, sq.next(101));
        assertEquals(4, sq.next(1));

    }

    @Test
    public void collatzTerminates() {

        Random rand = new Random();

        for(int i = 0; i < 1000; i++) {

            int start_num = rand.nextInt(10000) + 1;
            int end_value = CollatzSequencer_98e3.runCollatz(start_num);
            assertEquals(end_value, 1);
        }

    }

}
