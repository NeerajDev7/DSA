public class KadanesAlgorithm {
    public static void main(String[] args) {
        int[] arr = {-5,-1,1,-9,-3,-2,-11};
        System.out.println(maxSubArraySum(arr));
    }
    public static int maxSubArraySum(int[] arr)
    {
        int sum = arr[0];
        int maxSum = arr[0];
        for(int i = 1;i<arr.length;i++)
        {
            if(sum>=0)
            {
                sum += arr[i];
            }
            else {
                sum = arr[i];
            }
            maxSum = Math.max(sum,maxSum);
        }
        return maxSum;
    }
}
