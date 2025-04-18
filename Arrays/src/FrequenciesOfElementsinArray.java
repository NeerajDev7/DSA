import java.util.Arrays;

public class FrequenciesOfElementsinArray {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,10,20,40,50};
        freq(arr);
    }
    public static void freq(int[] arr)
    {
        Arrays.sort(arr);
        int n = arr.length;
        int freq = 1,i = 1;
        while(i<n)
        {
            while(i<n && arr[i] == arr[i-1])
            {
                freq++;
                i++;
            }
            System.out.println(arr[i-1]+"-->"+freq);
            i++;
            freq = 1;
        }
        if(n==1 || arr[n-1]!=arr[n-2])
            System.out.println(arr[n-1]+"-->"+1);
    }
}
