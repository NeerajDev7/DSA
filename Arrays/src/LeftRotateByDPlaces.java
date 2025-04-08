import java.util.Arrays;

public class LeftRotateByDPlaces {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int d = 2;
        System.out.println(Arrays.toString(leftRotate(arr,d)));
    }
    public static int[] leftRotate(int[] arr,int d)
    {
        reverse(0,d-1,arr);
        reverse(d,arr.length-1,arr);
        reverse(0,arr.length-1,arr);
        return arr;
    }
    public static void reverse(int i,int j,int[] arr)
    {
        while(i<j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
