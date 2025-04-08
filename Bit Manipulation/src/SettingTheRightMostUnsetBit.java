public class SettingTheRightMostUnsetBit {
    public static void main(String[] args) {
        System.out.println(setBit(5));
    }
    public static int setBit(int n)
    {
        for(int i = 0;i<32;i++)
        {
            if((n&(1<<i))==0)
            {
                return  n | 1<<i;
            }
        }
        return n;

        // OR

        // return n | (n+1);
    }
}
