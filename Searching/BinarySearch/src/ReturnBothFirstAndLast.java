import java.util.Arrays;

public class ReturnBothFirstAndLast {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,4,5,5,6,6};
        int target = 6;
        int[] res = new int[2];
        res[0] = binarySearch(arr,target,true);
        res[1] = binarySearch(arr,target,false);
        System.out.println(Arrays.toString(res));
    }

    private static int binarySearch(int[] arr, int target, boolean b) {
        int low = 0,high = arr.length-1,res = -1;
        while(low<=high)
        {
            int mid = low + (high-low)/2;
            if(arr[mid] == target)
            {
                res = mid;
                if(b)
                {
                    high = mid - 1;
                }
                else {
                    low = mid + 1;
                }
            }
            else if(arr[mid]<target)
                low = mid +1;
            else high = mid - 1;
        }
        return res;
    }
}
