import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr = {12,21,43,53,32,9};
        System.out.println(Arrays.toString(reverse(arr)));
    }
    public static int[] reverse(int[] arr)
    {
        int temp;
        for(int i = 0,j = arr.length-1;i<j;i++,j--)
        {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }
}
