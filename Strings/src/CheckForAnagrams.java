public class CheckForAnagrams {
    public static void main(String[] args) {
        System.out.println(isAnagram("Shutter island","truth and lies"));
        System.out.println(isAnagram("Andrew laeddis","Edward daniels"));
    }

    public static boolean isAnagram(String str1, String str2) {
        str1 = str1.replaceAll("\\s","").toLowerCase();
        str2 = str2.replaceAll("\\s","").toLowerCase();

        if (str1.length() != str2.length())
            return false;

        int[] arr = new int[26];

        for(int i = 0;i<str1.length();i++)
        {
            int ch1 = str1.charAt(i) - 97;
            int ch2 = str2.charAt(i) - 97;
            arr[ch1]++;
            arr[ch2]--;
        }
        for(int var : arr)
        {
            if(var!=0)
                return false;
        }
        return true;
    }
}
