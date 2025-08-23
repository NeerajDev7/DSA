import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseOfAQueue {
    static Queue<Integer> q;
    static void print(){
        for(Integer i : q){
            System.out.println(i+" ");
        }
    }
    public static void main(String[] args) {
        q = new LinkedList<>();
        q.add(12);
        q.add(1);
        q.add(15);
        q.add(20);
        reverseQueue();
        print();
    }
    public static void reverseQueue(){
        Stack<Integer> s = new Stack<>();
        while(!q.isEmpty()){
            s.add(q.peek());
            q.remove();
        }
        while(!s.isEmpty()){
            q.add(s.peek());
            s.pop();
        }
    }
}
