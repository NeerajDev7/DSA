public class AllocateBooks {
    public static void main(String[] args) {
        int[] arr= {25,46,28,49,24};
        int stu = 4;
        System.out.println(allocateBooks(arr,stu));
    }
    public static int allocateBooks(int[] arr,int stu)
    {
        int low = max(arr),high = sum(arr);
        while(low <=high)
        {
           int mid = low +(high - low)/2;
           int noOfStu = count(arr,mid);
           if(noOfStu > stu)
               low = mid + 1;
           else
               high = mid - 1;
        }
        return low;
    }
    public static int count(int[] arr,int pages)
    {
        int stu = 1,pagesCount = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(pagesCount + arr[i] <= pages)
            {
                pagesCount += arr[i];
            }
            else
            {
                stu ++;
                pagesCount = arr[i];
            }
        }
        return stu;

    }
    public static int max(int[] arr)
    {
        int max = Integer.MIN_VALUE;
        for(int i : arr)
        {
            max = Math.max(max,i);
        }
        return max;
    }
    public static int sum(int[] arr)
    {
        int sum = 0;
        for(int i : arr)
            sum += i;
        return sum;
    }
}
