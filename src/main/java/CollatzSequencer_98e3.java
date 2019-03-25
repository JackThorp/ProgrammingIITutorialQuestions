public class CollatzSequencer_98e3 {

    public static void main(String[] args) {

        runCollatz(Integer.parseInt(args[0]));

    }

    public static int runCollatz(int num) {

        if (num <= 0) {
            return 1;
        }

        while (num != 1) {
            //System.out.println(num);
            num = next(num);
        }

        return num;
    }

    public static int next(int i) {

        if(i % 2 == 0) {
            return i / 2;
        }

        return 3 * i + 1;
    }
}
