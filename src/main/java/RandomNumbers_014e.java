import java.util.Random;

public class RandomNumbers_014e {

    public static void main(String args[]) {

        assert args.length == 1;

        int limit = Integer.parseInt(args[0]);
        boolean[] seen_nums = setUpIndex(limit);
        int seen_count = 0, loop_count = 0;
        int cur_num;
        Random rand = new Random();

        System.out.println("Generating Random Numbers:");

        do {
            cur_num = rand.nextInt(limit);
            System.out.print(cur_num + ", ");
            if(!seen_nums[cur_num]) {
                seen_nums[cur_num] = true;
                seen_count++;
            }
            loop_count++;
        } while (seen_count < limit);

        System.out.println();
        System.out.println("I had to generate " + loop_count + " random numbers between 0 and " + (limit - 1) + " to have generated each number in the interval at least once.");

    }

    private static boolean[] setUpIndex(int size) {

        boolean[] index = new boolean[size];

        for(int i = 0; i < size; i++) {
            index[i] = false;
        }

        return index;
    }

}
