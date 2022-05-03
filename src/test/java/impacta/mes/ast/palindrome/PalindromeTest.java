package impacta.mes.ast.palindrome;

import org.assertj.core.api.Assertions;

/**
 * Tests for palindrome verification.
 *
 * The test names follow Roy Osherove's test naming conventions:
 * https://osherove.com/blog/2005/4/3/naming-standards-for-unit-tests.html
 */
public class PalindromeTest {

    public void isPalindrome_emptyString_isTrue() {
        boolean result = new PalindromeVerifier().isPalindrome("");
        Assertions.assertThat(result).isTrue();
    }

}
