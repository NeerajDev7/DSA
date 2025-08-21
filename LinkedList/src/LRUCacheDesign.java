import java.security.DrbgParameters;
import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCacheDesign<K,V> extends LinkedHashMap<K,V>{
    private int capacity;
    public LRUCacheDesign(int capacity){
        super(capacity,0.75f,true);
        this.capacity = capacity;
    }
    public static void main(String[] args){
        LRUCacheDesign<String,Integer> StuMap = new LRUCacheDesign<>(3);
        StuMap.put("Neeraj",99);
        StuMap.put("Nick",88);
        StuMap.put("Globetrotter",100);
        StuMap.get("Neeraj");
        StuMap.put("Mahesh Babu",100);
        StuMap.put("SS Rajamouli",1000);
        System.out.println(StuMap);
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacity;
    }
}
