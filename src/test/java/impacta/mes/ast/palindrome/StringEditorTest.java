package impacta.mes.ast.palindrome;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringEditorTest {

    @Test
    public void removePunctuation_stringWithPunctuationNumbersAndLetters_removesOnlyTheCorrectChars() {
        var result = new StringEditor("a/1.c")
                .removePunctuation()
                .getResult();
        assertThat(result).isEqualTo("a1c");
    }

    @Test
    public void removeSpaces_stringWithSpacesNumbersAndLetters_removesOnlyTheCorrectChars() {
        var result = new StringEditor(" a 1 c")
                .removeSpaces()
                .getResult();
        assertThat(result).isEqualTo("a1c");
    }

    @Test
    public void removeAccents_stringWithAccents_changesTheCorrectChars() {
        var result = new StringEditor("aêío")
                .removeAccents()
                .getResult();
        assertThat(result).isEqualTo("aeio");
    }

}
