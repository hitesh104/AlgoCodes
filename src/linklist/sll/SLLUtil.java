package linklist.sll;

public class SLLUtil {

    public static void traverse(Node head) {
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

    public static int length(Node head) {
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

    public static Node getMiddle(Node head) {
        if (null == head) {
            System.out.println("List is empty");
            return null;
        }
        if (null == head.next || null == head.next.next) {
            System.out.println("Middle value :: " + head.val);
            return head;
        }

        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next; // 1 jump
            fast = fast.next.next; // 2 jump
        }

        System.out.println("Middle value :: " + slow.val);
        return slow;
    }

    public static Node reverse(Node head) {
        if (head == null || head.next == null)
            return head;
        Node prev = null, cur = head, temp = null;

        while (cur != null) {
            temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }

        return prev;
    }
}
