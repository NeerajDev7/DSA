public class PrintPrimeFactors {
    public static void main(String[] args) {
        printPrimeFactors(13);
        printPrimeFactors(10);
    }
    public static void printPrimeFactors(int n)
    {
        while(n%2 == 0)
        {
            System.out.print(2+" ");
            n/=2;
        }
        while(n%3 == 0)
        {
            System.out.print(3+" ");
            n/=3;
        }
        for(int i = 5;i*i<=n;i+=6)
        {
            while(n%i == 0)
            {
                System.out.print(i+" ");
                n/=i;
            }
            while(n%(i+2) == 0)
            {
                System.out.print((i+2)+" ");
                n/=(i+2);
            }
        }
        if(n>3)
            System.out.print(n+" ");
        System.out.println();
    }
}
