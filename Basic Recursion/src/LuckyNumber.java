public class LuckyNumber {
    public static void main(String[] args) {
        System.out.println(isLucky(13,2));
    }
    public static boolean isLucky(int n,int c)
    {
        if(c>n)
            return true;
        if(n%c == 0)
            return false;
        return isLucky(n-n/c,c+1);
    }
}
