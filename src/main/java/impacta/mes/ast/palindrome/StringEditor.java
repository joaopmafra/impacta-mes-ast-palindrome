package impacta.mes.ast.palindrome;

import java.text.Normalizer;

public class StringEditor {

    private String string;

    public StringEditor(String string) {
        this.string = string;
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
