import java.util.Arrays;

public class MoveZeroesToEnd {
    public static void main(String[] args) {
        int[] arr = {0,0,1,0,0,2,0,0,3,0,0,4,5};
        System.out.println(Arrays.toString(moveZeroes(arr)));
    }
    public static int[] moveZeroes(int[] arr)
    {
        int c = 0;
        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                int temp = arr[i];
                arr[i] = arr[c];
                arr[c] = temp;
                c++;
            }
        }
        return arr;
    }
}
