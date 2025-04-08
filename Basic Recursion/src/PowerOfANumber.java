public class PowerOfANumber {
    public static void main(String[] args) {
        System.out.println(power(5,3));
    }
    public static long power(long n,long p)
    {
        long res  =0;
        if(p==0)
            return 1;
        if(p%2 == 0)
        {
            res = power(n,p/2);
            return res*res;
        }
        return n*power(n,p-1);
    }
}
