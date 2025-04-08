public class PaintersPartition {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        System.out.println(paintersPartition(arr, 2));
    }

    public static int paintersPartition(int[] arr, int k) {
        int low = max(arr), high = sum(arr);
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int noOfPainters = count(arr, mid); // Check painters needed for this mid
            if (noOfPainters > k) {
                low = mid + 1;  // We need more painters, so increase the limit
            } else {
                high = mid - 1;  // Fewer painters, try to lower the limit
            }
        }
        return low;
    }

    // Returns number of painters required for max partition size 'part'
    public static int count(int[] arr, int painters) {
        int noOfPainters = 1, sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] + sum <= painters) {
                sum += arr[i];
            } else {
                noOfPainters++;
                sum = arr[i];
            }
        }
        return noOfPainters;
    }

    // Returns the maximum element in the array
    public static int max(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i : arr) {
            max = Math.max(max, i);
        }
        return max;
    }

    // Returns the sum of the array elements
    public static int sum(int[] arr) {
        int sum = 0;
        for (int i : arr)
            sum += i;
        return sum;
    }
}
