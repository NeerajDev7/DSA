public class MinimumDaysToMakeMBouquets {
    public static void main(String[] args) {
        int[] arr = {7, 7, 7, 7, 13, 11, 12, 7};
        int noOfBouquets = 2, noOfFlowers = 3;
        System.out.println(noOfDays(arr, noOfBouquets, noOfFlowers));
    }

    public static int noOfDays(int[] arr, int m, int k) {
        if (arr.length < m * k) // Adjusted condition for insufficient flowers
            return -1;

        int low = min(arr), high = max(arr);
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isPossible(arr, mid, m, k)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    // Check if it's possible to make 'm' bouquets in 'day' days
    public static boolean isPossible(int[] arr, int day, int m, int k) {
        int count = 0, noOfBouquets = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= day) {
                count++;
            } else {
                noOfBouquets += count / k; // Form bouquets with the current batch of flowers
                count = 0; // Reset count for the next batch
            }
        }
        noOfBouquets += count / k; // Account for the last batch of flowers
        return noOfBouquets >= m;
    }

    // Returns the minimum element in the array
    public static int min(int[] arr) {
        int min = Integer.MAX_VALUE; // Initialize to a very large value
        for (int i : arr) {
            min = Math.min(min, i);
        }
        return min;
    }

    // Returns the maximum element in the array
    public static int max(int[] arr) {
        int max = Integer.MIN_VALUE; // Initialize to a very small value
        for (int i : arr) {
            max = Math.max(max, i);
        }
        return max;
    }
}
