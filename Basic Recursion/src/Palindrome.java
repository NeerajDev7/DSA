public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("mom",0,2));
    }
    public static boolean isPalindrome(String str,int i,int j)
    {
        if(i>=j)
            return true;
        return (isPalindrome(str,i+2,j-1) && (str.charAt(i) == str.charAt(j)));
    }
}
