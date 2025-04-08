import java.util.Arrays;

public class Deletion {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5};
        int pos = 2;
        System.out.println(Arrays.toString(delete(arr,pos)));
    }
    public static int[] delete(int[] arr,int pos)
    {
        for(int i = pos;i<arr.length-1;i++)
        {
            arr[i] = arr[i+1];
        }
        return Arrays.copyOf(arr,arr.length-1);
    }
}
