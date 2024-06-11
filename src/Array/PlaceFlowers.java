package Array;

public class PlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        int length = flowerbed.length;

        for (int i = 0; i < length; i++) {
            if (flowerbed[i] == 0) {
                boolean prevEmpty = (i == 0 || flowerbed[i - 1] == 0);
                boolean nextEmpty = (i == length - 1 || flowerbed[i + 1] == 0);

                if (prevEmpty && nextEmpty) {
                    flowerbed[i] = 1;
                    count++;
                    if (count >= n) {
                        return true;
                    }
                    i++;
                }
            }
        }
        return count >= n;
    }

    public static void main(String[] args) {
        PlaceFlowers sol = new PlaceFlowers();
        System.out.println(sol.canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 1));  // Output: true
        System.out.println(sol.canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 2));  // Output: false
    }
}
