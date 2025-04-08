public class XorProperties {
    public static void main(String[] args) {
        int l = 4,r = 8;
        System.out.println(findXor(l,r));
    }
    public static int findXor(int l,int r)
    {
        return xorHelper(l-1)^xorHelper(r);
    }
    public static int xorHelper(int n)
    {
        int res = n%4;
        if(res == 0)
            return n;
        if(res == 1)
            return 1;
        if(res == 2)
           return n+1;
        else
            return 0;

    }

}
