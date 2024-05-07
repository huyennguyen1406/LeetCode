package String;

public class ReverseVowels {
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int left = 0, right = s.length() - 1;
        String vowels = "aeiouAEIOU";

        while (left < right) {
            while (left < right && !vowels.contains(chars[left] + "")) {
                left++;
            }
            while (left < right && !vowels.contains(chars[right] + "")) {
                right--;
            }
            char temp = chars[left];
            chars[left++] = chars[right];
            chars[right--] = temp;
        }

        return new String(chars);
    }

    public static void main(String[] args) {
        ReverseVowels str = new ReverseVowels();

        // Test cases
        String s1 = "hello";
        System.out.println(str.reverseVowels(s1));

        String s2 = "leetcode";
        System.out.println(str.reverseVowels(s2));
    }
}
