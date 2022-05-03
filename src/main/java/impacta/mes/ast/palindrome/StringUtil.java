package impacta.mes.ast.palindrome;

public class StringUtil {

    public static String removePunctuationAndSpaces(String string) {
        return string
                .replaceAll("\\p{Punct}", "")
                .replaceAll("\\s+", "");
    }

}
