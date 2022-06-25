package linklist.dll;

public class DoublyLinkList {
    DNode head, tail;

    public void insertAtTail(int val) {
        DNode newNode = new DNode(val);

        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void traverseForward() {
        if (null == head)
            return;

        DNode cur = head;
        while (cur != null) {
            System.out.print(cur.val + "-");
            cur = cur.next;
        }

        System.out.print("null");
        System.out.println();
    }

    public void traverseBackward() {
        if (null == head)
            return;

        DNode cur = tail;
        while (cur != null) {
            System.out.print(cur.val + "-");
            cur = cur.prev;
        }

        System.out.print("null");
        System.out.println();
    }

    public void insertAtPosition(int pos, int val) {
        if (pos < 0 || pos > length())
            return;
        if (pos == 0) {
            // insert at the head
            return;
        }
        if (pos == length()) {
            insertAtTail(val);
            return;
        }

        int counter = 0;
        DNode cur = head, prev = null;

        while (counter != pos && cur != null) {
            ++counter;
            prev = cur;
            cur = cur.next;
        }
        DNode newNode = new DNode(val);
        newNode.prev = prev;
        newNode.next = cur;

        prev.next = newNode;
        cur.prev = newNode;
    }

    public int length() {
        if (null == head)
            return 0;
        if (head == tail)
            return 1;
        DNode cur = head;
        int counter = 0;
        while (cur != null) {
            ++counter;
            cur = cur.next;
        }
        return counter;
    }
}
