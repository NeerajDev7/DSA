import java.util.HashSet;

public class CountDistinctElements {
    public static void main(String[] args) {
        int[] arr = {1,11,1,2,3,2,3,4,5,6,4};
        HashSet<Integer> s = new HashSet<>();
        for(int x : arr){
            s.add(x);
        }
        System.out.println(s.size());
    }
}
