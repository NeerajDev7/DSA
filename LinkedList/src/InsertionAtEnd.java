class InsertionAtEnd{
    public static void main(String[] args) {
        Node head = new Node(10);
        Node node1 = new Node(20);
        Node node2 = new Node(30);
        head.next = node1;
        node1.next = node2;
        Node h = insertionAtEnd(head,40);
        while(h!=null){
            System.out.println(h.data);
            h = h.next;
        }

    }
    public static Node insertionAtEnd(Node head,int x){
        Node temp = new Node(x);
        if(head == null){
            return temp;
        }
        Node curr = head;
        while(curr.next!=null){
            curr = curr.next;
        }
        curr.next = temp;
        return head;
    }
}