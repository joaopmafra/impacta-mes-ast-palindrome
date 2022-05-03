package impacta.mes.ast.palindrome;

import java.text.Normalizer;

public class StringUtil {

    public static String removePunctuationAndSpaces(String string) {
        return string
                .replaceAll("\\p{Punct}", "")
                .replaceAll("\\s+", "");
    }

    public static String removeAccents(String string) {
        var normalized = Normalizer.normalize(string, Normalizer.Form.NFD);
        return normalized.replaceAll("\\p{InCombiningDiacriticalMarks}", "");
    }

}
