package linklist.cll;

public class CLLCheckUtil {
    public static boolean isCLL(Node head) {
        if (null == head)
            return false;
        if (head.next == head)
            return true;

        Node cur = head.next;
        while (cur != null && cur != head) {
            cur = cur.next;
        }

        return cur == head;
    }

    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);

        node1.next = node2;
        node2.next = node3;
        //node3.next = node1; //- CLL

        Node head = node1;
        if (isCLL(head)) {
            System.out.println("Circular Linked List");
        } else {
            System.out.println("Singly Linked List");
        }
    }
}
