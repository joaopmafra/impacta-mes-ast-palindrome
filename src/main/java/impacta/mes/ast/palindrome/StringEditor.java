package impacta.mes.ast.palindrome;

import java.text.Normalizer;

public class StringEditor {

    private String string;

    public StringEditor(String string) {
        this.string = string;
    }

    public StringEditor removePunctuation() {
        string = string.replaceAll("\\p{Punct}", "");
        return this;
    }

    public StringEditor removeSpaces() {
        string = string.replaceAll("\\s+", "");
        return this;
    }

    public StringEditor removeAccents() {
        var normalized = Normalizer.normalize(string, Normalizer.Form.NFD);
        string = normalized.replaceAll("\\p{InCombiningDiacriticalMarks}", "");
        return this;
    }

    public String getResult() {
        return string;
    }
}
