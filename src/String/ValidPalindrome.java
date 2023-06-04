package String;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        String str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int j = str.length() -1;

        for (int i = 0; i < str.length() -1 ; i++) {
            if (str.charAt(i) != str.charAt(j)){
                return false;
            }
            j--;
        }
        return true;
    }
}
