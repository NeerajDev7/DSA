
public class  BinaryToDecimal {
    public static void main(String[] args) {
        System.out.println(binToDec("10110101"));
    }
    public static int binToDec(String str)
    {
        int dec = 0,base =1;
        for(int i = str.length()-1;i>=0;i--)
        {
            char bit = str.charAt(i);
            if(bit=='1')
                dec = dec + base;
            base = base*2;
        }
        return dec;
    }
}

