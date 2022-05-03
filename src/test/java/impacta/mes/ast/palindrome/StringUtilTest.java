package impacta.mes.ast.palindrome;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringUtilTest {

    @Test
    public void removePunctuationAndSpaces_stringWithPunctuationSpacesNumbersAndLetters_removesOnlyTheCorrectChars() {
        var result = StringUtil.removePunctuationAndSpaces("a/1. c");
        assertThat(result).isEqualTo("a1c");
    }

}
