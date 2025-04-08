public class StringPermutations {
    public static void main(String[] args) {
        String str = "ABC";
        generatePermutations(str, "");
    }
    public static void generatePermutations(String str, String prefix) {
        if(str.length() == 0)
        {
            System.out.println(prefix);
            return;
        }
        for(int i = 0;i<str.length();i++)
        {
            char currChar = str.charAt(i);
            String rem = str.substring(0,i) + str.substring(i+1);
            generatePermutations(rem,prefix+currChar);
        }
    }
}

