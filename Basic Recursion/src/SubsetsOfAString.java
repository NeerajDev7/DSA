public class SubsetsOfAString {
    public static void main(String[] args) {
        printSubsets("abc"," ",0);
    }
    public static void printSubsets(String str,String ans,int i)
    {
        if(i == str.length())
        {
            System.out.print(ans+" ");
            return;
        }
        printSubsets(str,ans+str.charAt(i),i+1);
        printSubsets(str,ans,i+1);
    }
}
