package linklist.sll;

public class PartionOddEven {
    public static void main(String[] args) {
        SinglyLinkList linkList = new SinglyLinkList();
        linkList.insertAtTail(1);
        linkList.insertAtTail(2);
        linkList.insertAtTail(6);
        linkList.insertAtTail(8);
        linkList.insertAtTail(5);
        linkList.insertAtTail(10);
        linkList.insertAtTail(13);

        linkList.traverse();

        Node partitionedList = partitionList(linkList.getHead());
        SLLUtil.traverse(partitionedList);

    }

    static Node partitionList(Node head) {
        if (null == head || head.next == null)
            return head;

        Node oddHead = new Node(-1);
        Node evenHead = new Node(-1);

        Node curOdd = oddHead, curEven = evenHead;
        Node cur = head;
        while (cur != null) {
            if (cur.val % 2 == 1) {
                curOdd.next = cur;
                curOdd = curOdd.next;
            } else {
                curEven.next = cur;
                curEven = curEven.next;
            }
            cur = cur.next;
        }

        Node temp1 = oddHead, temp2 = evenHead;
        curOdd.next = null;
        curEven.next = null;

        curOdd.next = evenHead.next;

        Node resultList = oddHead.next;
        temp1.next = null;
        temp2.next = null;

        return resultList;
    }
}
