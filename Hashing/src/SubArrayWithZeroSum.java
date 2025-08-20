import java.util.HashSet;

public class SubArrayWithZeroSum {
    public static void main(String[] args) {
        int[] a = {-3,4-3,-1,1};
        System.out.println(findSubArr(a));
    }
    public static boolean findSubArr(int[] a){
        HashSet<Integer> s = new HashSet<>();
        int pre_sum = 0;
        for(int i : a){
            pre_sum += i;
            if(s.contains(pre_sum))
                return true;
            if(pre_sum == 0)
                return true;
            s.add(pre_sum);
        }
        return false;
    }
}
