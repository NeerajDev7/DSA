import java.util.ArrayList;
import java.util.List;

class Main
{
    public static void main(String[] args) {
        int n = 2;
        System.out.println(balPara(n));
    }
    public static List<String> balPara(int n)
    {
        List<String> res = new ArrayList<>();
        char[] arr = new char[n*2];
        generateBalPara(res,arr,n,0,0,0);
        return res;
    }
    public static void generateBalPara(List<String> res,char[] arr,int n,int i,int o,int c)
    {
        if(i == arr.length)
        {
            res.add( new String(arr));
            return;
        }
        if(o<n)
        {
            arr[i] = '(';
            generateBalPara(res,arr,n,i+1,o+1,c);
        }
        if(c<o)
        {
            arr[i] = ')';
            generateBalPara(res,arr,n,i+1,o,c+1);
        }
    }
}