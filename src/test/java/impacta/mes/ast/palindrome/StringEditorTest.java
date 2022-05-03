package impacta.mes.ast.palindrome;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringEditorTest {

    @Test
    public void removeAccents_stringWithAccents_changesTheCorrectChars() {
        var result = new StringEditor("aêío")
                .removeAccents()
                .getResult();
        assertThat(result).isEqualTo("aeio");
    }

    @Test
    public void removeNonAlphaNumericChars_stringWithNonAlphaNumericChar_removesTheCorrectChars() {
        var result = new StringEditor(" a’1/")
                .removeNonAlphaNumericChars()
                .getResult();
        assertThat(result).isEqualTo("a1");
    }

}
