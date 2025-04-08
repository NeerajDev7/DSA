public class LastOccurrence {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,4,5,5};
        int target = 4;
        System.out.println(findLast(arr,target));
    }
    public static int findLast(int[] arr,int target)
    {
        int low = 0,high = arr.length-1;
        while(low<=high)
        {
            int mid = low +(high-low)/2;
            if(arr[mid] < target)
                low = mid + 1;
            else if(arr[mid] > target)
                high = mid - 1;
            else
            {
                if(mid == arr.length-1 || arr[mid]!= arr[mid+1])
                    return mid;
                else
                {
                    low = mid +1;
                }
            }
        }
        return -1;
    }
}
