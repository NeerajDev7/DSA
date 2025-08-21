public class DetectAndRemoveLoops {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node node1 = new Node(20);
        Node node2 = new Node(30);
        head.next = node1;
        node1.next = node2;
        node2.next = head; // loop created

        detectAndRemoveLoops(head);

        // print list after loop removal
        Node curr = head;
        while(curr != null){
            System.out.println(curr.data);
            curr = curr.next;
        }
    }

    public static void detectAndRemoveLoops(Node head){
        Node slow = head, fast = head;

        // Step 1: Detect loop
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                break;
            }
        }

        // No loop
        if(slow != fast){
            return;
        }

        // Step 2: Find start of loop
        slow = head;
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        Node loopStart = slow;

        // Step 3: Find the last node of loop
        Node ptr = loopStart;
        while(ptr.next != loopStart){
            ptr = ptr.next;
        }

        // Step 4: Break the loop
        ptr.next = null;
    }
}
