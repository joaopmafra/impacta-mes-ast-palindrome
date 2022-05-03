package impacta.mes.ast.palindrome;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Tests for palindrome verification.
 *
 * The test names follow Roy Osherove's test naming conventions:
 * https://osherove.com/blog/2005/4/3/naming-standards-for-unit-tests.html
 */
public class PalindromeTest {

    @Test
    public void isPalindrome_nullString_isFalse() {
        var result = new PalindromeVerifier().isPalindrome(null);
        Assertions.assertThat(result).isFalse();
    }

    @Test
    public void isPalindrome_emptyString_isTrue() {
        var result = new PalindromeVerifier().isPalindrome("");
        Assertions.assertThat(result).isTrue();
    }

    @Test
    public void isPalindrome_oneCharString_isTrue() {
        var result = new PalindromeVerifier().isPalindrome("1");
        Assertions.assertThat(result).isTrue();
    }

}
