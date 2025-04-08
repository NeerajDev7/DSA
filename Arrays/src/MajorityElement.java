public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {2,3,4,2,6,2,2};
        System.out.println(findMajority(arr));
    }
    public static int findMajority(int[] arr)
    {
        // MOORE'S VOTING ALGORITHM

        int count = 1;
        int res = 0;
        for(int i = 1;i<arr.length;i++)
        {
            if(arr[i] == arr[res])
            {
                count++;
            }
            else {
                count--;
            }
            if(count == 0)
            {
                count = 1;
                res = i;
            }
        }
        count = 0;
        for(int i = 0;i<arr.length;i++)
        {
            if(arr[res] == arr[i])
                count++;
        }
        if(count<=arr.length/2)
            return -1;
        return arr[res];
    }
}
