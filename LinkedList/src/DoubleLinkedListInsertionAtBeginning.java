public class DoubleLinkedListInsertionAtBeginning {
    public static void main(String[] args) {
        // create nodes
        DoubleLinkedListNode head = new DoubleLinkedListNode(10);
        DoubleLinkedListNode node1 = new DoubleLinkedListNode(20);
        DoubleLinkedListNode node2 = new DoubleLinkedListNode(30);

        // linking nodes manually
        head.next = node1;
        node1.prev = head;

        node1.next = node2;
        node2.prev = node1;

        // insert new node at the beginning
        head = insertAtBeginning(head, 5);

        // print list to verify
        printList(head);
    }

    // method to insert at beginning
    public static DoubleLinkedListNode insertAtBeginning(DoubleLinkedListNode head, int data) {
        DoubleLinkedListNode newNode = new DoubleLinkedListNode(data);
        newNode.next = head;   // newNode points to old head
        if (head != null) {
            head.prev = newNode; // old head points back to newNode
        }
        head = newNode; // update head
        return head;
    }

    // method to print list
    public static void printList(DoubleLinkedListNode head) {
        DoubleLinkedListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

class DoubleLinkedListNode {
    int data;
    DoubleLinkedListNode next;
    DoubleLinkedListNode prev;

    DoubleLinkedListNode(int data) {
        this.data = data;
    }
}
