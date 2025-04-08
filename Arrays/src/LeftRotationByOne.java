import java.util.Arrays;

public class LeftRotationByOne {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(leftRotate(arr)));
    }
    public static int[] leftRotate(int[] arr)
    {
        int res = arr[0];
        for(int i = 1;i<arr.length;i++)
        {
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = res;
        return arr;
    }
}
