public class CountSubSets {
    public static void main(String[] args) {
        int[] arr= {10,20,5,15};
        System.out.println(countSubsets(arr,25,0));
    }
    public static int countSubsets(int[] arr,int sum,int i)
    {
        if(sum == 0)
            return 1;
        if(i == arr.length)
            return 0;
        return countSubsets(arr,sum-arr[i],i+1) + countSubsets(arr,sum,i+1);
    }
}
