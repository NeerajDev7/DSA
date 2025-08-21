public class PairWiseSwapNodes {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node node1 = new Node(20);
        Node node2 = new Node(30);
        Node node3 = new Node(40);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        Node h = pairWiseSwapNodes(head);
        while(h!=null){
            System.out.print(h.data +" ");
            h = h.next;
        }
    }
    public static Node pairWiseSwapNodes(Node head){
        if(head == null || head.next == null)
            return head;
        Node curr = head.next.next;
        Node prev = head;
        head = head.next;
        head.next = prev;
        while(curr!=null && curr.next!=null){
            prev.next = curr.next;
            prev = curr;
            Node next = curr.next.next;
            curr.next.next = curr;
            curr = next;
        }
        prev.next = curr;
        return head;
    }
}
