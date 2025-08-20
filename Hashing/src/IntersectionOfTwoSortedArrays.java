import java.util.HashSet;

public class IntersectionOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] a = {10, 15, 20, 25, 30, 50};
        int[] b = {30, 5, 15, 80};
        printCommon(a,b);
    }
    public static void printCommon(int[] a,int[] b){
        HashSet<Integer> s = new HashSet<>();
        for(int i = 0;i<b.length;i++){
            s.add(b[i]);
        }
        for(int i = 0;i<a.length;i++){
            if(s.contains(a[i])){
                System.out.print(a[i]+" ");
            }
        }
    }
}
