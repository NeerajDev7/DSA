import java.util.Arrays;

public class TrappingRainWater {
    public static void main(String[] args) {
        int[] arr = {3,0,1,2,4};
        System.out.println(trappingRainWater(arr));
    }
    public static int trappingRainWater(int[] arr)
    {
        int[] leftMax = new int[arr.length];
        int[] rightMax = new int[arr.length];
        leftMax[0] = arr[0];
        for(int i = 1;i<arr.length;i++)
        {
            leftMax[i] = Math.max(arr[i],leftMax[i-1]);
        }
        System.out.println(Arrays.toString(leftMax));
        rightMax[arr.length-1] = arr[arr.length-1];
        for(int i = arr.length-2;i>=0;i--)
        {
            rightMax[i] = Math.max(arr[i],rightMax[i+1]);
        }
        System.out.println(Arrays.toString(rightMax ));
        int res = 0;
        for(int i = 1;i<=arr.length-1;i++)
        {
            res += (Math.min(leftMax[i],rightMax[i]))-arr[i];
        }
        return res;
    }
}
