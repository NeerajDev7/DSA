public class SwappingNumbers {
    public static void main(String[] args) {
        int a = 5,b = 10;
        System.out.println(a+" "+b);
        swap(a,b);
    }
    public static void swap(int a,int b)
    {
        a = a^b;
        b = a^b;
        a =a^b;
        System.out.println(a+" "+b);
    }
}
