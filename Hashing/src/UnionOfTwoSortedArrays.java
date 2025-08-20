import java.util.HashSet;

public class UnionOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] a = {15,20,5,15};
        int[] b = {15,15,15,20,10};
        HashSet<Integer> s = new HashSet<>();
        for(int i :  a){
            s.add(i);
        }
        for(int i : b){
            s.add(i);
        }
        System.out.println(s.size());
    }
}
