public class DeleteHead {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node node1 = new Node(20);
        Node node2 = new Node(30);
        head.next = node1;
        node1.next = node2;
        Node h= DeleteHead(head);
        while(h!=null){
            System.out.println(h.data);
            h = h.next;
        }
    }
    public static Node DeleteHead(Node head){
        if(head == null)
            return null;
        else
            return head.next;
    }
}
