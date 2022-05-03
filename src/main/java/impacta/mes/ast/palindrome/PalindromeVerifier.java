package impacta.mes.ast.palindrome;

import java.util.Locale;

public class PalindromeVerifier {

    public boolean isPalindrome(String string) {
        if (string == null) return false;
        else if (string.isEmpty()) return true;
        else if (string.length() == 1) return true;
        else return verify(string);
    }

    private boolean verify(String string) {
        String normalizedString  = removePunctuationAndSpaces(string);
        return new StringBuilder(normalizedString)
                .reverse()
                .toString()
                .equalsIgnoreCase(normalizedString);
    }

    public String removePunctuationAndSpaces(String string) {
        return string
                .replaceAll("\\p{Punct}", "")
                .replaceAll("\\s+", "");
    }

}
