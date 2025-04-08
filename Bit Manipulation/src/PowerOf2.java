public class PowerOf2 {
    public static void main(String[] args) {
        System.out.println(powerOfTwo(4));
    }
    public static boolean powerOfTwo(int n)
    {
        return (n&(n-1)) == 0;
    }
}
