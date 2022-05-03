package impacta.mes.ast.palindrome;

public class PalindromeVerifier {

    public boolean isPalindrome(String string) {
        if (string == null) return false;
        else if (string.isEmpty()) return true;
        else if (string.length() == 1) return true;
        else return verify(string);
    }

    private boolean verify(String string) {
        String normalizedString  = new StringEditor(string)
                .removePunctuation()
                .removeSpaces()
                .removeAccents()
                .removeNonAlphaNumericChars()
                .getResult();

        return new StringBuilder(normalizedString)
                .reverse()
                .toString()
                .equalsIgnoreCase(normalizedString);
    }

}
