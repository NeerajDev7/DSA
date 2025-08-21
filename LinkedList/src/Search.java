import java.util.LinkedList;

public class Search {
    public static void main(String[] args) {
//        LinkedList<Integer> l = new LinkedList<>();
//        l.add(10);
//        l.add(20);
//        l.add(30);
//        System.out.println(l.contains(30));
        Node head = new Node(10);
        Node node1 = new Node(20);
        Node node2 = new Node(30);
        head.next = node1;
        node1.next = node2;
        System.out.println(Search(head,10));
    }
    public static int Search(Node head,int x){
        int pos = 1;
        Node curr = head;
        while(curr!=null){
            if(curr.data == x){
                return pos;
            }
            else {
                pos ++;
                curr = curr.next;
            }
        }
        return -1;
    }
}
