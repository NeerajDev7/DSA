public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {23,3,4,3,2,45};
        int target = 3;
        System.out.println(linearSearch(arr,target));
    }
    public static int linearSearch(int[] arr,int target)
    {
        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i] == target)
                return i;
        }
        return -1;
    }
}
