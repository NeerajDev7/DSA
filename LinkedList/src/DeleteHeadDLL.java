public class DeleteHeadDLL {
    public static void main(String[] args) {
        DoubleLinkedListNode head = new DoubleLinkedListNode(10);
        DoubleLinkedListNode node1 = new DoubleLinkedListNode(20);
        DoubleLinkedListNode node2 = new DoubleLinkedListNode(30);

        // linking nodes manually
        head.next = node1;
        node1.prev = head;

        node1.next = node2;
        node2.prev = node1;
        head = DeleteHeadDLL(head);

        // print list to verify
        printList(head);
    }
    public static DoubleLinkedListNode DeleteHeadDLL(DoubleLinkedListNode head){
        if(head == null)
            return null;
        if(head.next == null)
            return null;
        else{
            head = head.next;
            head.prev = null;
        }
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
