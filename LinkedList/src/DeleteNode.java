public class DeleteNode {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node node1 = new Node(20);
        Node node2 = new Node(30);
        Node node3 = new Node(40);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        deleteNode(node2);
        Node curr = head;
        while(curr!=null){
            System.out.println(curr.data);
            curr = curr.next;
        }
    }
    public static void deleteNode(Node node){
        if(node == null || node.next == null)
            return;
        Node temp = node.next;
        node.data = node.next.data;
        node.next = node.next.next;
    }
}
