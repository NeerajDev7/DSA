import java.util.*;
public class ReplaceElementWithTheGreatestElementOnTheRight {
    public static void main(String[] args) {
        int[] arr ={17,18,5,4,6,1};
        System.out.println(Arrays.toString(replaceElement(arr)));
    }
    public static int[] replaceElement(int[] arr)
    {
        int max = -1;
        int n = arr.length;
        for(int i = n-1;i>=0;i--)
        {
            int curr = arr[i];
            arr[i] = max;
            if(curr>max)
            {
                max = curr;
            }
        }
        return arr;
    }

}
