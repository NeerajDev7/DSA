public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {7,8,9,1,2,3,4,5,6};
        System.out.println(searchInRotatedSortedArray(arr,5));
    }
    public static int searchInRotatedSortedArray(int[] arr,int target)
    {
        int low = 0,high = arr.length-1;
        while(low<=high)
        {
            int mid = low +(high-low)/2;
            if(arr[mid] == target)
                return mid;
            else if(arr[low] <= arr[mid ])
            {
                if(target>=arr[low] && target < arr[mid])
                    high = mid - 1;
                else
                    low = mid + 1;
            }
            else
            {
                if(target> arr[mid] && target<=arr[high])
                {
                    low = mid + 1;
                }
                else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}
