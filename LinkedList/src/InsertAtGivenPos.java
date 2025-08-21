public class InsertAtGivenPos {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node node1 = new Node(20);
        Node node2 = new Node(30);
        head.next = node1;
        node1.next = node2;
        Node h= insertPos(head,40,2);
        while(h!=null){
            System.out.println(h.data);
            h = h.next;
        }

    }
    public static Node insertPos(Node head,int x,int pos){
        Node temp = new Node(x);
        if(pos == 1){
            temp.next = head;
            return temp;
        }
        Node curr = head;
        for(int i = 1;i<=pos-2 && curr!=null;i++){
            curr = curr.next;
        }
        if(curr == null){
            return head;
        }
        temp.next = curr.next;
        curr.next = temp;
        return head;
    }
}
