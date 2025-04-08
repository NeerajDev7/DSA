public class PrintPrimeNumbers {
    public static void main(String[] args) {
        printPrime(100);
    }
    public static void printPrime(int range)
    {
        int i,j,count;
        for(i = 2;i<=range;i++)
        {
            count = 0;
            for(j=1;j<=i;j++)
            {
                if(i%j == 0)
                    count++;
            }
            if(count == 2)
                System.out.print(i+" ");
        }
    }
}
