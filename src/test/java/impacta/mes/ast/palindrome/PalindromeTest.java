package impacta.mes.ast.palindrome;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for palindrome verification.
 *
 * The test names follow Roy Osherove's test naming conventions:
 * https://osherove.com/blog/2005/4/3/naming-standards-for-unit-tests.html
 */
public class PalindromeTest {

    private PalindromeVerifier verifier = new PalindromeVerifier();

    @Test
    public void isPalindrome_nullString_isFalse() {
        var result = verifier.isPalindrome(null);
        assertThat(result).isFalse();
    }

    @Test
    public void isPalindrome_emptyString_isTrue() {
        var result = verifier.isPalindrome("");
        assertThat(result).isTrue();
    }

    @Test
    public void isPalindrome_oneCharString_isTrue() {
        var result = verifier.isPalindrome("1");
        assertThat(result).isTrue();
    }

    @Test
    public void isPalindrome_equalCharsString_isTrue() {
        var result = verifier.isPalindrome("11");
        assertThat(result).isTrue();
    }

    @Test
    public void isPalindrome_capitalizedEqualCharsString_isTrue() {
        var result = verifier.isPalindrome("Aa");
        assertThat(result).isTrue();
    }

    @Test
    public void isPalindrome_equalCharsStringWithPunctuationAndSpaces_isTrue() {
        var result = verifier.isPalindrome("11/11/11 11:11");
        assertThat(result).isTrue();
    }

    @Test
    public void isPalindrome_palindromeStringWithSpecialChars_isTrue() {
        var result = verifier.isPalindrome("afã");
        assertThat(result).isTrue();
    }

    @Test
    public void isPalindrome_allCharsDifferentString_isFalse() {
        var result = verifier.isPalindrome("abc");
        assertThat(result).isFalse();
    }

}
