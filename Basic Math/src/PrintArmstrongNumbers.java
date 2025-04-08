public class PrintArmstrongNumbers {
    public static void main(String[] args) {
        printArmstrong(500);
    }
    public static void printArmstrong(int n)
    {
        int flag,rem,res;
        for(int i = 1;i<=n;i++)
        {
            flag = i;
            rem = 0;
            res = 0;
            while(flag!=0)
            {
                rem = flag%10;
                res = res + rem*rem*rem;
                flag/=10;
            }
            if(res == i)
                System.out.print(i+" ");
        }
    }
}
