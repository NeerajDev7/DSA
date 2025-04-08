public class SparseOrNot {
    public static void main(String[] args) {
        System.out.println(isSparse(3));
    }
    public static boolean isSparse(int n)
    {
        return (n&n>>1) == 0;

        // return (n&n<<1) == 0;
    }
}
