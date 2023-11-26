package String;

public class GreatestCommonDivisor {
    public String gcdOfStrings(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();

        int gcdLength = gcd(len1, len2);

        String candidate = str1.substring(0, gcdLength);

        if (isDivisible(str1, candidate) && isDivisible(str2, candidate)) {
            return candidate;
        }

        return "";
    }

    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    private boolean isDivisible(String str, String pattern) {
        int len = str.length();
        int patternLen = pattern.length();
        int repeats = len / patternLen;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < repeats; i++) {
            sb.append(pattern);
        }

        return sb.toString().equals(str);
    }
}
