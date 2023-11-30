package Integer;

public class Sqrt {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }

        int left = 1, right = x, mid = -1;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if ((long) mid * mid > (long) x) {
                right = mid - 1;
            } else if (mid * mid == x) {
                return mid;
            } else {
                left = mid + 1;
            }
        }
        return Math.round(right);
    }
}
