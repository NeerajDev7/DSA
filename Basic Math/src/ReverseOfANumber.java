public class ReverseOfANumber {
    public static void main(String[] args) {
        System.out.println(reverseOfANumber(1234));
    }
    public static int reverseOfANumber(int n)
    {
        int rem = 0,rev = 0;
        while(n!=0)
        {
            rem = n%10;
            rev = rev*10 + rem;
            n/=10;
        }
        return rev;
    }
}
