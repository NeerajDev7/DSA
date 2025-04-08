import java.util.Arrays;

public class AggressiveCows {
    public static void main(String[] args) {
        int[] arr = {3,0,4,9,7,10};
        System.out.println(aggressiveCows(arr,4));
    }
    public static int aggressiveCows(int[] arr,int k)
    {
        Arrays.sort(arr);
        int n = arr.length;
        int low = 1,high = arr[n-1] - arr[0];
        while(low<=high)
        {
            int mid = low + (high-low)/2;
            if(canWePlaceCow(arr,mid,k))
                low = mid + 1;
            else
                high = mid - 1;
        }
        return high;
    }
    public static boolean canWePlaceCow(int[] arr,int dist,int cows)
    {
        int countCows = 1,last = arr[0];
        for(int i = 1;i<arr.length;i++)
        {
            if(arr[i] - last >= dist) {
                countCows++;
                last = arr[i];
            }
            if(countCows >= cows)
                return true;
        }
        return false;
    }
}
