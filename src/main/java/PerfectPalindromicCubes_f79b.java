public class PerfectPalindromicCubes_f79b {


    public static void main(String[] args) {

        for(long y = 0; y < 20000; y++) {
            long x = y * y * y;
            //System.out.println(x);
            if(isPalindromeIterative(String.valueOf(x))){
                System.out.println(y + " cubed is " + x);
            }
        }

    }


    public static boolean isPalindromeRecursive(String s) {

        int len = s.length();

        if(len == 1 || len == 0) {
            return true;
        }
        return (s.charAt(0) == s.charAt(len-1)) && isPalindromeRecursive(s.substring(1,len-1));
    }

    public static boolean isPalindromeIterative(String number) {

        //System.out.println(number + " length = " + number.length() + " /2 = " + number.length()/2);
        for(int i  = 0; i < number.length() / 2; ++i) {
            if(number.charAt(i) != number.charAt(number.length() - 1 - i)) {
                return false;
            }
        }

        return true;

    }
}
