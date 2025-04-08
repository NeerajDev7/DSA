public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {11,11,11,11,13,14,15,17,24,34,56};
        int[] arr1 = {76,63,54,34,21,11,3,1};

        // Array should be sorted in either ascending or descending order

        int target1 = 11,target2 = 34;
        System.out.println(binarySearch(arr,target1));
        System.out.println(binarySearchDesc(arr1,target2));
    }
    public static int binarySearch(int[] arr,int target)
    {
        int low = 0,high = arr.length-1;
        while(low<=high)
        {
            int mid = (low+high)/2;
            //int mid = low + (high - low)/2;
            if(arr[mid] == target)
                return mid;
            else if(arr[mid] > target)
                high = mid -1;
            else
                low = mid + 1;
        }
        return -1;
    }
    public static int binarySearchDesc(int[] arr,int target)
    {
        int low = 0,high = arr.length-1;
        while(low<=high)
        {
            int mid = low + (high - low)/2;
            if(arr[mid] == target)
            {
                return mid;
            }
            else if(arr[mid]>target)
                low = mid +1;
            else
                high = mid -1;
        }
        return -1;
    }
    /* sometimes it is unknown that the array is sorted in ascending or descending order
        in such cases you take the first and last element of array compare them and
        perform binary search accordingly. This is called order agnostic binary search.
     */

}
