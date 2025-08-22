public class InsertAtEndDLL {
    public static void main(String[] args) {
        DoubleLinkedListNode head = new DoubleLinkedListNode(10);
        DoubleLinkedListNode node1 = new DoubleLinkedListNode(20);
        DoubleLinkedListNode node2 = new DoubleLinkedListNode(30);

        // linking nodes manually
        head.next = node1;
        node1.prev = head;

        node1.next = node2;
        node2.prev = node1;
        head = insertAtEnd(head, 5);

        // print list to verify
        printList(head);
    }
    public static DoubleLinkedListNode insertAtEnd(DoubleLinkedListNode head,int data){
        DoubleLinkedListNode temp = new DoubleLinkedListNode(data);
        if(head == null)
            return temp;
        DoubleLinkedListNode curr = head;
        while(curr.next!=null){
            curr = curr.next;
        }
        curr.next = temp;
        temp.prev = curr;
        return head;
    }
    public static void printList(DoubleLinkedListNode head) {
        DoubleLinkedListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
