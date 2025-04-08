public class EquilibriumPoint {
    public static void main(String[] args) {
        int[] arr = {4, 2, 2};
        System.out.println(equilibrium(arr));
    }
    public static int equilibrium(int[] arr) {
        int ts = 0;
        for (int i = 0; i < arr.length; i++) {
            ts += arr[i];
        }
        int ls = 0;
        for (int i = 0; i < arr.length; i++) {
            ts -= arr[i];
            if (ls == ts)
                return i;
            ls += arr[i];
        }
        return -1;
    }
}
