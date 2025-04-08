public class CheckPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("abba"));
        System.out.println(isPalindrome("Neeraj"));
    }
    public static boolean isPalindrome(String str)
    {
        int i = 0, j = str.length()-1;
        while(i<j)
        {
            if(str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
