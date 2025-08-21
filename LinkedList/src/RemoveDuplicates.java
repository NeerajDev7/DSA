import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node node1 = new Node(10);
        Node node2 = new Node(10);
        head.next = node1;
        node1.next = node2;
        Node h = removeDups(head);
        while(h!=null){
            System.out.println(h.data);
            h = h.next;
        }
    }
    public static Node removeDups(Node head){
        Node curr = head;
        while(curr!=null && curr.next!=null) {
            if (curr.data == curr.next.data) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        return head;
    }

}
