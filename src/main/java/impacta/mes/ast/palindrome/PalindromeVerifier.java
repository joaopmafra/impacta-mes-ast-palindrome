package impacta.mes.ast.palindrome;

public class PalindromeVerifier {

    public boolean isPalindrome(String string) {
        if (string == null) return false;
        else if (string.isEmpty()) return true;
        else if (string.length() == 1) return true;
        return false;
    }

}
