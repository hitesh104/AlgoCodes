package linklist.sll;

public class AddTwoNumber {
    public static void main(String[] args) {
        SinglyLinkList linkList1 = new SinglyLinkList();
        linkList1.insertAtTail(9);
        linkList1.insertAtTail(9);
        linkList1.insertAtTail(9);
        linkList1.traverse();

        SinglyLinkList linkList2 = new SinglyLinkList();
        linkList2.insertAtTail(1);
        linkList2.insertAtTail(1);
        linkList2.traverse();

        Node res = addBothLinkList(linkList1.getHead(), linkList2.getHead());
        SLLUtil.traverse(res);
    }

    static Node addBothLinkList(Node list1, Node list2) {
        if (null == list1) {
            return list2;
        }

        if (null == list2) {
            return list1;
        }

        Node reverseList1 = SLLUtil.reverse(list1);
        Node reverseList2 = SLLUtil.reverse(list2);
        Node cur1 = reverseList1, cur2 = reverseList2, last = null;
        Node resList = new Node(-1), resCur = resList;
        int carry = 0;
        while (cur1 != null && cur2 != null) {
            int curSum = cur1.val + cur2.val + carry;
            int curVal = curSum % 10;
            carry = curSum / 10;

            resCur.next = new Node(curVal);
            resCur = resCur.next;

            cur1 = cur1.next;
            cur2 = cur2.next;
        }

        while (cur1 != null) {

        }

        if (carry == 1) {
            Node newNode = new Node(1);
            last.next = newNode;
        }

        return SLLUtil.reverse(reverseList1);
    }
}