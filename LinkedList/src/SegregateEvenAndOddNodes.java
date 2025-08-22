public class SegregateEvenAndOddNodes {
    public static void main(String[] args) {
        Node head = new Node(1);
        Node node1 = new Node(2);
        Node node2 = new Node(3);
        Node node3 = new Node(4);
        Node node4 = new Node(5);

        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        Node curr = segregateNode(head);

        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }

    public static Node segregateNode(Node head) {
        int x;
        Node es = null, ee = null, os = null, oe = null;

        for (Node curr = head; curr != null; curr = curr.next) {
            x = curr.data;
            if (x % 2 == 0) { // even
                if (es == null) {
                    es = ee = curr;
                } else {
                    ee.next = curr;
                    ee = ee.next;
                }
            } else { // odd
                if (os == null) {
                    os = oe = curr;   // ✅ fix here
                } else {
                    oe.next = curr;
                    oe = oe.next;
                }
            }
        }

        if (os == null || es == null) {
            return head;
        }

        ee.next = os;
        oe.next = null;

        return es;  // head of new list (starting with evens)
    }
}
