public class KokoEatingBananas {
    public static void main(String[] args) {
        int[] arr = {3,6,7,11};
        System.out.println(kokoEatingBananas(arr,8));
    }
    public static int kokoEatingBananas(int[] arr,int limit)
    {
        int low = 1,high = max(arr),ans = Integer.MAX_VALUE;
        while(low<=high)
        {
            int mid = low +(high - low)/2;
            int totalHours = hourlySpeed(arr,mid);
            if(totalHours<=limit)
            {
                ans = Math.min(ans,mid);
                high = mid -1;
            }
            else {
                low = mid + 1;
            }
        }
        return ans;
    }
    public static int hourlySpeed(int[] arr,int hours)
    {
        int totalHours = 0;
        for(int i : arr)
        {
            totalHours += Math.ceil((double)i/hours);
        }
        return totalHours;
    }
    public static int max(int[] arr)
    {
        int max = 0;
        for(int i : arr)
        {
            max = Math.max(max,i);
        }
        return max;
    }
}
