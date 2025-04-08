public class BinaryToGrey {
    public static void main(String[] args) {
        System.out.println(binToGrey(7));
    }
    public static int binToGrey(int n)
    {
        return n^n>>1;
    }
}
