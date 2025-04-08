public class BrianKerningumAlgo {
    public static void main(String[] args) {
        System.out.println(brianKerningum(10));
    }
    public static int brianKerningum(int n)
    {
        int count = 0;
        while(n!=0)
        {
            n = n&(n-1);
            count++;
        }
        return count;
    }
}
