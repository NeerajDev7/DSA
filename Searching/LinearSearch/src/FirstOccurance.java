public class FirstOccurance {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,5,5,6,7,8};
        int target = 5;
        System.out.println(findFirstOccurrence(arr,target));
    }
    public static int findFirstOccurrence(int[] arr,int target)
    {
        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
