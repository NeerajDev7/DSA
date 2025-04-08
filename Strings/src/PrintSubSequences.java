public class PrintSubSequences {
    public static void main(String[] args) {
        printSubSeq("abc","",0);
    }
    public static void printSubSeq(String str,String curr,int index)
    {
        if(index == str.length())
        {
            System.out.println(curr);
            return;
        }
        printSubSeq(str,curr,index+1);
        printSubSeq(str,curr+str.charAt(index),index+1);
    }
}
