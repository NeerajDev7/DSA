public class ReverseOfALinkedList {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node node1 = new Node(20);
        Node node2 = new Node(30);
        head.next = node1;
        node1.next = node2;
        Node h = reverseOfALinkedList(head);
        while(h!=null){
            System.out.println(h.data);
            h = h.next;
        }
    }
    public static Node reverseOfALinkedList(Node head){
        Node curr = head;
        Node prev = null;
        while (curr!=null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
