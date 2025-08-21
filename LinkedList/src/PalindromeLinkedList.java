public class PalindromeLinkedList {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node node1 = new Node(20);
        Node node2 = new Node(10);
        head.next = node1;
        node1.next = node2;
        System.out.println(isPalindrome(head));
    }
    public static boolean isPalindrome(Node head){
        if(head == null)
            return true;
        Node slow = head,fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node rev = reverseList(slow.next);
        Node curr = head;
        while(rev!=null){
            if(rev.data != curr.data){
                return false;
            }
            rev = rev.next;
            curr = curr.next;
        }
        return true;
    }
    public static Node reverseList(Node head){
        Node curr = head;
        Node prev = null;
        while (curr!=null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
