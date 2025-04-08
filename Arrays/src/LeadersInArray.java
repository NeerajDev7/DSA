import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LeadersInArray {
    public static void main(String[] args) {
        int[] arr = {7,10,4,3,6,5,2};
        System.out.println(leaders(arr));
    }
    public static List<Integer> leaders(int[] arr)
    {
        ArrayList<Integer> leaders = new ArrayList<>();
        int currLeader = arr[arr.length-1];
        leaders.add(currLeader);
        for(int i = arr.length-2;i>=0;i--)
        {
            if(currLeader<arr[i])
            {
                currLeader = arr[i];
                leaders.add(currLeader);
            }
        }
        Collections.reverse(leaders);
        return leaders;
    }

}
