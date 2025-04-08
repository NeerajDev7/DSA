public class MinimumBitFlips {
    public static void main(String[] args) {
        System.out.println(minBitFlips(10,7));
    }

    public static int minBitFlips(int start, int goal) {

        int xor = start ^ goal;
        int count = 0;
        while (xor != 0) {
            xor = xor & (xor - 1);
            count++;
        }
        return count;
    }
}

