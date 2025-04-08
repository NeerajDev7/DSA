public class CountDigits {
    public static void main(String[] args) {
        System.out.println(countDigits(1234));
    }
    public static int countDigits(int n)
    {
        if(n==0)
            return 0;
        return countDigits(n/10)+1;
    }
}
