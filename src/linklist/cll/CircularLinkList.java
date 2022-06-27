package linklist.cll;

public class CircularLinkList {
    Node tail;

    public void insertAtTail(int val) {
        Node newNode = new Node(val);

        if (tail == null) {
            tail = newNode;
            tail.next = tail;
        } else {
            Node head = tail.next;
            tail.next = newNode;
            newNode.next = head;
            tail = newNode;
        }
    }

    public void traverse() {
        if (null == tail)
            return;
        if (tail.next == tail) {
            System.out.println(tail.val);
            return;
        }

        Node head = tail.next;
        Node cur = head;
        while (cur.next != head) {
            System.out.print(cur.val + "->");
            cur = cur.next;
        }

        System.out.println(tail.val);
    }

    public int length() {
        if (null == tail)
            return 0;
        if (tail.next == tail)
            return 1;

        Node head = tail.next;
        Node cur = head;
        int counter = 0;
        while (cur.next != head) {
            ++counter;
            cur = cur.next;
        }

        ++counter;
        return counter;
    }

    public void reverse() {
        
    }
}
