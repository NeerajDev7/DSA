public class TraversingLinkedList {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node node1 = new Node(20);
        Node node2 = new Node(30);
        head.next = node1;
        node1.next = node2;
        printList(head);
    }
    public static void printList(Node head){
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
}
class Node{
    int data;
    Node next;
    Node(int x){
        this.data = x;
        next = null;
    }
}
