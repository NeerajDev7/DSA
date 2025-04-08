public class PeakElement {
    public static void main(String[] args) {
        int[] arr = {5,10,20,15,7};
        System.out.println(findPeak(arr));
    }
    public static int findPeak(int[] arr)
    {
        int low = 0,high = arr.length-1;
        while(low<=high)
        {
            int mid = low + (high-low)/2;
            if(mid == 0 || (arr[mid-1]<=arr[mid]) &&
                    mid == arr.length-1 || (arr[mid] >= arr[mid+1]))
                return arr[mid];
            if(mid > 0 && arr[mid-1] >= arr[mid])
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }
}
