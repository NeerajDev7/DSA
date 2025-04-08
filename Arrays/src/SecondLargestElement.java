public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {7,7,7,7,7};
        System.out.println(secondLargest(arr));
    }
    public static int secondLargest(int[] arr)
    {
        int lar = 0,res = -1;
        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i] > arr[lar])
            {
                res = lar;
                lar = i;
            }
            else if(arr[i]!=arr[lar])
            {
                if(res == -1 || arr[res] < arr[i])
                {
                    res = i;
                }
            }
        }
        return res;
    }
}
