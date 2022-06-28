package linklist.sll;

public class AddOne {
    public static void main(String[] args) {
        SinglyLinkList linkList = new SinglyLinkList();
        linkList.insertAtTail(9);
        linkList.insertAtTail(9);
        linkList.insertAtTail(9);
        linkList.traverse();

        Node res = addOne(linkList.getHead());
        SLLUtil.traverse(res);
    }

    static Node addOne(Node head) {
        if (null == head) {
            return null;
        }

        Node reverseList = SLLUtil.reverse(head);
        Node cur = reverseList, last = null;
        int carry = 1;
        while (cur != null) {
            int curSum = cur.val + carry;
            int curVal = curSum % 10;
            carry = curSum / 10;

            cur.val = curVal;
            last = cur;
            cur = cur.next;
        }

        if (carry == 1) {
            Node newNode = new Node(1);
            last.next = newNode;
        }

        return SLLUtil.reverse(reverseList);
    }
}