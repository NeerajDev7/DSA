public class CheckSubSequence {
    public static void main(String[] args) {
        System.out.println(isSubSequence("raj","neeraj"));
    }
    public static boolean isSubSequence(String s1,String s2)
    {
        int m = s1.length();
        int n = s2.length();
        if(n<m)
            return false;
        int j = 0;
        for(int i = 0;i<n && j<m;i++)
        {
            if(s1.charAt(j) == s2.charAt(i))
                j++;
        }
        return j == m;
    }
}
