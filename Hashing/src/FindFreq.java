import java.util.HashMap;
import java.util.Map;

public class FindFreq {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3,3,3,5,6,6,4,7,8};
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int x : arr){
            h.put(x,h.getOrDefault(x,0)+1);
        }
        for(Map.Entry<Integer,Integer> e : h.entrySet()){
            System.out.println(e.getKey() +" "+e.getValue());
        }
    }
}
