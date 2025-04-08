import java.util.Arrays;

public class MaxDifference {
    public static void main(String[] args) {
        int[] arr = {2,3,10,6,4,8,1};
        System.out.println(maxDifference(arr));
    }
    public static int maxDifference(int[] arr)
    {
        int res = arr[1]-arr[0];
        int minVal = arr[0];
        for(int i = 1;i<arr.length;i++)
        {
            res = Math.max(res,arr[i]-minVal);
            minVal = Math.min(arr[i],minVal);
        }
        return res;
    }
}
