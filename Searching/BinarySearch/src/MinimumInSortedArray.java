public class MinimumInSortedArray {
    public static void main(String[] args) {
        int[] arr = {4,5,6,0,1,2};
        System.out.println(minimum(arr));
    }
    public static int minimum(int[] arr)
    {
        int ans = Integer.MAX_VALUE;
        int low = 0;
        int high = arr.length-1;
        while(low<=high)
        {
            int mid = low +(high-low)/2;
            if(arr[low]<=arr[mid])
            {
                ans = Math.min(arr[low],ans);
                low = mid + 1;
            }
            else if(arr[mid] <= arr[high])
            {
                ans = Math.min(arr[mid],ans);
                high = mid-1;
            }
        }
        return ans;
    }

}

