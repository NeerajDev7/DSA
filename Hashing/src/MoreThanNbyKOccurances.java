import java.util.HashMap;
import java.util.Map;

public class MoreThanNbyKOccurances {
    public static void main(String[] args) {
        int[] arr = {1,2,2,2,2,2,3,4,5};
        int n = arr.length;
        int k = 5;
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i : arr){
            h.put(i,h.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> e : h.entrySet()){
           if(e.getValue() > n/k )
               System.out.println(e.getKey() +" ");
        }
    }
}
