package impacta.mes.ast.palindrome;

import java.text.Normalizer;

public class StringEditor {

    private String string;

    public StringEditor(String string) {
        this.string = string;
    }

    /**
     * TODO remover; não é mais necessário
     * @deprecated
     */
    public StringEditor removePunctuation() {
        string = string.replaceAll("\\p{Punct}", "");
        return this;
    }

    /**
     * TODO remover; não é mais necessário
     * @deprecated
     */
    public StringEditor removeSpaces() {
        string = string.replaceAll("\\s+", "");
        return this;
    }

    public StringEditor removeAccents() {
        var normalized = Normalizer.normalize(string, Normalizer.Form.NFD);
        string = normalized.replaceAll("\\p{InCombiningDiacriticalMarks}", "");
        return this;
    }

    public StringEditor removeNonAlphaNumericChars() {
        string = string.replaceAll("[^A-Za-z0-9]", "");
        return this;
    }

    public String getResult() {
        return string;
    }
}
