public class ReverseIndividualWords {
    public static void main(String[] args) {
        System.out.println(reverseWords("Martin Scorsese"));
    }
    public static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] arr = s.split(" ");
        for(int i = 0;i<arr.length;i++)
        {
            sb.append(reverse(arr[i]));
            if(i<arr.length-1)
            {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
    public static String reverse(String s)
    {
        char[] arr = s.toCharArray();
        for(int i = 0,j = arr.length-1;i<j;i++,j--)
        {
            char c = arr[i];
            arr[i] = arr[j];
            arr[j] = c;
        }
        return new String(arr);
    }
}
