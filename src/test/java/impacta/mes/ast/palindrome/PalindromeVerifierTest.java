package impacta.mes.ast.palindrome;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for palindrome verification.
 *
 * The test names follow Roy Osherove's test naming conventions:
 * https://osherove.com/blog/2005/4/3/naming-standards-for-unit-tests.html
 */
public class PalindromeVerifierTest {

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

    @Test
    public void isPalindrome_selectedPalindromeStrings_isTrue() {
        var strings = new String[] {
                "Rotator",
                "bob",
                "madam",
                "mAlAyAlam",
                "1",
                "Able was I, ere I saw Elba",
                "Madam I’m Adam",
                "Step on no pets.",
                "Top spot!",
                "02/02/2020"
        };

        for (String string : strings) {
            var result = verifier.isPalindrome(string);
            assertThat(result)
                    .as("isPalindrome(\"%s\")", string)
                    .isTrue();
        }
    }

    @Test
    public void isPalindrome_selectedNonPalindromeStrings_isFalse() {
        var strings = new String[] {
                "xyz",
                "elephant",
                "Country",
                "Top . post!",
                "Wonderful-fool",
                "Wild imagination!"
        };

        for (String string : strings) {
            var result = verifier.isPalindrome(string);
            assertThat(result)
                    .as("isPalindrome(\"%s\")", string)
                    .isFalse();
        }
    }

}
