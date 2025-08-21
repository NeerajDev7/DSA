public class InsertionAtBeginning {
    public static void main(String[] args) {


//        Node head = new Node(10);
//        Node node1 = new Node(20);
//        Node node2 = new Node(30);
//        head.next = node1;
//        node1.next = node2;
//        Node node3 = new Node(40);
//        node3.next = head;
//        head = node3;
//        Node curr = head;
//        while (curr != null) {
//            System.out.println(curr.data);
//            curr = curr.next;
//        }


        Node head = null;
        head = insertAtBeginning(head,10);
        head = insertAtBeginning(head,20);
        head = insertAtBeginning(head,30);
        Node curr = head;
        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }

    }
    public static Node insertAtBeginning(Node head,int x){
        Node temp = new Node(x);
        temp.next = head;
        return temp;
    }

}

