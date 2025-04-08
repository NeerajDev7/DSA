public class RightMostDifferentBit {
    public static void main(String[] args) {
        System.out.println(rightMostDifferentBit(5,7));
    }
    public static int rightMostDifferentBit(int a,int b)
    {
        int xor = a^b;
        int res =0;
        while(xor!=0)
        {
            res++;
            if((xor&1)!=0)
                break;
            xor>>=1;
        }
        if(res == 0)
            return -1;
        return res;
    }
}
