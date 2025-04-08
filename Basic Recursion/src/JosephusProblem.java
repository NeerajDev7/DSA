public class JosephusProblem {
    public static void main(String[] args) {
        System.out.println(myJos(5,3));
    }
    public static int myJos(int n,int k)
    {
        return jos(n,k) + 1;
    }
    public static int jos(int n,int k)
    {
        if(n==1)
            return 1;
        return (jos(n-1,k)+k)%n;
    }
}
