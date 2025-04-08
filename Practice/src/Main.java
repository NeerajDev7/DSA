public class Main {
    public static void main(String[] args) {
        Long n = 4545675443235l;
        String str = n.toString();
        int i = 0,c = 0;
        int len = str.length();
        while(i<len){
            if (str.charAt(i) == '5') {
                c++;
            }
            i++;
        }
        System.out.println(c);
    }
}


