public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorialOf(5));
    }
    public static int factorialOf(int n)
    {
        int fact = 1;
        for(int i = n;i>=1;i--)
        {
            fact*=i;
        }
        return fact;
    }
}
