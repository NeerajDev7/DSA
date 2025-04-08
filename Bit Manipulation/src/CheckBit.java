public class CheckBit {
    public static void main(String[] args) {
        System.out.println(checkBit(5,2));
    }
    public static boolean checkBit(int n,int k)
    {
        for(int i = 0;i<k-1;i++)
        {
            n>>=1;
        }
        if((n&1)!=0)
            return true;
        else return false;
    }
}
