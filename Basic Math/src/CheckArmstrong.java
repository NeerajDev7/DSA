public class CheckArmstrong {
    public static void main(String[] args) {
        System.out.println(isArmStrong(371));
    }

    public static boolean isArmStrong(int n) {
        int temp = n, rem, res = 0;
        while (temp != 0) {
            rem = temp % 10;
            res = res + rem * rem * rem;
            temp /= 10;
        }
        return res == n;
    }
}

