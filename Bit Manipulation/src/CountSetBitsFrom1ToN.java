public class CountSetBitsFrom1ToN {
    public static void main(String[] args) {
        System.out.println(countSetBits(4));
    }
    public static int countSetBits(int n)
    {
        int count = 0;
        for(int i = 0;i<=n;i++)
        {
            int num = i;
            while(num!=0)
            {
                num = num&(num-1);
                count++;
            }
        }
        return count;
    }
}
