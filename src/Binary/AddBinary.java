package Binary;

public class AddBinary {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int carry = 0;

        // Iterate from the rightmost bit to the leftmost bit
        int i = a.length() - 1, j = b.length() - 1;

        while (i >= 0 || j >= 0 || carry > 0) {
            // Extract the bits from the input strings (a and b)
            int bitA = (i >= 0) ? Character.getNumericValue(a.charAt(i)) : 0;
            int bitB = (j >= 0) ? Character.getNumericValue(b.charAt(j)) : 0;

            // Perform binary addition with carry
            int currentSum = bitA + bitB + carry;
            result.insert(0, currentSum % 2);
            carry = currentSum / 2;

            // Move to the next bit towards the left
            i--;
            j--;
        }

        return result.toString();
    }
}
