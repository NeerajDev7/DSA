public class TowersOfHanoi {
    public static void main(String[] args) {
        TOH(3,'a','b','c');
    }
    public static void TOH(int n,char src,char aux,char dest)
    {
        if(n==1)
        {
            System.out.println(src+"-->"+dest);
            return;
        }
        TOH(n-1,src,dest,aux);
        TOH(1,src,aux,dest);
        TOH(n-1,aux,src,dest);
    }
}
