class ReverseWordsInaString
{
    public static void main(String[] ans) {
        String str = "Neeraj kumar Devaguptapu";
        reverseWords(str);
    }
    public static void reverseWords(String str)
    {
        String[] arr = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = arr.length-1;i>=0;i--)
        {
            if(arr[i].isEmpty())
                continue;
            if(sb.isEmpty())
                sb.append(arr[i]);
            else {
                sb.append(" ");
                sb.append(arr[i]);
            }
        }
        System.out.println(sb);
    }
}