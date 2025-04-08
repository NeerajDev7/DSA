public class FindFirstSetBit {
    public static void main(String[] args) {
        System.out.println(findFirstSetBit(4));
    }
    public static int findFirstSetBit(int n)
    {
        for(int i = 0;i<32;i++)
        {
            if((n&1<<i)!=0)
                return i+1;
        }
        return 0;
    }
}
