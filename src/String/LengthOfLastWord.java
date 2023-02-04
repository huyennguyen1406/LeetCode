package String;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        String[] arr = s.split("\\s");
        String lastWord = arr[arr.length - 1];
        return lastWord.length();
    }
}
