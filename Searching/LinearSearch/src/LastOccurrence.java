public class LastOccurrence {
    public static void main(String[] args) {
        int[] arr = {2,23,2,3,4,5,4,34};
        int target = 2;
        System.out.println(lastOccurrence(arr,target));
    }
    public static int lastOccurrence(int[] arr,int target)
    {
        int ans = 0;
        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i] == target)
                ans = i;
        }
        return ans;
    }
}
