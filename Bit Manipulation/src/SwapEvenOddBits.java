public class SwapEvenOddBits {
    public static void main(String[] args) {
        System.out.println(swapEvenOdd(181));
    }
    public static int swapEvenOdd(int n)
    {
        return ((n&0xAAAAAAAA)>>>1) | ((n&0x55555555)<<1);
    }
}
