public class DecimalToBinary {
    public static void main(String[] args) {
        System.out.println(decToBin(10));
    }
    public static StringBuilder decToBin(int n)
    {
        StringBuilder str = new StringBuilder();
        while(n!=0)
        {
            n>>=1;
            str.append(n%2);
        }
        return str;
    }
}
