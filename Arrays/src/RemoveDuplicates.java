import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {10,10,20,20,20,30,40,40,50,50,50};
        System.out.println(Arrays.toString(removeDuplicates(arr)));
    }
    public static int[] removeDuplicates(int[] arr)
    {
        int res = 1;
        for(int i = 1;i<arr.length;i++)
        {
            if(arr[i]!= arr[res-1])
            {
                arr[res] = arr[i];
                res++;
            }
        }
        return Arrays.copyOf(arr,res);
    }
}
