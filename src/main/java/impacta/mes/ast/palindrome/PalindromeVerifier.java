package impacta.mes.ast.palindrome;

import static impacta.mes.ast.palindrome.StringEditor.removeAccents;
import static impacta.mes.ast.palindrome.StringEditor.removePunctuationAndSpaces;

public class PalindromeVerifier {

    public boolean isPalindrome(String string) {
        if (string == null) return false;
        else if (string.isEmpty()) return true;
        else if (string.length() == 1) return true;
        else return verify(string);
    }

    private boolean verify(String string) {
        String normalizedString  = removeAccents(removePunctuationAndSpaces(string));
        return new StringBuilder(normalizedString)
                .reverse()
                .toString()
                .equalsIgnoreCase(normalizedString);
    }

}
