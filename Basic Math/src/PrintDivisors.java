public class PrintDivisors {
    public static void main(String[] args) {
        printDivisors(20);
    }
    public static void printDivisors(int n)
    {
        int i;
        for(i = 1;i<=n;i++)
        {
           if(n%i == 0)
               System.out.print(i+" ");
        }
        i--;
        for(;i>=1;i--)
        {
            if(n%i == 0)
                System.out.print(n/i+" ");
        }
    }
}
