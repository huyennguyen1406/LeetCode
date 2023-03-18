package Array;

public class FindNumberWithDigits {
    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int num: nums) {
            int numDigit = findNum(num);
            if (numDigit % 2 == 0) {
                count++;
            }
        }

        return count;
    }

    private static int findNum(int num) {
        int count = 0;
        int result = num;
        while (result != 0){
            result = num / 10;
            num = result;
            count++;
        }
        return count;
    }


    public static void main(String[] args) {
        int[] nums = {1, 24, 3, 4, 22};
        System.out.println(findNumbers(nums));
    }
}
