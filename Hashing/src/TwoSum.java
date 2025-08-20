import java.util.HashSet;
import java.util.Set;

public class TwoSum {
    public static void main(String[] args) {
        int[] a = {5,8,-3,6};
        int sum = 3;
        System.out.println(TwoSum(a,sum));
    }
    public static boolean TwoSum(int[] a,int sum){
        Set<Integer> s= new HashSet<>();
        for(int i : a){
            if(s.contains(sum-i))
                return true;
            else
                s.add(i);
        }
        return false;
    }
}
