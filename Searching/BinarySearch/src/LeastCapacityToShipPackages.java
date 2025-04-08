public class LeastCapacityToShipPackages {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(leastCapacity(arr,5));
    }
    public static int leastCapacity(int[] arr,int days)
    {
        int low = max(arr),high = sum(arr);
        while(low<=high)
        {
            int mid = low + (high - low)/2;
            int noOfDays = noOfDaysRequired(arr,mid);
            if(noOfDays <= days)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return low;
    }
    public static int noOfDaysRequired(int[] arr,int capacity)
    {
        int noOfDays = 1,threshold = 0;
        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i] + threshold <= capacity)
                threshold += arr[i];
            else
            {
                noOfDays++;
                threshold = arr[i];
            }
        }
        return noOfDays;
    }
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
