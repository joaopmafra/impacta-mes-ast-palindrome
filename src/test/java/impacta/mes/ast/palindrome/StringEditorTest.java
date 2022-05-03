package impacta.mes.ast.palindrome;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringEditorTest {

    @Test
    public void removePunctuationAndSpaces_stringWithPunctuationSpacesNumbersAndLetters_removesOnlyTheCorrectChars() {
        var result = StringEditor.removePunctuationAndSpaces("a/1. c");
        assertThat(result).isEqualTo("a1c");
    }

    @Test
    public void removeAccents_stringWithAccents_changesTheCorrectChars() {
        var result = StringEditor.removeAccents("aêío");
        assertThat(result).isEqualTo("aeio");
    }

}
