public class FIndFloorSquareRoot {
    public static void main(String[] args) {
        int n = 8;
        System.out.println(findFloorSquareRoot(n));
    }
    public static int findFloorSquareRoot(int n)
    {
        int low = 1,high = n,ans = 0;
        while(low<=high)
        {
            int mid = (low + high)/2;
            int midSq = mid * mid;
            if(midSq == n)
                return mid;
            else if( midSq >n)
                high = mid - 1;
            else
            {
                low = mid + 1;
                ans = mid;
            }
        }
        return ans;
    }
}
