public class MostConsecutive1s {
    public static void main(String[] args) {
        System.out.println(mostConsecutive1s(7));
    }
    public static int mostConsecutive1s(int n)
    {
        int count = 0,res = 0;
        while(n!=0)
        {
            if((n&1)!=0)
                count++;
            else
                count = 0;
            res = Math.max(res,count);
            n>>=1;
        }
        return res;
    }
}
