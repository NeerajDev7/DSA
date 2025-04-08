import java.util.Arrays;

public class Insertion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int ele = 6,pos = 2;
        System.out.println(Arrays.toString(insert(arr,ele,pos)));
    }
    public static int[] insert(int[] arr, int ele,int pos)
    {
        int[] newArr = new int[arr.length+1];
        for(int i = 0;i<pos;i++)
        {
            newArr[i] = arr[i];
        }
        newArr[pos] = ele;
        for(int i = pos+1;i<newArr.length;i++)
        {
            newArr[i] = arr[i-1];
        }
        return newArr;
    }
}
