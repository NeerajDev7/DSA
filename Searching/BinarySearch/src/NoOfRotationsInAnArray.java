public class NoOfRotationsInAnArray {
    public static void main(String[] args) {
       int[] arr = {7,8,9,1,2,3,4,5,6};
        System.out.println(arrayRotations(arr));
    }
    public static int arrayRotations(int[] arr)
    {
        int index = -1,ans = Integer.MAX_VALUE;
        int low = 0,high = arr.length-1;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(arr[low]<=arr[mid])
            {
                ans = Math.min(arr[low],ans);
                index = low;
                low = mid + 1;
            }
            else {
                ans = Math.min(arr[mid],ans);
                index = mid;
                high = mid - 1;
            }
        }
        return index;
    }
}
