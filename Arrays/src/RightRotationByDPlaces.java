import java.util.Arrays;

public class RightRotationByDPlaces {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int d = 2;
        System.out.println(Arrays.toString(rightRotation(arr,d)));
    }
    public static int[] rightRotation(int[] arr,int d)
    {
        int n = arr.length;
        reverse(0,n-1,arr);
        reverse(0,d-1,arr);
        reverse(d,n-1,arr);
        return arr;
    }
    public static void reverse(int i,int j,int[] arr)
    {
        while(i<j)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
