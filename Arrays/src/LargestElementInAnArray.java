public class LargestElementInAnArray {
    public static void main(String[] args) {
        int[] arr = {12,23,2,34,56,56,97,43};
        System.out.println(largest(arr));
    }
    public static int largest(int[] arr)
    {
        int lar = 0;
        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i] > arr[lar])
                lar = i;
        }
        return lar;
    }
}
