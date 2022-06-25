package linklist.sll;

import java.util.HashSet;
import java.util.Set;

public class SinglyLinkList {
    Node head;

    public Node createList(int n) {
        if (n <= 0)
            return null;

        head = new Node(1);
        Node cur = head;

        for (int curVal = 2; curVal <= n; curVal++) {
            Node newNode = new Node(curVal);
            cur.next = newNode;
            cur = cur.next;
        }

        return head;
    }

    public void insertAtHead(int v) {
        System.out.println("Adding value :: " + v + " at the Head");
        Node newNode = new Node(v);
        if (null == head) {
            head = newNode;
            return;
        }

        Node secondNode = head;
        head = newNode;
        head.next = secondNode;
    }

    public void insertAtTail(int v) {
        Node newNode = new Node(v);
        if (null == head) {
            head = newNode;
            return;
        }

        Node cur = head, last = null;
        while (cur != null) {
            last = cur;
            cur = cur.next;
        }

        last.next = newNode;
    }

    public void insertAtPosition(int pos, int v) {
        if (pos < 0 || pos > length())
            return;
        if (pos == 0) {
            insertAtHead(v);
            return;
        }
        if (pos == length()) {
            insertAtTail(v);
            return;
        }

        int counter = 0;
        Node cur = head, prev = null;
        while (counter != pos && cur != null) {
            ++counter;
            prev = cur;
            cur = cur.next;
        }

        Node newNode = new Node(v);
        prev.next = newNode;
        newNode.next = cur;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public void traverse() {
        if (null == head) {
            System.out.println("null");
            return;
        }

        Node cur = head;
        while (cur != null) {
            System.out.print(cur.val + "->");
            cur = cur.next;
        }

        System.out.print("null");
        System.out.println();
    }

    public int length() {
        if (null == head)
            return 0;
        int counter = 0;
        Node cur = head;
        while (cur != null) {
            ++counter;
            cur = cur.next;
        }

        return counter;
    }

    public void reverse() {
        if (head == null || head.next == null)
            return;
        Node prev = null, cur = head, temp = null;

        while (cur != null) {
            temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }

        head = prev;
    }

    public void printMiddle() {
        if (null == head) {
            System.out.println("List is empty");
            return;
        }
        if (null == head.next || null == head.next.next)
            System.out.println("Middle value :: " + head.val);

        Node slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; // 1 jump
            fast = fast.next.next; // 2 jump
        }

        System.out.println("Middle value :: " + slow.val);
    }

    public void deleteMiddle() {
        if (null == head)
            return;
        if (null == head.next) { // 1 node case
            head = null;
            return;
        }

        Node slow = head, fast = head;
        Node prevSlow = null;

        while (fast != null && fast.next != null) {
            prevSlow = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prevSlow.next = slow.next;
        slow.next = null;
    }

    public boolean detectLoop() {
        if (head == null || head.next == null)
            return false;
        if (head.next == head)
            return true;

        Set<Node> set = new HashSet<>();
        Node cur = head;

        while (cur != null) {
            if (set.contains(cur))
                return true;
            set.add(cur);
            cur = cur.next;
        }
        return false;
    }
}
