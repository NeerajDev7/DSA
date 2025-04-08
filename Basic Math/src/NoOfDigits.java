public class NoOfDigits {
    public static void main(String[] args) {
        System.out.println(countDigits(1232));
    }
    public static int countDigits(int n)
    {
        int c= 0;
        while(n!=0)
        {
            c++;
            n/=10;
        }
        return c;
    }
}
