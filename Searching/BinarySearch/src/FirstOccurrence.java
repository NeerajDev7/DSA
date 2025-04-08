public class FirstOccurrence {
    public static void main(String[] args) {
        int[] arr = {2,2,3,4,4,5,5,6};
        System.out.println(findFirst(arr,4));
    }
    public static int findFirst(int[] arr,int target)
    {
        int low = 0,high = arr.length-1;
        while(low<=high)
        {
            int mid = low +(high-low)/2;
            if(arr[mid] < target )
                low = mid + 1;
            else if(arr[mid] > target)
                high = low-1;
            else {
                if(mid == 0 || arr[mid-1]!=arr[mid])
                    return mid;
                else
                    high = mid -1;
            }
        }
        return -1;
    }
}
