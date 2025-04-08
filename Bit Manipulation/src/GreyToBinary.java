public class GreyToBinary {
    public static void main(String[] args) {
        System.out.println(greyToBin(4));
    }
    public static int greyToBin(int n) {
        int res = n;
        while(n!=0)
        {
            n>>=1;
            res^=n;
        }
        return res;
    }
}
