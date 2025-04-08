public class MaxLengthOfEvenOddSubArray {
    public static void main(String[] args) {
        int[] arr = {5,2,1,2,4,6};
        System.out.println(maxLength(arr));
    }
    public static int maxLength(int[] arr)
    {
        int curr = 1,max = 1;
        for(int i = 1;i<arr.length;i++)
        {
            if((arr[i]%2==0 && arr[i-1]%2!=0) || (arr[i]%2!=0 && arr[i-1]%2 == 0))
            {
                curr++;
                max = Math.max(max,curr);
            }
            else {
                curr = 1;
            }
        }
        return max;
    }
}
