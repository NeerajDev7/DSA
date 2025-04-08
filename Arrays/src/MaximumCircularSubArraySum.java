public class MaximumCircularSubArraySum {
    public static void main(String[] args) {
        int[] arr = {8,-4,3,-5,4};
        System.out.println(maxCircularSubArraySum(arr));
    }
    public static int maxCircularSubArraySum(int[] arr)
    {
        int nonCircularMax = kadane(arr);
        int totalSum = 0;
        for(int i = 0;i<arr.length;i++)
        {
            totalSum += arr[i];
            arr[i] = -arr[i];
        }
        int minSubArraySum = kadane(arr);
        int circularMax= totalSum + minSubArraySum;
        if(circularMax == 0)
            return nonCircularMax;
        return Math.max(circularMax,nonCircularMax);
    }
    public static int kadane(int[] arr)
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
