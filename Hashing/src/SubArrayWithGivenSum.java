import java.util.HashSet;

public class SubArrayWithGivenSum {
    public static void main(String[] args) {
        int[] a = {-3,4,3,-1,1};
        int sum = 0;
        System.out.println(findSubArr(a,sum));
    }
    public static boolean findSubArr(int[] a,int sum){
        HashSet<Integer> s = new HashSet<>();
        int pre_sum =0;
        for(int i : a){
            pre_sum += i;
            if(pre_sum == sum)
                return true;
            if(s.contains(pre_sum))
                return true;
            s.add(pre_sum);
        }
        return false;
    }
}
