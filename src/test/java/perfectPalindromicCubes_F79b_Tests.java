import org.junit.jupiter.api.Test;

public class perfectPalindromicCubes_F79b_Tests {

    @Test
    public void isPalindromeRecursiveGetsPositivesRight() {

        assert(PerfectPalindromicCubes_f79b.isPalindromeRecursive("313"));
        assert(PerfectPalindromicCubes_f79b.isPalindromeRecursive("0"));
        assert(PerfectPalindromicCubes_f79b.isPalindromeRecursive("1"));
        assert(PerfectPalindromicCubes_f79b.isPalindromeRecursive("8"));
        assert(PerfectPalindromicCubes_f79b.isPalindromeRecursive("1030301"));
        assert(PerfectPalindromicCubes_f79b.isPalindromeRecursive(""));

    }

    @Test
    public void isPalindromeRecursiveGetsNegativesRight() {

        assert(!PerfectPalindromicCubes_f79b.isPalindromeRecursive("31"));
        assert(!PerfectPalindromicCubes_f79b.isPalindromeRecursive("10"));
        assert(!PerfectPalindromicCubes_f79b.isPalindromeRecursive("15"));
        assert(!PerfectPalindromicCubes_f79b.isPalindromeRecursive("84567548"));
        assert(!PerfectPalindromicCubes_f79b.isPalindromeRecursive("14355534"));

    }

    @Test
    public void isPalindromeIterativeGetsPositivesRight() {

        assert(PerfectPalindromicCubes_f79b.isPalindromeIterative("313"));
        assert(PerfectPalindromicCubes_f79b.isPalindromeIterative("0"));
        assert(PerfectPalindromicCubes_f79b.isPalindromeIterative("1"));
        assert(PerfectPalindromicCubes_f79b.isPalindromeIterative("8"));
        assert(PerfectPalindromicCubes_f79b.isPalindromeIterative("1030301"));
        assert(PerfectPalindromicCubes_f79b.isPalindromeIterative(""));

    }

    @Test
    public void isPalindromeIterativeGetsNegativesRight() {

        assert(!PerfectPalindromicCubes_f79b.isPalindromeIterative("31"));
        assert(!PerfectPalindromicCubes_f79b.isPalindromeIterative("10"));
        assert(!PerfectPalindromicCubes_f79b.isPalindromeIterative("15"));
        assert(!PerfectPalindromicCubes_f79b.isPalindromeIterative("84567548"));
        assert(!PerfectPalindromicCubes_f79b.isPalindromeIterative("14355534"));

    }

}


