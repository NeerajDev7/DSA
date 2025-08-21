public class DeleteLastNode {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node node1 = new Node(20);
        Node node2 = new Node(30);
        head.next = node1;
        node1.next = node2;
        Node h= DeleteLast(head);
        while(h!=null){
            System.out.println(h.data);
            h = h.next;
        }
    }
    public static Node DeleteLast(Node head){
        if(head == null)
            return null;
        if(head.next == null)
            return null;
        Node curr = head;
        while(curr.next.next!=null){
            curr = curr.next;
        }
        curr.next = null;
        return head;
    }
}
